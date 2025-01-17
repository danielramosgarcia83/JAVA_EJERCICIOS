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
public class Ejercicio_3_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//Diseñar un algoritmo capaz de leer dos valores enteros, m y n, y nos muestre los números
//comprendidos entre ellos ordenados ascendentemente, junto con el valor de elevar cada uno de
//esos números al cuadrado. No se sabe si m > n, pero se desea utilizar una sola sentencia repetitiva
//tanto si m > n como si m < n. 
        int i, j, x, m, n;

        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un numero entero: ");
        m = teclado.nextInt();
        System.out.println("introduce otro numero entero: ");
        n = teclado.nextInt();

        if (m < n) {
            i = m;
            j = n;

        } else {
            i = n;
            j = m;

        };

        for (x = i; x< j-1; x++)
        {
            i++;
            System.out.println(i+" el cuadrado de " + i + " es: "+ Math.pow(i,2));
        }
    }

}
