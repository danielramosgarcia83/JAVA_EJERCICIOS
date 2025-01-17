package drgt08;

import java.util.Scanner;

/**
 * @author Daniel
 *
 * 8.9. Copia la clase _CuentaCorriente que te proporcionará el profesor con un
 * nombre nuevo, por ejemplo, CuentaCorriente y realiza las siguientes
 * operaciones: • Crea una clase hija llamada CuentaPlazo igual que la anterior,
 * pero sin comisiones. Además, tiene un nuevo atributo, que es la fecha de
 * creación. • Esta nueva clase ya no permitirá que haya subclases de ella. •
 * Crea constructor para la nueva clase que incorpore la inicialización de la
 * fecha de creación al día en curso. • Sobrescribe el método retirar () para
 * que no que no calcule comisiones. Revisa los modificadores de acceso de
 * atributos y quizás tengas que crear algún getter/setter. • Haz un programa
 * que cree inicialmente una cuenta a plazo y luego, mediante un menú, permita
 * ingresar, retirar y consultar el saldo.
 */
public class DRGt08e09 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int option;
        CuentaPlazo cuenta1 = new CuentaPlazo("ES92-1234");
        System.out.printf("Cuenta creada %s %n %n",cuenta1.getFecha().toString());

        do {
            System.out.println("***Menu Cuenta Plazo***");
            System.out.println("***Elige una opción:***");
            System.out.println("***(1) Ingresar***");
            System.out.println("***(2) Retirar***");
            System.out.println("***(3) Consultar el saldo***");
            System.out.println("***(0) Salir***");
            System.out.println("***Ingresa una opción:***");
            option = Integer.parseInt(teclado.nextLine());

            switch (option) {
                case 1 ->cuenta1.ingresar(100);
                case 2 -> cuenta1.retirar(50);
                case 3 -> System.out.println(cuenta1.getSaldo());
                case 0 -> {
                    System.out.println("Programa cerrado.");
                    break;}
                default -> System.out.println("Opción invalida");
            }
        } while (option != 0);

    }
}
