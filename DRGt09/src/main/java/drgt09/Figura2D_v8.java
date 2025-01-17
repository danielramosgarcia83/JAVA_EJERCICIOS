package drgt09;

/**
 * @author Daniel
 */
class Figura2D_v8 {

    private String nombre;
    public double ancho, alto;

    public Figura2D_v8() {
        this.nombre = null;
        this.ancho = 0;
        this.alto = 0;
    }

    public Figura2D_v8(String nombre, double valor) {
        this.nombre = nombre;
        this.ancho = valor;
        this.alto = valor;
    }

    public Figura2D_v8(String nombre, double an, double a) {
        this.nombre = nombre;
        this.ancho = an;
        this.alto = a;
    }

    public Figura2D_v8(Figura2D_v8 figura) {
        this.nombre = figura.nombre;
        this.alto = figura.alto;
        this.ancho = figura.ancho;
    }

    //Getter/Setter
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public void verDim() {
        System.out.println("Ancho: " + Math.round(this.ancho * 100 / 100d) + " y su Alto: " + Math.round(this.alto * 100 / 100d));
    }
}

//Nueva clase hija Rectangulo_v8
class Rectangulo_v8 extends Figura2D_v8 {

    public Rectangulo_v8(String nombre, double ancho, double alto) {
        super(nombre, ancho, alto);
    }

    public Rectangulo_v8(String nombre, double valor) {
        super(nombre, valor);
    }

    //para el 9.4 agrege este metodo
    //Lo pase a double para sumar areas

    public double getArea() {
        return (this.ancho * this.alto);
    }

    public boolean esCuadrado() {
        return this.ancho == this.alto;
    }

}

class Triangulo_v8 extends Figura2D_v8 {

    public String estilo;

    public Triangulo_v8() {
        super();
        this.estilo = null;
    }

    public Triangulo_v8(String n, double aa) {
        super(n, aa);
        this.estilo = "igualBaseAltura";
    }

    public Triangulo_v8(String n, String e, double anc, double al) {
        super(n, anc, al);
        this.estilo = e;
    }

    public Triangulo_v8(Triangulo_v8 triangulo) {
        super(triangulo);
        this.estilo = triangulo.estilo;
    }
    //9.4 lo pase a double para sumar areas
    public double getArea() {
        return (this.ancho * this.alto) / 2;
    }

    public void estilo() {
        System.out.println("Estilo: " + this.estilo);
    }
}

class TrianColor_v8 extends Triangulo_v8 {

    private String color;

    public TrianColor_v8(String nom, String e, double an, double a, String c) {
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
        System.out.printf("Es un triango %s,sus medidas son alto %.2f ancho %.2f y su color es %s", this.estilo, this.alto, this.ancho, this.color);
    }
}
