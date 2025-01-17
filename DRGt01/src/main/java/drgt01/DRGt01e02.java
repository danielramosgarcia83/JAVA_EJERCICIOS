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
public class DRGt01e02 {

public static void main(String[] args) {
        // TODO code application logic here
        /*
        1.2. Realiza un programa que lea por consola un valor en dólares y lo convierta a euros
        (suponer que 1 euro es igual a=1,14 dólares). 
        */
        
        float dolar, tasa_e=1.14f;
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Ingresa un valor en dolar: ");
        dolar=teclado.nextFloat();
        
        float conv_euro= dolar/tasa_e;
        System.out.println(dolar +" dolares, equivalen a " + conv_euro+" euros");
        
    }
}
