package drgt09;

import java.util.ArrayList;

/*
9.4. Realiza un programa que contenga un ArrayList de figuras2D de cualquiera de sus tipos e
introduce valores “a mano”, por ejemplo, un par de instancias de cada tipo. A continuación, el
programa:
• Sumar el área de todas ellas. ¿Tienen implementado el método área () todas ellas? •
Contar cuantos triángulos (sean de color o no) y cuantos rectángulos.
- Si es de tipo Triancolor, mostrará el color.
 */
public class DRGt09e04 {

    public static void main(String[] args) {

        ArrayList<Figura2D_v8> figura = new ArrayList<>();
        //Triangulos
        figura.add(new Triangulo_v8("Triangulo", "Isoseles", 3, 4));
        figura.add(new Triangulo_v8("Triangulo", "rectangulo", 5, 5));

        //Triancolor
        figura.add(new TrianColor_v8("Triangulo", "Isoseles", 3, 4, "rojo"));
        figura.add(new TrianColor_v8("Triangulo", "rectangulo", 5, 5, "azul"));

        //rectangulos
        figura.add(new Rectangulo_v8("Rectangulo", 3, 4));
        figura.add(new Rectangulo_v8("Cuadrado", 4, 4));
        double suma_area = 0;
        int t = 0, r = 0;

        for (Figura2D_v8 figuras : figura) {
            if (figuras instanceof Triangulo_v8) {
                suma_area += ((Triangulo_v8) figuras).getArea();
                t++;
                if (figuras instanceof TrianColor_v8) {
                    System.out.printf("Color %s \n",((TrianColor_v8) figuras).getColor());
                }
            } else if (figuras instanceof Rectangulo_v8) {
                suma_area += ((Rectangulo_v8) figuras).getArea();
                r++;
            }
        }
        System.out.printf("Suma del Area de todas las figuras es %.2f \n",suma_area);
        System.out.printf("Cantidad de triangulos %d \n",t);
        System.out.printf("Cantidad de rectangulos %d \n",r);

    }
}
