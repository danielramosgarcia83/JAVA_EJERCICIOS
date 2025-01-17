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

        Figura3D_v2 esfera = new Esfera_v2(1.0f);
        Figura3D_v2 prismaRec = new PrismaRectangular_v2(2, 4, 10);
        Figura3D_v2 cilindro = new Cilindro(2.0f, 4.0f);
        System.out.printf("El superficie de la ESPERA es %.2f \n", esfera.superficie());
        System.out.printf("El superficie del PRISMA RECTANGULAR es %.2f \n", prismaRec.superficie());
        System.out.printf("El superficie del PRISMA RECTANGULAR es %.2f \n", cilindro.superficie());

        if (esfera.superficie() > prismaRec.superficie() && esfera.superficie() > cilindro.superficie()) {
            System.out.printf("La esfera ocupa más superficie (SUPERFICIE %.2f) \n", esfera.superficie());
        } else if (prismaRec.superficie() > esfera.superficie() && prismaRec.superficie() > cilindro.superficie()) {
            System.out.printf("El PRISMA RECTANGULAR ocupa más superficie (SUPERFICIE %.2f) \n", prismaRec.superficie());
        } else {
            System.out.printf("El Cilindro ocupa más superficie (SUPERFICIE %.2f) \n", prismaRec.superficie());
        }
    }
}

abstract class Figura3D_v2 {

    public abstract float volumen();

    public abstract float superficie();
}

class Esfera_v2 extends Figura3D_v2 {
    private float radio;

    Esfera_v2(float radio) {
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
        return (float) (4 * Math.PI * Math.pow(radio, 2));
    }

}

class PrismaRectangular_v2 extends Figura3D_v2 {
    private float largo;
    private float ancho;
    private float altura;

    PrismaRectangular_v2(float largo, float ancho, float altura) {
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
        return 2 * (largo * ancho + ancho * altura + largo * altura);
    }

}

class Cilindro extends Figura3D_v2 {
    private float radio; // Radio de la base del cilindro
    private float altura; // Altura del cilindro

    // Constructor
    public Cilindro(float radio, float altura) {
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public float volumen() {
        // Fórmula: π * r^2 * h
        return (float) (Math.PI * Math.pow(radio, 2) * altura);
    }

    @Override
    public float superficie() {
        // Fórmula: 2πrh + 2πr^2
        return (float) (2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2));
    }
}
