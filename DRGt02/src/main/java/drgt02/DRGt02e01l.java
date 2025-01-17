/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package drgt02;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class DRGt02e01l {

    public static void main(String[] args) {
        // TODO code application logic here
//l) Leer tres números enteros y diga hay alguno mayor que cero. 

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el primer numero entero");
        int primer_num = teclado.nextInt();
        System.out.println("Ingresa el segundo numero entero");
        int segundo_num = teclado.nextInt();
        System.out.println("Ingresa el tercer numero entero");
        int tercer_num = teclado.nextInt();

        if (primer_num > 0 || segundo_num > 0 || tercer_num > 0) {
            System.out.println("Hay alguno mayor que cero");
        } else {
            System.out.println("Ninguno es mayor que cero");
        }
    }
}
