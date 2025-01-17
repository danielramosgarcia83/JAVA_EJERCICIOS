/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Boletin_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Ejercicio_2_1_a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//Hacer programas sencillos que hagan lo siguiente.
//a) Leer un número entero y determinar si es mayor de 10.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero entero");
//int numero;
//numero=teclado.nextInt();
//if (numero>10) System.out.print("Es mayor a 10"); else System.out.println("No es mayor a 10");

//int numero = teclado.nextInt();
//String mensaje = (numero > 10) ? "Es mayor a 10" : "No es mayor a 10";
//System.out.print(mensaje);
        
//    int numero;
//
//        numero = teclado.nextInt();
//
//        if (numero > 10)  {
//            System.out.println("El numero es mayor a 10"); 
//        } else {
//            System.out.println("El numero es menor a 10");
//        }
//System.out.println("int numero = (teclado.nextInt()>10)? "Mayor a 10":"Menor a 10"");

int numero = teclado.nextInt();
System.out.println((numero > 10) ? "Mayor a 10" : "Menor a 10");

    }
}
