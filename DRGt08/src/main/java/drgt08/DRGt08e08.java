package drgt08;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Daniel

* 8.8
* Copia las clases anteriores como una nueva versión de las mismas (añade sufijo _v8) y realiza los siguientes cambios:
* • Añadir a la clase Figura2D_v8 un atributo privado llamado nombre de tipo String.
* Añadir el getter/setter de ese campo y modificar los constructores de dicha clase para incorporar como parámetro
* el nombre de la figura (en el constructor por defecto se le asignará valor null).
* • Modificar la clase hija y nieta para incluir el nombre en constructores.
* • Crear una nueva clase hija de Figura2D_v8 llamada Rectangulo_v8 con constructor con tres parámetros (alto, ancho, nombre),
* constructor con un dos parámetros (alto igual a ancho y nombre) y un método que devuelve boolean llamado esCuadrado().

* • Hacer un programa que cree un ArrayList con 4 rectángulos, algunos cuadrados y otros no, y cuente cuantos hay cuadrados.
 */

public class DRGt08e08 {
    public static void main(String[] args) {
        ArrayList <Rectangulo_v8> array_Rectangulos = new ArrayList<>();
        int cuadrados=0;
        Random tipo = new Random();
                    
        for (int i = 0; i < 4; i++) {
            if (tipo.nextBoolean()){
                array_Rectangulos.add(new Rectangulo_v8("Cuadrado", 5));
                //Esto no lo piden, es por probar
                //System.out.println(array_Rectangulos.get(i).getNombre());
                cuadrados++;
            } 
            else
            {
                array_Rectangulos.add(new Rectangulo_v8("Rectangulo", 5, 4));
                //Esto no lo piden, es por probar
                //System.out.println(array_Rectangulos.get(i).getNombre());
            }    
        }
        //Este foreach no lo piden, es cosa mia.
        for (Rectangulo_v8 array_Rectangulo : array_Rectangulos) {
            System.out.println(array_Rectangulo.getNombre());
        }
        System.out.printf("en el arrayList con 4 rectangulos, hay %d cuadrado(s)",cuadrados);
        System.out.println("");
        //Esto no lo piden, es por probar
        System.out.println(array_Rectangulos.get(1).esCuadrado()
);

    }
}
class Figura2D_v8 {
    private String nombre;
    public double ancho, alto;
    public Figura2D_v8() {
        this.nombre=null;
        this.ancho=0;
        this.alto=0;
    }
    public Figura2D_v8(String nombre, double valor) {
        this.nombre=nombre;
        this.ancho=valor;
        this.alto=valor;
    }  
    public Figura2D_v8(String nombre,double an, double a){
        this.nombre=nombre;
        this.ancho=an;
        this.alto=a;
    }
    public Figura2D_v8(Figura2D_v8 figura){
        this.nombre=figura.nombre;
        this.alto=figura.alto;
        this.ancho=figura.ancho;
    }
    
    //Getter/Setter
    public String getNombre(){return this.nombre;}
    public void setNombre(String n){this.nombre=n;}
    
    public void verDim() {
        System.out.println("Ancho: " + Math.round(this.ancho*100/100d) + " y su Alto: " + Math.round(this.alto*100/100d));
    }
}

//Nueva clase hija Rectangulo_v8
class Rectangulo_v8 extends Figura2D_v8{

    public Rectangulo_v8(String nombre,double ancho, double alto) {
        super(nombre,ancho,alto);
    }

    public Rectangulo_v8(String nombre,double valor) {
        super(nombre,valor);
    }

    public boolean esCuadrado()
    {
        return this.ancho==this.alto;
    }


}
class Triangulo_v8 extends Figura2D_v8{
    public String estilo;

    public Triangulo_v8() {
        super();
        this.estilo = null;
    }
     public Triangulo_v8(String n,double aa) {
        super(n,aa);
        this.estilo = "igualBaseAltura";
    }
    public Triangulo_v8(String n,String e, double anc, double al) {
        super(n,anc, al);
        this.estilo = e;
    }
    
    public Triangulo_v8(Triangulo_v8 triangulo){
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
class TrianColor_v8 extends Triangulo_v8{
    private String color;

    public TrianColor_v8(String nom, String e,double an,double a,String c) {
        super(nom,e,an,a);
        this.color=c;
    }
    
    public void setColor(String color){this.color=color;}
    public String getColor(){return this.color;}
    public void mostrarInfo(){     
        System.out.printf("Es un triango %s,sus medidas son alto %.2f ancho %.2f y su color es %s",this.estilo,this.alto,this.ancho,this.color);

    }
    
    
}