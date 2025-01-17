/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Boletin_de_Ejercicios;

/**
 *
 * @author Daniel
 */
public class Cuestiones_previas_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Resuelve a mano, sin programa ni calculadora, las siguientes expresiones:
        
        float a= -4 * 7 + 20 % 3 / 2 - 5;
        //(-4*7)+((20%3)/2)-5 La precedencia seria asi.
        float b=( ( 3 + 2 ) % 2 - 15 ) / 2 * 5;
        /*
        (5%2-15)/2*5
          (1-15)/2*5
          -14/2*5
          -7*5=-35.0
        */
        float c=3 + 6 * 14 % 3;
        /*
            3+84%3
            3+0=3.0
        */
        float d =8 + 7 * 3 + 4 * 6 / 2 % 4;
        /*
             d =8 + 7 * 3 + 4 * 6 / 2 % 4
                8+21+24/2%4
                8+21+12%4
                8+21+0=29
        */
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    
}
