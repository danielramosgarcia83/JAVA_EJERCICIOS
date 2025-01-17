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
public class DRGt02e01d {

    public static void main(String[] args) {
        // TODO code application logic here
//      d) Leer dos números enteros y diga si los dos son mayores de 10 o no lo son. 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el primer numero entero");
        int primer_num= teclado.nextInt();
        System.out.println("Ingresa el segundo numero entero");
        int segundo_num= teclado.nextInt();
        
        System.out.println((primer_num>10&&segundo_num>10)?"Ambos num son mayores a 10":"Alguno o ninguno no es mayor a 10");

    }
}
