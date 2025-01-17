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
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/* Diseñar un programa al que se le introduzcan las edades de cuatro personas y nos calcule la
media de edad de los mismos. Hacer una segunda versión que solo utilice dos variables. ¿Sería
posible hacerlo con una sola variable? */

        int edad = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("edad 1: ");
        edad += teclado.nextInt();
        System.out.println("edad 2: ");
        edad += teclado.nextInt();
        System.out.println("edad 3: ");
        edad +=  teclado.nextInt();
        System.out.println("edad 4: ");
        edad +=  teclado.nextInt();

        System.out.println("La media es: "+edad/4f);
    }

}
