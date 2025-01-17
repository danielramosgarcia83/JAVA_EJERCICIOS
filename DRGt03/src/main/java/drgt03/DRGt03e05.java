/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package drgt03;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class DRGt03e05 {
    public static void main(String[] args) {
        // TODO code application logic here

//3.5. Sumar una cantidad de números que se van introduciendo, siempre que sean positivos hasta
//que se teclee el -1.
//Para sumar valores e ir acumulando esa suma se suele emplear una estructura con la siguiente forma.
//Antes del bucle: acumulador = 0.
//Y dentro del bucle acumulador = acumulador + nuevo valor. 
        int num;
        Scanner teclado = new Scanner(System.in);

        int acumulador = 0;

        do {
            System.out.println("Indroduce un numero positivo");
            num = teclado.nextInt();
            if(num>=0)acumulador = acumulador + num;
        } while (num >= 0);
        System.out.println(num + " no es un numero positivo, acumulador =" + acumulador);
    }
}
