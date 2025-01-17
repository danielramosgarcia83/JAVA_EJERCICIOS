package drgt08;
/**
 * @author Daniel

* 8.7. Copia las clases anteriores como una nueva versión de las mismas (añade sufijo _v7) y realiza los siguientes cambios:
* • Figura2D_v7 tendrá un nuevo constructor, que recibe como parámetro otro objeto de tipo Figura2D_v7 y que copiará todos sus datos.
* • Hacer otro constructor análogo para la clase Triangulo_v7.
* • Hay un programa que cree un Triangulo_v7 con el constructor de 3 parámetros creado previamente,
* y otro triángulo utilizando el nuevo constructor. Mostrar el área de ambos.
 */

public class DRGt08e07 {
    public static void main(String[] args) {
        Triangulo_v7 triangulo1= new Triangulo_v7("Isoseles",5,5);
        triangulo1.getArea();
        
        Triangulo_v7 triangulo2 = new Triangulo_v7(triangulo1);
        triangulo2.getArea();      
    }
}
class Figura2D_v7 {
    public double ancho, alto;
    public Figura2D_v7() {
        this.ancho=0;
        this.alto=0;
    }
    public Figura2D_v7(double valor) {
        this.ancho=valor;
        this.alto=valor;
    }  
    public Figura2D_v7(double an, double a){
        this.ancho=an;
        this.alto=a;
    }
    public Figura2D_v7(Figura2D_v7 figura){
        this.alto=figura.alto;
        this.ancho=figura.ancho;
    }
    public void verDim() {
        System.out.println("Ancho: " + Math.round(this.ancho*100/100d) + " y su Alto: " + Math.round(this.alto*100/100d));
    }
}

class Triangulo_v7 extends Figura2D_v7{
    public String estilo;

    public Triangulo_v7() {
        super();
        this.estilo = null;
    }
     public Triangulo_v7(double aa) {
        super(aa);
        this.estilo = "igualBaseAltura";
    }
    public Triangulo_v7(String e, double anc, double al) {
        super(anc, al);
        this.estilo = e;
    }
    
    public Triangulo_v7(Triangulo_v7 triangulo){
        super(triangulo);
        this.estilo=triangulo.estilo;
    }
    
    public void getArea(){
        double superficie =(this.ancho*this.alto)/2;
        System.out.println("La superficie es: "+superficie);
    }
    
    public void estilo(){
        System.out.println("Estilo: "+this.estilo);
    }
}

class TrianColor_v7 extends Triangulo_v7{
    private String color;

    public TrianColor_v7(String e,double an,double a,String c) {
        super(e,an,a);
        this.color=c;
    }
    
    public void setColor(String color){this.color=color;}
    public String getColor(){return this.color;}
    public void mostrarInfo(){     
        System.out.printf("Es un triango %s,sus medidas son alto %.2f ancho %.2f y su color es %s",this.estilo,this.alto,this.ancho,this.color);

    }   
}