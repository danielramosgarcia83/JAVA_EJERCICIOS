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
public class Ejercicio_3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Mostrar por pantalla los n primeros números naturales, siendo n el valor tecleado previamente. 

    Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int n=teclado.nextInt();
        System.out.println("los "+n+" primeros números naturales son:");
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }

}
