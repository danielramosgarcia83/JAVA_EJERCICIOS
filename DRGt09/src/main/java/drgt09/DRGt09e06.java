package drgt09;

import java.util.Scanner;

/*
9.6. Modificar el programa anterior para que el usuario tenga un Array de 5 teléfonos, y que
después de elegir la operación a realizar pueda elegir con cuál de los 5 teléfonos desea hacerla.
 */
public class DRGt09e06 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion, accion;
        MovilPrepago moviles[] = crearmovil();

        //Menu tarifa
        do {
            System.out.println("/////////////////////////");
            System.out.println("Seleccionar Operacion");
            System.out.println("1) Efectuar Llamada");
            System.out.println("2) Navegar");
            System.out.println("3) Recargar");
            System.out.println("4) ConsultarSaldo");
            System.out.println("5) Efectuar VideoLlamada");
            System.out.println("0) Salir");
            System.out.println("/////////////////////////");

            accion = Integer.parseInt(teclado.nextLine());
            switch (accion) {
                case 1, 2, 3, 4, 5 -> {
                    System.out.println("Seleciona un movil");

                    for (int i = 0; i < moviles.length; i++) {
                        System.out.printf("%d) %s Saldo: %.2f \n", i + 1, moviles[i].getClass().getSimpleName(), moviles[i].consultarSaldo());
                    }
                    System.out.println("0) Atras");

                    opcion = Integer.parseInt(teclado.nextLine());

                    //Este IF evita salirse del rango del array
                    if (opcion > 0 && opcion <= moviles.length) {
                        //Ha elegido un movil correctamente
                        MovilPrepago movilseleccionado = moviles[opcion - 1];

                        if (accion == 5 && !(movilseleccionado instanceof MovilPlus)) {
                            System.out.println("Disponible solo en MovilPlus");
                        } else {
                            switch (accion) {
                                case 1 -> {
                                    System.out.println("Segundos de la Llamada?:");
                                    int seg = Integer.parseInt(teclado.nextLine());
                                    movilseleccionado.efectuarLlamada(seg);
                                }
                                case 2 -> {
                                    System.out.println("MB Navegacion:");
                                    int mb = Integer.parseInt(teclado.nextLine());
                                    movilseleccionado.navegar(mb);
                                }
                                case 3 -> {
                                    System.out.println("Cuanto recargar?:");
                                    int importe = Integer.parseInt(teclado.nextLine());
                                    movilseleccionado.recargar(importe);
                                }
                                case 4 -> {
                                    System.out.println("El saldo es:");
                                    System.out.println(movilseleccionado.consultarSaldo());
                                }
                                case 5 -> {
                                    MovilPlus movilAux = (MovilPlus) movilseleccionado;
                                    System.out.println("Segundos de la Video Llamada?:");
                                    int seg = Integer.parseInt(teclado.nextLine());
                                    movilAux.videollamada(seg);
                                }
                            }
                        }
                    } else {
                        if (opcion != 0) {
                            System.out.println("Movil No existe");
                        }
                    }
                }

                case 0 -> {
                    System.out.println("Programa cerrado");
                }
                default -> {
                    System.out.println("Operacion Invalida");
                }
            }
        } while (accion != 0);

    }

    private static MovilPrepago[] crearmovil() {
        MovilPrepago moviles[] = new MovilPrepago[5];
        moviles[0] = new MovilPrepago(111111, 0.5f, 1f, 20);
        moviles[1] = new MovilTarifaPlana(222222, 1.1f, 25);
        moviles[2] = new MovilTarifaPlana(333333, 1.4f, 30);
        moviles[3] = new MovilPlus(444444, 1.5f, 35, 2.5f);
        moviles[4] = new MovilPrepago(555555, 0.8f, 1.2f, 40);
        return moviles;
    }
}
