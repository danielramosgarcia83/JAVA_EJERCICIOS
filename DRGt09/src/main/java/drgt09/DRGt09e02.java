package drgt09;
import java.util.Scanner;
/*
9.2. Realiza un programa que permita al usuario seleccionar un tipo de figura (Triangulo o Rectangulo),
luego llame al constructor adecuado solicitando al usuario los parámetros necesarios, dependiendo del tipo de figura.

• Después de crear la figura, mostrará las dimensiones de la misma (sea cual sea su tipo).

•Finalmente, y utilizando el operador instanceof, mostrará unos datos adicionales dependiendo del tipo de figura que sea:

- Si es de tipo Triangulo, mostrará el área.
- Si es de tipo Rectangulo, mostrará si es de forma cuadrada o no.

• Usar una única variable para almacenar la figura, sea del tipo que sea.
 */

//Esta es una version, en la que he intentado usar cosas aprendidas en temas anteriores, no se sí esta bien
//Me encantaria saber su opinion, la version B, es mucho mas basica ajustada estrictamente al enunciado

public class DRGt09e02 {

    static Scanner teclado = new Scanner(System.in);
    static String datos[] = new String[4];
    static int option;

    public static void main(String[] args) {
        Figura2D_v8 crea_figura;

        menu();

        if (option == 1) {
            crea_figura = new Triangulo_v8(datos[0], datos[3], Integer.parseInt(datos[1]), Integer.parseInt(datos[2]));
            crea_figura.verDim();
            if (crea_figura instanceof Triangulo_v8) {
                ((Triangulo_v8) crea_figura).getArea();
            }
        } else if (option == 2) {
            crea_figura = new Rectangulo_v8(datos[0], Integer.parseInt(datos[1]), Integer.parseInt(datos[2]));

            crea_figura.verDim();
            if (crea_figura instanceof Rectangulo_v8) {
                Rectangulo_v8 rectangulo = (Rectangulo_v8) crea_figura;

                if (rectangulo.esCuadrado()) {
                    System.out.println("Es cuadrado");
                } else {
                    System.out.println("No es cuadrado");
                }
            }
        }
    }

    private static int menu() {
        do {
            System.out.println("Elige que figura deseas crear \n 1) Triangulo. \n 2) Rectangulo. \n 0) Salir.");
            option = Integer.parseInt(teclado.nextLine());

            switch (option) {
                case 1 -> {
                    System.out.println("Haz elegido crear un Triangulo");
                    datos = datosFigura();
                }
                case 2 -> {
                    System.out.println("Haz elegido crear un Rectangulo");
                    datos = datosFigura();
                }
                case 0 -> {
                    System.out.println("programa cerrado");
                    return 0;
                }
                default ->
                    System.out.println("Opcion invalida");
            }
        } while (option < 0 || option > 2);
        return option;
    }

    private static String[] datosFigura() {
        //Nombre
        System.out.println("Introduce el nombre Figura");
        datos[0] = teclado.nextLine();
        //Alto
        System.out.println("Introduce el Alto");
        datos[1] = teclado.nextLine();
        //Ancho
        System.out.println("Introduce el Ancho");
        datos[2] = teclado.nextLine();
        if (option == 1) {
            
            //Estilo triangulo
            System.out.println("Introduce el nombre Estilo");
            datos[3] = teclado.nextLine();
        }
        return datos;
    }
}
