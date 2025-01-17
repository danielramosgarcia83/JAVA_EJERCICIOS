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
public class Ejercicio_2_1_m {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//m) Leer tres números enteros y diga hay alguno mayor que cero, pero no todos.

//Lo resolvi con el concepto de numeros binarios:
// todas las combinaciones con 3 ceros
//000 Todos menores ELSE
//001 1 diferente (primer grupo logico)
//010 1 diferente (primer grupo logico)
//011 2 diferentes (segundo grupo logico)
//100 1 diferente (primer grupo logico)
//101 2 diferentes (segundo grupo logico)
//110 2 diferentes (segundo grupo logico)
//111 Todos mayores ELSE
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el primer numero entero");
        int a = teclado.nextInt();
        System.out.println("Ingresa el segundo numero entero");
        int b = teclado.nextInt();
        System.out.println("Ingresa el tercer numero entero");
        int c = teclado.nextInt();

//        if ((a <= 0 & b <= 0 & c > 0) || (a <= 0 & b > 0 & c <= 0) || (a > 0 & b <= 0 & c <= 0)|| 
//            (a <= 0 & b > 0 & c > 0) || (a > 0 & b <= 0 & c > 0) || (a > 0 & b > 0 & c <= 0))



        if ((a >0 || b > 0 || c > 0) && (a <= 0 || b <= 0 || c <= 0)) {
            System.out.println("Son mayores a cero pero no todos " + a + " " + b + " " + c);
        } else if (a > 0 & b > 0 & c > 0) {
            System.out.println("Son todos o mayores que cero " + a + " " + b + " " + c);
        } else {
            System.out.println("Son todos menores o igual a cero " + a + " " + b + " " + c);
        }
    }

}
