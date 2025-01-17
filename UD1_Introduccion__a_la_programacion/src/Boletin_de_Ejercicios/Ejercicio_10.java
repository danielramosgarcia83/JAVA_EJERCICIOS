/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Boletin_de_Ejercicios;

import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
Programa al que se le introduzcan por consola las coordenadas X e Y de un punto del plano y
calcule el área del rectángulo que forma ese punto con el origen de los ejes de coordenadas (ojo:
pueden ser negativos)
         */
        
        //Math.abs devuelve el valor absoluto de un número Decimal.
        
        int x,y;
        Scanner chorizo = new Scanner(System.in);
        
        System.out.println("Introduce la coordenada X: ");
        x=chorizo.nextInt();
        System.out.println("Introduce la coordenada Y: ");
        y=chorizo.nextInt();
        
        int area=Math.abs(x*y);

        
        System.out.println("El area es: "+area);
    }

}
