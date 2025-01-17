/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Boletin_Ejercicios;

/**
 *
 * @author Daniel
 */
public class Ejercicio_3_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//3.6. Diseñar un programa que muestre los números pares comprendidos entre 100 y 1 en orden descendente. 
        int i, contador = 0;

        for (i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}
