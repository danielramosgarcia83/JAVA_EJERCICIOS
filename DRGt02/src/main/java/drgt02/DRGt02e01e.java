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
public class DRGt02e01e {

    public static void main(String[] args) {
        // TODO code application logic here
//        Leer dos números enteros y diga si al menos uno de los dos es mayor de 10.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el primer numero entero");
        int primer_num = teclado.nextInt();
        System.out.println("Ingresa el segundo numero entero");
        int segundo_num = teclado.nextInt();
        
        System.out.println((primer_num>10||segundo_num>10)?"Uno o ambos es mayor a 10":"Ninguno es mayor a 10");
    }
}
