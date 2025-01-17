package drgt09;

import java.util.Scanner;

/*
9.3. Modificar el ejercicio anterior para añadir a las figuras posibles el Triancolor. Así pues, el
usuario seleccionará entre: Triangulo, Triancolor, Rectangulo.
• Después de crear la figura, mostrará las dimensiones de la misma (sea cual sea su tipo). •
Finalmente, y utilizando el operador instanceof, mostrará unos datos adicionales dependiendo
del tipo de figura que sea:
- Si es de tipo Triangulo, mostrará el área (sea Triancolor o no).
- Si es de tipo Rectangulo, mostrará si es de forma cuadrada o no.
- Si es de tipo Triancolor, mostrará el color.
 */
public class DRGt09e03 {

    public static void main(String[] args) {

        Scanner teclado2 = new Scanner(System.in);
        Figura2D_v8 figura;
        String nombre, estilo, color;
        int opcion, altura = 0, ancho = 0;
        System.out.println("MENU FIGURAS 2D");
        System.out.println("ELIGE UNA OPCION");
        System.out.println("1) TRIANGULO");
        System.out.println("2) TRIANCOLOR");
        System.out.println("3) RECTANGULO");

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
                    //    public TrianColor_v8(String nom, String e,double an,double a,String c) {

                    System.out.println("HAS ELEGIDO TRIANCOLOR");
                    System.out.println("NOMBRE:");
                    nombre = teclado2.nextLine();

                    System.out.println("ESTILO");
                    estilo = teclado2.nextLine();

                    System.out.println("ALTURA");
                    altura = Integer.parseInt(teclado2.nextLine());

                    System.out.println("ANCHO");
                    ancho = Integer.parseInt(teclado2.nextLine());

                    System.out.println("COLOR:");
                    color = teclado2.nextLine();
                    figura = new TrianColor_v8(nombre, estilo, altura, ancho, color);
                    if (figura instanceof TrianColor_v8) {
                        figura.verDim();
                        System.out.println(((TrianColor_v8) figura).getColor()
                        );
                    }
                }
                case 3 -> {
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
