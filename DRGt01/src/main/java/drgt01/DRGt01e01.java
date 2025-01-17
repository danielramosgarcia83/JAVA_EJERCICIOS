/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package drgt01;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class DRGt01e01 {

    public static void main(String[] args) {
        // TODO code application logic here
        // Realiza un programa que lea por consola un valor en euros y lo convierta a dólares
        // (suponer que 1 euro es igual a 1,14 dólares). 
        float valor_euro, tasa=1.14f;
        Scanner teclado= new Scanner(System.in);
        System.out.print("Escribe un importe en euro: ");
        valor_euro= teclado.nextFloat();    
        System.out.println(valor_euro +" euros, equivalen a " + valor_euro*tasa + "dolares");
    }
}
