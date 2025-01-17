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
public class Ejercicio_2_1_i {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//i) Leer dos números enteros y diga si el segundo es divisor del primero (prevenir divisiones
//por cero, que causan error) Repasar operadores en cortocircuito para hacer un solo if
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el primer numero entero");
        int primer_num = teclado.nextInt();
        System.out.println("Ingresa el segundo numero entero");
        int segundo_num = teclado.nextInt();

//        if (segundo_num != 0 && primer_num % segundo_num == 0)
//        {
//            System.out.println(segundo_num + " Es divisor de: " + primer_num);
//        }
//        else
//        {
//            if (segundo_num == 0)
//            {
//                System.out.println("No se puede dividir por: " + segundo_num);
//            }
//            else
//            {
//                System.out.println(segundo_num + " NO es divisor de: " + primer_num);
//            }
//
//        }
//        CON "?"
        System.out.println((segundo_num != 0 && primer_num % segundo_num == 0) ? segundo_num + " Es divisor de: " + primer_num : (segundo_num + " NO es divisor de: " + primer_num));

    }

}
