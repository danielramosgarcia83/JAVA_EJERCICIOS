   package drgt08;
/**
 * @author Daniel
 * 
Copia las clases anteriores como una nueva versión de las mismas (añade sufijo _v2) y realiza
los siguientes cambios:
• Ahora los atributos ancho y alto serán privados.
• Añade los métodos getter y setter para ambos atributos.
• Modifica la clase Triangulo obligados por los cambios en su clase padre.
• Haz una copia del programa anterior, sobre las nuevas clases creadas, y comprueba que el
programa creado en el ejercicio anterior sigue funcionando. 

 */
public class DRGt08e02 {
    public static void main(String[] args) {
        Triangulo_v2 isoceles = new Triangulo_v2("Isosceles");
        isoceles.setAncho(5.0);
        isoceles.setAlto(5.0);
        isoceles.verDim();
        isoceles.getArea();
        isoceles.estilo(); 
    }
}

class Figura2D_v2 {
    private double ancho, alto; 
    public void setAncho(double anc) {this.ancho = anc;}
    public void setAlto(double alt) {this.alto = alt;}
    public double getAncho() {return this.ancho;}
    public double getAlto() {return this.alto;}
    
    public void verDim() {
        System.out.println("Ancho: " + Math.round(this.ancho*100/100d) + " y su Alto: " + Math.round(this.alto*100/100d));
    }
}

class Triangulo_v2 extends Figura2D_v2{
    public String estilo;

    public Triangulo_v2(String e) {
        this.estilo = e;
    }
   
    public void getArea(){

        double superficie =(super.getAncho()*super.getAlto())/2;
        System.out.println("La superficie es: "+superficie);
    }
    public void estilo(){
        System.out.println("Estilo: "+this.estilo);
    }
}