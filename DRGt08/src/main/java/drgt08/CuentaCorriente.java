package drgt08;

import java.time.LocalDate;

/**
 * @author Daniel

* 8.9. Copia la clase _CuentaCorriente que te proporcionará el profesor con un nombre nuevo, por ejemplo,
* CuentaCorriente y realiza las siguientes operaciones:
* • Crea una clase hija llamada CuentaPlazo igual que la anterior, pero sin comisiones. Además, tiene un nuevo
* atributo, que es la fecha de creación.
* • Esta nueva clase ya no permitirá que haya subclases de ella.
* • Crea constructor para la nueva clase que incorpore la inicialización de la fecha de creación al día en curso.
* • Sobrescribe el método retirar () para que no que no calcule comisiones.
* Revisa los modificadores de acceso de atributos y quizás tengas que crear algún getter/setter.
 */

public class CuentaCorriente {
    private String iban;
    private float saldo;
    protected int contadorIngresos;
    private float porcentajeComision;

    CuentaCorriente(String iban, float porcentajeComision) {
        this.iban = iban;
        this.saldo = 0;
        this.porcentajeComision = porcentajeComision;
        this.contadorIngresos = 0;
    }

    public void setComision(float porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public float getComision() {
        return porcentajeComision;
    }

    public float getSaldo() {
        return (saldo);
    }
    public void setSaldo(float importe){
        this.saldo-=importe;
    }

    public void ingresar(float importe) {
        float bonus = 0;
        if (++contadorIngresos == 3) {
            contadorIngresos = 0;
            bonus = 0.7f;
        }
        saldo += importe + bonus;
    }

    public boolean retirar(float importe) {
        float comision = porcentajeComision * importe;
        if (importe + comision <= saldo) {
            saldo -= importe + comision;  //resta (importe+comision)
            contadorIngresos = 0;
            return true;
        } else {
            return false;
        }
    }
} // fin clase

final class CuentaPlazo extends CuentaCorriente {
    private LocalDate fecha;
    CuentaPlazo(String iban) {
        super(iban, 0);
        this.fecha = LocalDate.now();
    }
    @Override
        public boolean retirar(float importe) {
        if (importe <= getSaldo()) {
            setSaldo(importe);  //resta importe
            contadorIngresos = 0;
            return true;
        } else {
            return false;
        }
    }
        
        public LocalDate getFecha ()
        {
            return this.fecha;
        }
}
