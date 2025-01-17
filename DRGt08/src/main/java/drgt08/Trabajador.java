package drgt08;

import java.time.LocalDate;

/**
 * @author Daniel
 */
public class Trabajador {

    private String id;
    private String nombre;
    private LocalDate fechanacimiento;
    private Float salariobase;

    public Trabajador(String id, String nombre, String fecha, Float salariobase) {
        this.id = id;
        this.nombre = nombre;
        this.fechanacimiento = LocalDate.parse(fecha);
        this.salariobase = salariobase;
    }

    //Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = LocalDate.parse(fechanacimiento);
    }

    public void setSalariobase(Float salariobase) {
        this.salariobase = salariobase;
    }

    //Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechanacimiento() {
        return fechanacimiento;
    }

    public Float getSalariobase() {
        return salariobase;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ", id=" + id + ", nombre=" + nombre + ", fechanacimiento=" + fechanacimiento + ", salariobase=" + salariobase + "\n";
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || !(obj instanceof Trabajador)) {
            return false;
        }

        Trabajador aux = (Trabajador) obj;
        return aux.id.equals(this.id);
    }

}//Fin SuperClass

//subClase Asalariado
class Asalariado extends Trabajador {

    private Float salarioFinal;
    private Float horasExtra;

    public Asalariado(String id, String nombre, String fechanacimiento, Float salariobase) {
        super(id, nombre, fechanacimiento, salariobase);
        this.salarioFinal = super.getSalariobase();
        this.horasExtra = 0f;
    }

    //Setters
    public void setHorasExtra(Float horasExtra) {
        this.horasExtra = horasExtra;
    }

    //Getters
    public Float getHorasExtra() {
        return horasExtra;
    }

    public Float getSalarioFinal() {
        return salarioFinal;
    }

    //Metodo calcularSalarioFinal()
    public void calcularSalarioFinal(Float ValorHoraEx) {
        //calcula el salario final del empleado siendo su salario base más el importe de las horas extras trabajadas.
        this.salarioFinal = this.getSalariobase() + (this.horasExtra * ValorHoraEx);
    }

}//Fin subClase Asalariado

//subClase ConsultorExterno
class ConsultorExterno extends Trabajador {

    private Float horasTrabajadas;
    private Float salarioFinal;

    public ConsultorExterno(String id, String nombre, String fecha) {
        super(id, nombre, fecha, 0f);
        this.horasTrabajadas = 0f;
        this.salarioFinal = 0f;
    }

    //Setters
    public void setHorasTrabajadas(Float horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    //Metodo calcularSalarioFinal()
    public void calcularSalarioFinal(Float valorhoraCon) {
        // calcula el salario final del consultor solo en función de las horas trabajadas (el salario base de estos trabajadores es cero).
        this.salarioFinal = this.horasTrabajadas * valorhoraCon;
    }

    //Getters
    public Float getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public Float getSalarioFinal() {
        return salarioFinal;
    }

}//Fin subClase ConsultorExterno

