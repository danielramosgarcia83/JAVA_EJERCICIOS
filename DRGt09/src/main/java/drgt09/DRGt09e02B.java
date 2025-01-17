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


//Esta es una version basica, ceñido estrictamente al enunciado:

public class DRGt09e02B {

    public static void main(String[] args) {

        Scanner teclado2 = new Scanner(System.in);
        Figura2D_v8 figura;
        String nombre, estilo;
        int opcion, altura = 0, ancho = 0;
        System.out.println("MENU FIGURAS 2D");
        System.out.println("ELIGE UNA OPCION");
        System.out.println("1) TRIANGULO");
        System.out.println("2) RECTANGULO");

        opcion = Integer.parseInt(teclado2.nextLine());

        {
            switch (opcion) {
                case 1 -> {
                    System.out.println("HAS ELEGIDO TRIANGULO");
                    System.out.println("NOMBRE:");
                    nombre = teclado2.nextLine();

                    System.out.println("ESTILO");
                    estilo = teclado2.nextLine();

                    System.out.println("ALTURA");
                    altura = Integer.parseInt(teclado2.nextLine());

                    System.out.println("ANCHO");
                    ancho = Integer.parseInt(teclado2.nextLine());

                    figura = new Triangulo_v8(nombre, estilo, altura, ancho);
                    if (figura instanceof Triangulo_v8) {
                        figura.verDim();
                        ((Triangulo_v8) figura).getArea();
                    }
                }
                case 2 -> {
                    System.out.println("HAS ELEGIDO RECTANGULO");
                    System.out.println("NOMBRE:");
                    nombre = teclado2.nextLine();

                    System.out.println("ALTURA");
                    altura = Integer.parseInt(teclado2.nextLine());

                    System.out.println("ANCHO");
                    ancho = Integer.parseInt(teclado2.nextLine());
                    figura = new Rectangulo_v8(nombre, altura, ancho);
                    if (figura instanceof Rectangulo_v8) {
                        figura.verDim();
                        boolean esCuadrado = ((Rectangulo_v8) figura).esCuadrado();
                        if (esCuadrado) {
                            System.out.println("Es Cuadrado");
                        } else {
                            System.out.println("No es Cuadrado");
                        }
                    }
                }
            }

        }
    }
}
