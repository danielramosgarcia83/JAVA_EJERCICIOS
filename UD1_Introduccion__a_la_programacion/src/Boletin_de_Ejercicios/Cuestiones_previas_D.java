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
public class Cuestiones_previas_D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //¿Qué hace este programa? Corrígelo sus errores. ¿Qué ocurre para la variable ‘b’ introducimos cero?
        
 float a,b,c;
 Scanner teclado = new Scanner(System.in);
 System.out.print("Introduce valor a: ");
 a = teclado.nextInt();
 System.out.print("Introduce valor b: ");
 b = teclado.nextInt();
 c = a / b;
 System.out.println("Resultado: " + c); 
    }
   //he declarado las variables como float para evitar el error al dividir por 0
}

