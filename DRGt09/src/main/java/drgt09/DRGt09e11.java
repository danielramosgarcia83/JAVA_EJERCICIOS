/*
9.11. Partiendo de clases del ejercicio 8.9 (CuentaCorriente, CuentaPlazo), haz un programa con un
menú que permita gestionar unas cuentas bancarias que se almacenan en un ArrayList (añadir
cuenta, eliminar cuenta, ingresos y, retiradas) siempre accediendo por un identificador que tendrá
cada cuenta.
 */
package drgt09;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Daniel
 */
public class DRGt09e11 {

    public static Scanner teclado = new Scanner(System.in);
    public static ArrayList<CuentaCorriente> cuentas = new ArrayList<>();
    public static String id, cuenta;

    public static void main(String[] args) {
        int opcion, tipo;
        float importe;

        do {
            System.out.println("MENU GESTION DE CUENTAS");
            System.out.println("1)AÑADIR CUENTA");
            System.out.println("2)ELIMINAR CUENTA");
            System.out.println("3)INGRESOS");
            System.out.println("4)RETIROS");
            System.out.println("5)SALIR");
            System.out.println("ELIGA UNA OPCION:");

            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1 -> {
                    //1 AÑADIR
                    //TIPO: CTE O PLAZO?
                    System.out.println("ID Cuenta");
                    id = teclado.nextLine();
                    System.out.println("1)IBAN");
                    cuenta = teclado.nextLine();
                    System.out.println("1)Cuenta Corriente");
                    System.out.println("2)Cuenta Plazo");
                    tipo = Integer.parseInt(teclado.nextLine());

                    crearCuenta(tipo);
                }
                case 2 -> {
                    //2 Eliminar cuenta
                    System.out.println("ID Cuenta a Eliminar");
                    id = teclado.nextLine();
                    if (cuentas.remove(new CuentaCorriente(id, "", 0))) {
                  //if (cuentas.remove(buscarPlaza(id))) {
                        System.out.printf("Cuenta ID %s  Eliminada\n", id);

                    } else {
                        System.out.printf("ID %s no encontrado\n", id);

                    }

                    System.out.println(cuentas);
                }
                case 3 -> {
                    //INGRESOS
                    System.out.println("ID Cuenta a Ingresar");
                    id = teclado.nextLine();
                    System.out.println("Importe a Ingresar");
                    importe = Float.parseFloat(teclado.nextLine());
                    cuentas.get(buscarPlaza(id)).ingresar(importe);
                    System.out.println(cuentas);
                }
                case 4 -> {
                    //RETIROS
                    System.out.println("ID Cuenta a Retirar");
                    id = teclado.nextLine();
                    System.out.println("Importe a Retirar");
                    importe = Float.parseFloat(teclado.nextLine());
                    cuentas.get(buscarPlaza(id)).retirar(importe);
                    System.out.println(cuentas);
                }
                case 5 -> {
                    //SALIR
                    System.out.println("Programa cerrado");
                }
                default -> {
                    System.out.println("Opcion Invalida");
                }
            }

            //3 Ingresar
            //cuentas.get(((int)cuentas.indexOf(new CuentaCorriente("1", "", 0)))).ingresar(10);
            //
            //cuentas.get(0).retirar(0);
        } while (opcion != 5);
    }//FIN MAIN

    public static int buscarPlaza(String plaza) {
        return cuentas.indexOf(new CuentaCorriente(plaza, "", 0));
    }

    public static void crearCuenta(int tipo) {
        switch (tipo) {
            case 1 -> {
                //Creando cuenta corriente
                System.out.println("% Comision");
                float comsion = Float.parseFloat(teclado.nextLine());
                cuentas.add(new CuentaCorriente(id, cuenta, comsion));
                System.out.println(cuentas);
            }
            case 2 -> {
                //Creando cuenta Plazo
                cuentas.add(new CuentaPlazo(id, cuenta));
                System.out.println(cuentas);
            }
            default ->
                System.out.println("Opcion Invalida");
        }

    }
}//FIN PROGRAMA
