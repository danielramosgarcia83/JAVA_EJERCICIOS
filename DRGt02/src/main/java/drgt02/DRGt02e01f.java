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
public class DRGt02e01f {

    public static void main(String[] args) {
        // TODO code application logic here
//        Leer un número entero y decir si está comprendido entre 10 y 20 (ambos incluidos). 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero entero");
        int numero = teclado.nextInt();
        System.out.println((numero>=10&&numero<=20)?"El numero esta entre 10-20":"El numero esta fuera de rango 10-20");
    }
}
