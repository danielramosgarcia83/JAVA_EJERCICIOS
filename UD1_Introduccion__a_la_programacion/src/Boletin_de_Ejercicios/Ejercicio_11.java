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
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
1.11. Diseñar un programa al que se le introduzca la longitud de dos catetos de un ángulo recto y
nos devuelva el valor de la hipotenusa. Busca en internet como calcular en Java potencias y raíces
cuadradas para aplicar el teorema de Pitágoras. Investiga también si existe en Java alguna utilidad
que nos haga este cálculo automáticamente. 
         */
        int a, b, h;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Valor del cateto A: ");
        a = teclado.nextInt();

        System.out.println("Valor del cateto B: ");
        b = teclado.nextInt();
        //Formula de la hipotenusa:
        //h= (int) Math.sqrt(Math.pow(a, 2)+Math.pow(b,2));

        h = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("El valor de la Hupotenusa es: " + h);

    }

}
