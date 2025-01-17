/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Boletin_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Ejercicio_2_1_b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //b) Leer dos números enteros y muestre si el primero es mayor que el segundo.
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el primer numero entero");
        int primer_num= teclado.nextInt();
        System.out.println("Ingresa el segundo numero entero");
        int segundo_num= teclado.nextInt();
        
        System.out.println((primer_num>segundo_num)?"El primero es mayor":"El primero no es mayor");
    }
}
