package drgt08;
/**
 * @author Daniel
 * 8.1. Realiza las siguientes operaciones:
 * • Crea una clase llamada Figura2D con atributos numéricos con decimales y públicos: ancho y alto y un método
 * verDim que muestre por consola el alto y el ancho en una sola línea, con dos decimales. 
 * • Define una clase llamada Triángulo que es hija de Figura2D y añádele una cadena llamada estilo
 * (vale: isósceles, rectángulo, equilátero, etc.), un método llamado área que devuelva la
 * superficie del triángulo y un último método llamado isósceles que muestre por consola el valor del atributo estilo.
 * • Finalmente hacer un programa que cree un triángulo, asigne valores a sus atributos y
 * use los métodos para ver sus dimensiones, estilo y área.
 */
public class DRGt08e01 {
    public static void main(String[] args) {
        Triangulo isoceles = new Triangulo("Isosceles");
        isoceles.ancho=5.0;
        isoceles.alto=5.0;
        isoceles.verDim();
        isoceles.getArea();
        isoceles.estilo(); 
    }
}

class Figura2D {
    public double ancho, alto;
    public void verDim() {
        System.out.println("Ancho: " + Math.round(this.ancho*100/100d) + " y su Alto: " + Math.round(this.alto*100/100d));

    }
}

class Triangulo extends Figura2D{
    public String estilo;
    
    public Triangulo(String e){
        this.estilo=e;    
    }
    
    public void getArea(){
        double superficie =(this.alto*this.ancho)/2;
        System.out.println("La superficie es: "+superficie);
    }
    public void estilo(){
        System.out.println("Estilo: "+this.estilo);
    }
}