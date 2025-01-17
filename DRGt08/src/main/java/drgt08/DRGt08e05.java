package drgt08;
/**
 * @author Daniel
 * 8.5. Copia las clases anteriores como una nueva versión de las mismas (añade sufijo _v5) y realiza los siguientes cambios:
 * 
 * • Añade un constructor más a la clase Figura2D, a este se le pasa solo un parámetro que se le asigna
 * tanto al alto como al ancho (figura igual alto que ancho).
 * 
 * • Hacer el constructor sin parámetros (ya no se crea por defecto) en este caso tanto alto como ancho igual a cero.
 * 
 * • Añade a la clase Triangulo también un constructor sin parámetros, que invoque al constructor
 * sin parámetros de la clase base (aunque se hace por defecto) y que ponga el estilo a null.
 * 
 * • Añade otro constructor a la clase Triangulo, con un solo parámetro, para aquellos que tienen
 * igual alto que ancho (en este caso el estilo será ‘igualBaseAltura’).
 * 
 * Haz un programa similar a los de ejercicios anteriores pero que use las nuevas características incorporadas en este ejercicio.
 */

public class DRGt08e05 {
    public static void main(String[] args) {
        //Utilizando el constructor por defecto:
        Triangulo_v5 isoceles_vacio = new Triangulo_v5();
        isoceles_vacio.verDim();
        isoceles_vacio.getArea();
        isoceles_vacio.estilo();
        
        Triangulo_v5 isoceles = new Triangulo_v5("isoceles",5.0,5.0);
        isoceles.verDim();
        isoceles.getArea();
        isoceles.estilo();
        
        Triangulo_v5 equilatero = new Triangulo_v5(6.685);
        equilatero.verDim();
        equilatero.getArea();
        equilatero.estilo();

    }
}
class Figura2D_v5 {
    public double ancho, alto;
    
        public Figura2D_v5() {
        this.ancho=0;
        this.alto=0;
    }
    
    public Figura2D_v5(double valor) {
        this.ancho=valor;
        this.alto=valor;
    }
    
    Figura2D_v5(double an, double a){
        this.ancho=an;
        this.alto=a;
    }
    
    
    public void verDim() {
        System.out.println("Ancho: " + Math.round(this.ancho*100/100d) + " y su Alto: " + Math.round(this.alto*100/100d));


    }
}

class Triangulo_v5 extends Figura2D_v5{
    public String estilo;

    public Triangulo_v5() {
        super();
        this.estilo = null;
    }
     public Triangulo_v5(double aa) {
        super(aa);
        this.estilo = "igualBaseAltura";
    }
    public Triangulo_v5(String e, double anc, double al) {
        super(anc, al);
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