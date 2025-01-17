/*
10.1. Copia la última versión de las clases de los primeros ejercicios: Figura2D, Triangulo, TrianColor
y Rectangulo (añade sufijo _v9) y realiza los siguientes cambios:

• Crea un método abstracto llamado area () en Figura2D que ha de implementarse en las clases hijas.
• Crea un método precio (float precioMetroCuadrado) en la clase Figura2D, que use el método abstracto anterior.
• Verificar que las clases hijas implementan el método area (). ¿Qué ocurriría si no lo tuviesen implementado?
• Haz un programa que almacene figuras de los tres tipos en un ArrayList y finalmente se recorra el
ArrayList con un for-each mostrando el precio de cada figura, suponiendo un precio de 10 euros el metro cuadrado.
 */
package drgt10;
import java.util.ArrayList;

public class DRGt10e1 {
    public static void main(String[] args) {

        ArrayList<Figura2D_v9> figuras = new ArrayList<>();
        figuras.add(new Rectangulo_v9("Rectangulo", 2, 4));
        figuras.add(new Triangulo_v9("Triangulo", "Isoseles", 3, 5));
        figuras.add(new TrianColor_v9("TrianguloColor", "Color", 4, 6, "Rojo"));

        for (Figura2D_v9 figura : figuras) {
            System.out.println(figura.precioMetroCuadrado());
        }
    }
    /* CONSIDERACIONES:
    Si las clases hijas no implementan los metodos abstract de la super, dara error,
    al menos que se le convierta tambien en abstract a esas clases hijas
    */

}