/*
10.3. Haz una nueva versión de las clases del ejercicio anterior (añádele el sufijo _v2).
Añádele a la clase base el método abstracto superficie ().
Crea una nueva clase Cilindro y haz que implemente los métodos de la superclase.
Haz un programa que permita crear una instancia de cada una de las 3
figuras y nos muestre cuál tiene más superficie
 */
package drgt10;

public class DRGt10e3 {
    public static void main(String[] args) {

        Figura3D_v2 esfera = new Esfera_v1(1.0);
        Figura3D_v2 prismaRec = new PrismaRectangular_v1(2, 4, 10);
        System.out.printf("El volumen de la ESPERA es %.2f \n",esfera.volumen());
        System.out.printf("El volumen del PRISMA RECTANGULAR es %.2f \n",prismaRec.volumen());
        
        if (esfera.volumen()>prismaRec.volumen()) {
            System.out.printf("La ESFERA ocupa más (VOLUMEN %.2f) \n", esfera.volumen());
        } else {
            System.out.printf("El PRISMA RECTANGULAR ocupa más (VOLUMEN %.2f) \n", prismaRec.volumen());
            
        }

    }
}
    abstract class Figura3D_v2 {

        public abstract float volumen();
        public abstract float superficie();
    }

    class Esfera_v1 extends Figura3D_v2 {
        private double radio;

        Esfera_v1(double radio) {
            this.radio = radio;
        }
        @Override
        public float volumen() {
            // V = 4/3 π r³
            return (float) ((4.0 / 3) * Math.PI * Math.pow(this.radio, 3));
        }
        @Override
        public float superficie() {
            // 4 π r 2
            throw new UnsupportedOperationException("Unimplemented method 'superficie'");
        }

    }

    class PrismaRectangular_v1 extends Figura3D_v2 {
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

        @Override
        public float superficie() {
            // 2(ab+bc+ac)
            throw new UnsupportedOperationException("Unimplemented method 'superficie'");
        }

    }

    class Cilindro extends Figura3D_v2{

        @Override
        public float volumen() {
            // El volumen de un cilindro es π r² h
            throw new UnsupportedOperationException("Unimplemented method 'volumen'");
        }

        @Override
        public float superficie() {
            // superficie es 2π r h + 2π r²
            throw new UnsupportedOperationException("Unimplemented method 'superficie'");
        }}
