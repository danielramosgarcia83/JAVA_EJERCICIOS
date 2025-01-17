/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package drgt03;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class DRGt03e03 {
    public static void main(String[] args) {
        // TODO code application logic here

//3.3. Diseñar un algoritmo que permita introducir números positivos y nos vaya informando uno a
//uno si es par o impar. El programa finalizará cuando se introduzca un número negativo. Hacer dos
//versiones, una primera con una lectura de teclado adelantada (antes de entrar en el bucle) y otra
//versión en la que la lectura de datos se haga únicamente al principio del bucle. 
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Ingresa un numero positivo");
//        int num = teclado.nextInt();
//
//        while (num > 0) {
//            System.out.println((num % 2 == 0) ? "Par" : "Inpar");
//            System.out.println("Ingresa un numero positivo");
//            num = teclado.nextInt();
//        }
//        System.out.println("Numero negativo");


        Scanner teclado = new Scanner(System.in);
        int num;

        do {
            System.out.println("Ingresa un numero positivo");
            num = teclado.nextInt();
            if (num > 0)
            {
                System.out.println((num % 2 == 0) ? "Par" : "Impar");
            }
        } while (num > 0);
        System.out.println("Numero negativo");

    }
}
