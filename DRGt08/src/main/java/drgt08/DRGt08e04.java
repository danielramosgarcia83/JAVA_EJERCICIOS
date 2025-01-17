package drgt08;
/**
 * @author Daniel
 * 8.4. Copia las clases anteriores como una nueva versión de las mismas (añade sufijo _v4) y realiza los siguientes cambios:
 * • Añade un constructor a la clase Figura2D al que se le pasan dos parámetros: alto y ancho.
 * ¿Funciona ahora el constructor de Triangulo (creado en el ejercicio anterior)? ¿Por qué?
 * • Reescribe el constructor de Triangulo creado en el ejercicio anterior para que haga uso del nuevo constructor de la clase base.
 * • Comprueba que el programa creado en el ejercicio anterior sigue funcionando. • Haz una
 * copia del programa anterior, sobre las nuevas clases creadas, y comprueba que siguefuncionando.
 */
public class DRGt08e04 {
    public static void main(String[] args) {
        Triangulo_v4 isoceles = new Triangulo_v4("Isosceles",5.0,5.0);
        isoceles.verDim();
        isoceles.getArea();
        isoceles.estilo(); 
    }
}
class Figura2D_v4 {
    public double ancho, alto;
    
    Figura2D_v4(double an, double a){
        this.ancho=an;
        this.alto=a;
    }  
    
    public void verDim() {
        System.out.println("Ancho: " + Math.round(this.ancho*100/100d) + " y su Alto: " + Math.round(this.alto*100/100d));

    }
}

class Triangulo_v4 extends Figura2D_v4{
    public String estilo;
    public Triangulo_v4(String e, double anc, double al) {
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

//SI agregamos un constructor padre que reciba parametros, ya no vale llamarlo por defecto desde el hijo,
//no compila porque justamente espera parametros la clase padre.
//Es necesario reescribirlo, para que envie justamente los parametros para los atributos heredados del padre.
//solo faltaria definir los atritbutos propios de cada hijo.