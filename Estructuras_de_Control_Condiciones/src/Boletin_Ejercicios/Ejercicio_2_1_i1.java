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
public class Ejercicio_2_1_i1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//Leer dos números enteros y diga si el segundo es divisor del primero (prevenir divisiones
//por cero, que causan error) Repasar operadores en cortocircuito para hacer un solo if
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num1 = teclado.nextInt();

        System.out.println("Ingresa otro numero");
        int num2 = teclado.nextInt();
        System.out.println((num2 > 0 && num1 % num2 == 0 && num2 <= num1) ? num1 / num2 : (num2 == 0 ? "No se puede dividir por cero" : "No divisor exacto"));
    }

}
