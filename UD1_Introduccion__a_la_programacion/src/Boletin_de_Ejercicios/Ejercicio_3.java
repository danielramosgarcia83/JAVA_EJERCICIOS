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
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        
        1.3. Realiza un programa que lea por consola dos números enteros (sin decimales) y nos muestre
        los resultados de sumar, restar y dividir dichos números. Comprueba que la división responde con decimales
         */
        int num1, num2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un num entero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce otro numero entero: ");
        num2 = teclado.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        float division = num1 / (float) num2;
        System.out.println("La suma de: " + num1 + " y " + num2 + " es: " + suma);
        System.out.println("La resta de: " + num1 + " y " + num2 + " es: " + resta);
        System.out.println("La division de: " + num1 + " y " + num2 + " es: " + division);

    }

}
