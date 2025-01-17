/*
9.12. Crea una clase Bicicleta de la que deseamos mantener los siguientes datos: marca, modelo, precio y descuento.
Se pide crear el constructor, getters y setters, método toString (), equals (),
un método que devuelva el precio con el descuento aplicado
y finalmente un método que fije el descuento a aplicar.
Este último método estará sobrecargado de la siguiente forma:
• fjarDescuento () � (se le hace 10% y dura ese descuento 1 mes)
• fjarDescuento (double d) � (se le hace d %, 1 mes)
• fjarDescuento (double d , int n) � (se le hace d %, n meses)

Haz un programa sencillo que defina una o dos instancias de bicicletas y use los métodos creados.
Notas:
• Dos bicicletas son iguales si tienen la misma marca y modelo.
• Si se fija un descuento, se elimina el descuento que pudiera haber anteriormente.
• Piensa si es necesario incorporar algún atributo adicional, para que, cuando
ejecutemos el método de ver el precio final (con descuento aplicado),sepa si tiene que aplicar algún descuento o no.
 */
package drgt09;

import java.time.LocalDate;

/**
 * @author Daniel
 */
public class DRGt09e12 {

    public static void main(String[] args) {
        // Crear instancias de Bicicleta
        Bicicleta bici1 = new Bicicleta("SKATE", "ASD", 100);
        Bicicleta bici2 = new Bicicleta("SKATE", "ZXC", 150);
        Bicicleta bici3 = new Bicicleta("SKATE2", "QWE", 200);
        Bicicleta bici4 = new Bicicleta("SKATE", "ASD", 120); // Igual marca y modelo que bici1
        Bicicleta bici5 = new Bicicleta("OTHER", "DIFFERENT", 250);

        // PRUEBAS PARA "fjarDescuento"
        System.out.println("=== PRUEBAS PARA fjarDescuento ===");

        // Caso 1: Descuento predeterminado (10%, 1 mes)
        bici1.fjarDescuento();
        System.out.println("Caso 1: Descuento predeterminado (10%, 1 mes)");
        System.out.println(bici1);
        System.out.println("Precio con descuento: " + bici1.precioDescuento());
        System.out.println();

        // Caso 2: Descuento específico (15%, 1 mes)
        bici2.fjarDescuento(15);
        System.out.println("Caso 2: Descuento del 15%, 1 mes");
        System.out.println(bici2);
        System.out.println("Precio con descuento: " + bici2.precioDescuento());
        System.out.println();

        // Caso 3: Descuento específico (20%, 3 meses)
        bici3.fjarDescuento(20, 3);
        System.out.println("Caso 3: Descuento del 20%, 3 meses");
        System.out.println(bici3);
        System.out.println("Precio con descuento: " + bici3.precioDescuento());
        System.out.println();

        // Caso 4: Verificar caducidad del descuento
        System.out.println(bici1.getFecharegistro());
        System.out.println("Caso 4: Descuento caducado para bici1");
        System.out.println(bici1);
        System.out.println("Precio con descuento: " + bici1.precioDescuento());
        System.out.println();

        // Caso 5: Reiniciar descuento (cambiar a otro descuento)
        bici2.fjarDescuento(30, 6); // Cambiamos el descuento
        System.out.println("Caso 5: Cambiar descuento para bici2 (30%, 6 meses)");
        System.out.println(bici2);
        System.out.println("Precio con descuento: " + bici2.precioDescuento());
        System.out.println();

        // PRUEBAS PARA "equals"
        System.out.println("=== PRUEBAS PARA equals ===");

        // Caso 1: Igualdad (misma marca y modelo)
        System.out.println("Caso 1: Comparar bici1 con bici4 (mismos marca y modelo)");
        System.out.println("¿Son iguales? " + bici1.equals(bici4));
        System.out.println();

        // Caso 2: Diferencia (diferentes marca o modelo)
        System.out.println("Caso 2: Comparar bici1 con bici2 (diferente modelo)");
        System.out.println("¿Son iguales? " + bici1.equals(bici2));
        System.out.println();
    }

}//FIN PROGRAMA

//CLASES
//SUPERCLASE
class Bicicleta {

//Seleccion multiple: ctrl+mayusc
    private String marca, modelo;
    private double precio, descuento = 0;
    private int meses;
    LocalDate fecharegistro = LocalDate.now();

    public Bicicleta(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    //Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public int getMeses() {
        return meses;
    }

    public LocalDate getFecharegistro() {
        return fecharegistro;
    }

    //Fx precio con descuento
    public double precioDescuento() {
        //Meses transcurridos para saber si aplica descuento
        //Sí Fecharegistro + meses descuento > actual, aplica
        if (getFecharegistro().plusMonths(meses).isAfter(LocalDate.now())) {
            //Aplica
            System.out.println("Aplica");
            return Math.round((getPrecio() - (getPrecio() * (getDescuento() / 100))) * 100.0) / 100.0;

        } else {
            //No aplica
            System.out.println("No Aplica");
            return getPrecio();
        }
    }

    //Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }
    //Setters recargados
    //Se le hace 10% y dura ese descuento 1 mes.
    public void fjarDescuento() {
        setDescuento(10);
        setMeses(1);
    }

    //Se le hace d %, 1 mes.
    public void fjarDescuento(double d) {
        setDescuento(d);
        setMeses(1);
    }

    //Se le hace d %, n meses.
    public void fjarDescuento(double d, int n) {
        setDescuento(d);
        setMeses(n);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null && !(obj instanceof Bicicleta)) {
            return false;
        }
        Bicicleta aux = (Bicicleta) obj;
        return aux.marca.equals(this.marca) && aux.modelo.equals(this.modelo);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", descuento=" + Math.round(descuento*100)/100.0+"%";
    }

}
