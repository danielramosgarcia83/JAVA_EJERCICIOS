package drgt09;

import java.util.Scanner;

/*
9.5. Empleando las clases previas: MovilPrepago, MovilTarifaPlana, MovilPlus realizar un
programa que inicialmente permita seleccionar al usuario qué tipo de tarifa tiene entre las tres
posibles, luego configurará el móvil solicitando al usuario los parámetros necesarios y finalmente
presentará al usuario un menú para realizar las operaciones permitidas (navegar, llamar, recargar,
videollamar, ver saldo y salir) según el tipo de tarifa.
 */
public class DRGt09e05 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion, accion;
        MovilPrepago movil;
        //Menu tarifa
        do {
            System.out.println("MENU MOVILES");
            System.out.println("Seleccionar tipo de tarifa");
            System.out.println("1) MovilPrepago");
            System.out.println("2) MovilTarifaPlana");
            System.out.println("3) MovilPlus");
            System.out.println("0) Salir");
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1, 2, 3 -> {
                    movil = crearmovil(opcion);
                    do {
                        accion = menuOperaciones(movil);
                        if (accion == 1) {
                            System.out.println("Segundos de la Llamada?:");
                            int seg = Integer.parseInt(teclado.nextLine());

                            movil.efectuarLlamada(seg);
                        }
                        if (accion == 2) {
                            System.out.println("MB Navegacion:");
                            int mb = Integer.parseInt(teclado.nextLine());

                            movil.navegar(mb);
                        }
                        if (accion == 3) {
                            System.out.println("Cuanto recargar?:");
                            int importe = Integer.parseInt(teclado.nextLine());
                            movil.recargar(importe);
                        }
                        if (accion == 4) {
                            System.out.println("El saldo es:");
                            System.out.println(movil.consultarSaldo());
                        }
                        if (accion == 5) {
                            MovilPlus movilAux = (MovilPlus) movil;
                            System.out.println("Segundos de la Video Llamada?:");
                            int seg = Integer.parseInt(teclado.nextLine());
                            movilAux.videollamada(seg);
                        }
                    } while (accion!=0);
                }
                case 0 -> {
                    System.out.println("Programa cerrado");
                }
                default -> {
                    System.out.println("Opcion Invalida");
                }
            }
        } while (opcion != 0);
    }
    private static int menuOperaciones(MovilPrepago mov) {

        int operacion;
        System.out.println("Seleccionar Operacion");
        System.out.println("1) Efectuar Llamada");
        System.out.println("2) Navegar");
        System.out.println("3) Recargar");
        System.out.println("4) ConsultarSaldo");

        if (mov instanceof MovilPlus) {
            System.out.println("5) Efectuar VideoLlamada");
        }
        System.out.println("0) Salir");
        operacion = Integer.parseInt(teclado.nextLine());
        return operacion;
    }
    
    private static MovilPrepago crearmovil(int op) {
        long numeroMovil;
        float costeMinutoLlamada, costeConsumoMB, saldo, costeConsumoVL;
        MovilPrepago tipoMovil;

        //Parametros comunes
        //Numero movil / costeMinutoLlamada / saldo
        System.out.println("Ingresar numero movil");
        numeroMovil = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingregar saldo");
        saldo = Float.parseFloat(teclado.nextLine());

        switch (op) {
            case 1 -> {
                //Parametros adicionales MovilPrepago
                System.out.println("**MovilPrepago**");
                System.out.println("Ingresar coste minuto llamada");
                costeMinutoLlamada = Float.parseFloat(teclado.nextLine());
                System.out.println("Ingregar Coste MB");
                costeConsumoMB = Float.parseFloat(teclado.nextLine());
                return tipoMovil = new MovilPrepago(numeroMovil, costeMinutoLlamada, costeConsumoMB, saldo);
            }
            case 2 -> {
                //Parametros adicionales MovilTarifaPlana
                System.out.println("**MovilTarifaPlana**");
                System.out.println("Ingresar coste minuto llamada");
                costeMinutoLlamada = Float.parseFloat(teclado.nextLine());
                return tipoMovil = new MovilTarifaPlana(numeroMovil, costeMinutoLlamada, saldo);
            }
            case 3 -> {
                //Parametros adicionales MovilPlus
                System.out.println("**MovilPlus**");
                System.out.println("Ingregar Coste MB");
                costeConsumoMB = Float.parseFloat(teclado.nextLine());
                System.out.println("Ingregar Coste VideoLlamada");
                costeConsumoVL = Float.parseFloat(teclado.nextLine());
                return tipoMovil = new MovilPlus(numeroMovil, costeConsumoMB, saldo, costeConsumoVL);
            }
        }
        return null;
    }
}
