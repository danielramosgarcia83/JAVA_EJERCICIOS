package drgt09;
//@author Daniel

/*

9.1. Realiza un programa con una variable de tipo Figura2D_v8, y sobre ella
llama a uno de los constructores de Triangulo_v8. Muestra sus dimensiones y
el cálculo del área.

 */
public class DRGt09e01 {

    public static void main(String[] args) {
        Figura2D_v8 triangulo = new Triangulo_v8("Triangulo", 4);

        System.out.println("Dimensiones");
        triangulo.verDim();
        System.out.println("///////");

        System.out.println("Area");
        if (triangulo instanceof Triangulo_v8) {
            ((Triangulo_v8) triangulo).getArea();
        }
        System.out.println("Estilo");
        if (triangulo instanceof Triangulo_v8) {
            ((Triangulo_v8) triangulo).estilo();

        }

    }
}
