package drgt08;
/**
 * @author Daniel
 * 8.6. Copia las clases anteriores como una nueva versión de las mismas (añade sufijo _v6) y realiza los siguientes cambios:
 * • Crea una nueva clase TrianColor_v6, hija de la clase Triángulo_v6 que incluye un nuevo atributo privado de tipo String llamado color.
 * • Esta nueva clase tiene un constructor de 4 parámetros (alto, ancho, estilo, color), además del getter y setter de color.
 * • Haz un nuevo programa que cree un triángulo de color y llame a métodos definidos en sus clases base.
 */

public class DRGt08e06 {
    public static void main(String[] args) {     
        TrianColor_v6 isoseles= new TrianColor_v6("Isoseles", 6, 6, "Rojo");
        isoseles.verDim();
        isoseles.getArea();
        System.out.println(isoseles.getColor());
        isoseles.mostrarInfo();
    }
}
class Figura2D_v6 {
    public double ancho, alto;
        public Figura2D_v6() {
        this.ancho=0;
        this.alto=0;
    }
    public Figura2D_v6(double valor) {
        this.ancho=valor;
        this.alto=valor;
    }  
    Figura2D_v6(double an, double a){
        this.ancho=an;
        this.alto=a;
    }  
    public void verDim() {
        System.out.println("Ancho: " + Math.round(this.ancho*100/100d) + " y su Alto: " + Math.round(this.alto*100/100d));


    }
}

class Triangulo_v6 extends Figura2D_v6{
    public String estilo;

    public Triangulo_v6() {
        super();
        this.estilo = null;
    }
     public Triangulo_v6(double aa) {
        super(aa);
        this.estilo = "igualBaseAltura";
    }
    public Triangulo_v6(String e, double anc, double al) {
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

class TrianColor_v6 extends Triangulo_v6{
    private String color;

    public TrianColor_v6(String e,double an,double a,String c) {
        super(e,an,a);
        this.color=c;
    }
    
    public void setColor(String color){this.color=color;}
    public String getColor(){return this.color;}
    public void mostrarInfo(){     
        System.out.printf("Es un triango %s,sus medidas son alto %.2f ancho %.2f y su color es %s",this.estilo,this.alto,this.ancho,this.color);

    }
    
    
}