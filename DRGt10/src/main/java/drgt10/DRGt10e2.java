/*
10.2. Diseña una clase abstracta llamada Figura3D_v1 con método abstracto volumen ().
Crea subclases: Esfera_v1 y PrismaRectangular_v1 que implementen el método de la superclase.
Incorpora los atributos que creas necesarios a las tres clases.
Haz un programa que cree una instancia de cada una de las 2 figuras y muestre cuál de ellas ocupa más.
 */
package drgt10;

public class DRGt10e2 {
    public static void main(String[] args) {

        Figura3D_v1 esfera = new Esfera_v1(1.0);
        Figura3D_v1 prismaRec = new PrismaRectangular_v1(2, 4, 10);
        System.out.printf("El volumen de la ESPERA es %.2f \n",esfera.volumen());
        System.out.printf("El volumen del PRISMA RECTANGULAR es %.2f \n",prismaRec.volumen());
        
        if (esfera.volumen()>prismaRec.volumen()) {
            System.out.printf("La ESFERA ocupa más (VOLUMEN %.2f) \n", esfera.volumen());
        } else {
            System.out.printf("El PRISMA RECTANGULAR ocupa más (VOLUMEN %.2f) \n", prismaRec.volumen());
            
        }

    }
}
    abstract class Figura3D_v1 {

        public abstract float volumen();
    }

    class Esfera_v1 extends Figura3D_v1 {
        private double radio;

        Esfera_v1(double radio) {
            this.radio = radio;
        }
        @Override
        public float volumen() {
            // V = 4/3 π r³
            return (float) ((4.0 / 3) * Math.PI * Math.pow(this.radio, 3));
        }

    }

    class PrismaRectangular_v1 extends Figura3D_v1 {
        private float largo;
        private float ancho;
        private float altura;

        PrismaRectangular_v1(float largo, float ancho, float altura) {
            this.largo = largo;
            this.ancho = ancho;
            this.altura = altura;
        }

        @Override
        public float volumen() {
            // Multiplicamos el largo del prisma por su ancho y por su altura.
            return (float) (this.largo * this.ancho * this.altura);
        }

    }
