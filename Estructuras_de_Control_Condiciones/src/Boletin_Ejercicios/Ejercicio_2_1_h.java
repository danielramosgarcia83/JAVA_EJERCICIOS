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
public class Ejercicio_2_1_h {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//h) Leer dos números y decir si el primero es mayor que el segundo, si es menor o si los dos
//números son iguales.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el primer numero entero");
        int primer_num = teclado.nextInt();
        System.out.println("Ingresa el segundo numero entero");
        int segundo_num = teclado.nextInt();
        
        
//        SENTENCIA CON IF

        if (primer_num==segundo_num)
            System.out.println("Son iguales");
        else
        {
            if (primer_num>segundo_num)System.out.println("El primero es mayor");
            else System.out.println("El primero es menor");
        }
        
//        SENTENCIA IF CON OPERADOR ?
        System.out.println((primer_num==segundo_num)?
                "Son Iguales":
                (primer_num>segundo_num?
                        "El primero es mayor":"El primero es menor"));
    }
    
}
