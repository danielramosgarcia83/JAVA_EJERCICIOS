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
public class Cuestiones_previas_C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //¿Qué hace este programa? ¿Puede producirse algún error? 
        int a,b,c;
 Scanner teclado = new Scanner(System.in);
 System.out.print("Introduce valor a: ");
 a = teclado.nextInt();
 System.out.print("Introduce valor b: ");
 b = teclado.nextInt();
 c = a * b;
 System.out.println("Resultado: " + c); 
 /*
    Pide un valor para "a" y "b" y lo almacena en varibles
    Luego multiplica a*b y lo almacena en c mostrando dicha variable en pantalla
 
    Podria haber un overflow si los valores de a,b,c supera el maximo en Int(2e32)
 
 */
    }
}
