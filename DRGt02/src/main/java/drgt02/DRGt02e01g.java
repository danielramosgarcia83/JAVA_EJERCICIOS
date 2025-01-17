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
public class DRGt02e01g {

    public static void main(String[] args) {
        // TODO code application logic here
        //Leer dos números enteros y diga si uno y solo uno es mayor de 10.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el primer numero entero");
        int primer_num = teclado.nextInt();
        System.out.println("Ingresa el segundo numero entero");
        int segundo_num = teclado.nextInt();

        /*
        if (primer_num > 10 && segundo_num > 10)
        {
            System.out.println("Ambos mayor que 10");
        }
        else if (!(primer_num > 10 )&& !(segundo_num > 10))
        {
            System.out.println("Ambos menores que 10");
        }
        else
            {
                System.out.println(primer_num > 10?"El primero es mayor que 10":"El segundo es mayor que 10");
            }
         */
        System.out.println(primer_num > 10?
                segundo_num > 10?
                        "Ambos Mayor que 10" : "El primero es mayor que 10" : segundo_num > 10
                        ? "Segundo es Mayor que 10" : "Ambos menores que 10");

    }
}
