package drgt10;

/*/
 * 10.1. Copia la última versión de las clases de los primeros ejercicios: Figura2D, Triangulo, TrianColor
y Rectangulo (añade sufijo _v9) y realiza los siguientes cambios:

• Crea un método abstracto llamado area () en Figura2D que ha de implementarse en las clases hijas.
• Crea un método precio (float precioMetroCuadrado) en la clase Figura2D, que use el método abstracto anterior.
• Verificar que las clases hijas implementan el método area (). ¿Qué ocurriría si no lo tuviesen implementado?

 * @author Daniel
 */
abstract class Figura2D_v9 {

    private String nombre;
    public double ancho, alto;
    private final int PRECIOMETROCUADRADO=10;

    public Figura2D_v9() {
        this.nombre = null;
        this.ancho = 0;
        this.alto = 0;
    }

    public Figura2D_v9(String nombre, double valor) {
        this.nombre = nombre;
        this.ancho = valor;
        this.alto = valor;
    }

    public Figura2D_v9(String nombre, double an, double a) {
        this.nombre = nombre;
        this.ancho = an;
        this.alto = a;
    }

    public Figura2D_v9(Figura2D_v9 figura) {
        this.nombre = figura.nombre;
        this.alto = figura.alto;
        this.ancho = figura.ancho;
    }

    //Metodo Abstracto
    public abstract double area (); 
    // Getter/Setter

    public float precioMetroCuadrado(){
            return (float) area ()*PRECIOMETROCUADRADO;}

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public void verDim() {
        System.out.println(
                "Ancho: " + Math.round(this.ancho * 100 / 100d) + " y su Alto: " + Math.round(this.alto * 100 / 100d));
    }
}

// Nueva clase hija Rectangulo_v9
class Rectangulo_v9 extends Figura2D_v9 {

    public Rectangulo_v9(String nombre, double ancho, double alto) {
        super(nombre, ancho, alto);
    }

    public Rectangulo_v9(String nombre, double valor) {
        super(nombre, valor);
    }

    // para el 9.4 agrege este metodo
    // Lo pase a double para sumar areas

    public boolean esCuadrado() {
        return this.ancho == this.alto;
    }

    @Override
    public double area() {
        return (this.ancho * this.alto);

    }

}

class Triangulo_v9 extends Figura2D_v9 {

    public String estilo;

    public Triangulo_v9() {
        super();
        this.estilo = null;
    }

    public Triangulo_v9(String n, double aa) {
        super(n, aa);
        this.estilo = "igualBaseAltura";
    }

    public Triangulo_v9(String n, String e, double anc, double al) {
        super(n, anc, al);
        this.estilo = e;
    }

    public Triangulo_v9(Triangulo_v9 triangulo) {
        super(triangulo);
        this.estilo = triangulo.estilo;
    }

    // 9.4 lo pase a double para sumar areas

    public void estilo() {
        System.out.println("Estilo: " + this.estilo);
    }

    @Override
    public double area() {
        return (this.ancho * this.alto) / 2;

    }
}

class TrianColor_v9 extends Triangulo_v9 {

    private String color;

    public TrianColor_v9(String nom, String e, double an, double a, String c) {
        super(nom, e, an, a);
        this.color = c;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void mostrarInfo() {
        System.out.printf("Es un triango %s,sus medidas son alto %.2f ancho %.2f y su color es %s", this.estilo,
                this.alto, this.ancho, this.color);
    }
}
