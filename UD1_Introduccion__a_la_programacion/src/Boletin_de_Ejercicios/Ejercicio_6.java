/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Boletin_de_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        El coste de un automóvil nuevo para un comprador es la suma total del coste de fábrica del
vehículo, más el porcentaje de la ganancia de la tienda (que se aplica sobre el coste de fábrica) y
añadiéndole finalmente los impuestos estatales aplicables (sobre el precio de venta calculado ya con
beneficio de la tienda).
Suponiendo una ganancia de tienda de 10% y un impuesto del 20%, realiza un programa que lea por
consola el coste inicial del automóvil y calcule el coste para el consumidor
        
        coste_para_consumidor=coste_fabricacion+%ganancia(sobre el coste)+%imp
        ganancia=10%
        impuesto=20%
        coste_para_consumidor?
        
         */
        //Constante:
        final float GANANCIA = 0.1f, IMPUESTO = 0.2f;

        //variables:
        float coste_fabricacion, coste_para_consumidor;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el coste de fabrica de vehiculo: ");
        coste_fabricacion = teclado.nextFloat();
        
        coste_para_consumidor = coste_fabricacion * (1 + GANANCIA) * (1 + IMPUESTO);
        System.out.println(coste_para_consumidor);

    }

}
