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
public class Ejercicio_3_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //    3.8. Calcular la suma de los 100 números siguientes a uno tecleado previamente. 
        int numero, i, resultado=0;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");

        numero = teclado.nextInt();
        
        for (i = numero; i < 100; i++) {
            resultado = resultado+(i + 1);
        }
        
        System.out.println(resultado);

    }
}
