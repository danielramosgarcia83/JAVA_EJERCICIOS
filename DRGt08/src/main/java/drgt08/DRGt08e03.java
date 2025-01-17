package drgt08;
/**
 * @author Daniel
 * 
 * 8.3. Copia las clases anteriores como una nueva versión de las mismas (añade sufijo _v3) y realiza
 * los siguientes cambios:
 * • Añade un constructor a la clase Triangulo al que se le pasan tres parámetros: estilo, alto y ancho.
 * • Se invocará al constructor por defecto de la clase base.
 * • Modificar el programa de los ejercicios anteriores para que los triángulos sean creados mediante este nuevo constructor.

 */
public class DRGt08e03 {
    public static void main(String[] args) {
        Triangulo_v3 isoceles = new Triangulo_v3("Isosceles",5.0,5.0);
        isoceles.verDim();
        isoceles.getArea();
        isoceles.estilo(); 
    }
}

class Figura2D_v3
{
    public double ancho, alto;
    
 void verDim()
 {
        System.out.println("Ancho: " + Math.round(this.ancho*100/100d) + " y su Alto: " + Math.round(this.alto*100/100d));
 }
 
}

class Triangulo_v3 extends Figura2D_v3{
    public String estilo;

    public Triangulo_v3(String e,double an, double al) {
        super();
        this.ancho=an;
        this.alto=al;
        this.estilo = e;
    }
    
    
   
    public void getArea(){
        double superficie =(this.ancho*this.alto)/2;
        System.out.println("La superficie es: "+superficie);
    }
    public void estilo(){
        System.out.println("Estilo: "+this.estilo);
    }
}