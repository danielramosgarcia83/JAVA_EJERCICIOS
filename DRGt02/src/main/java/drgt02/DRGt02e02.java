/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package drgt02;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class DRGt02e02 {

    public static void main(String[] args) {
        // TODO code application logic here

//2.2. Diseñar un programa al que se le introduzcan por consola tres números enteros. Si todos son
//negativos, mostrar el producto de los tres. Si alguno es negativo, pero no todos, mostrar la suma de
//los tres. En caso de que todos sean positivos sumar los dos primeros y multiplicar dicha suma por el
//tercero. ¿existe alguna combinación de los valores leídos no contemplado en el algoritmo? (Suponer
//que el cero es un número positivo). Hacer el programa lo más sencillo posible.
        int num1, num2, num3;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un primer numero entero");
        num1 = teclado.nextInt();
        System.out.println("Introduce un segundo numero entero");
        num2 = teclado.nextInt();
        System.out.println("Introduce un tercer numero entero");
        num3 = teclado.nextInt();

        System.out.println((num1 < 0 && num2 < 0 && num3 < 0) ? "Todos Negativos (Se multiplican todos): " + (num1 * num2 * num3)
                : (num1 >= 0 && num2 >= 0 && num3 >= 0) ? "Todos Positivos, la suma de los 2 primeros y mult por el tercero es: " + ((num1 + num2) * num3)
                        : "Alguno es negativo (Se suman todos): " + (num1 + num2 + num3));

    }
}
