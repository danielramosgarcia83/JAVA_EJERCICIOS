 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Boletin_de_Ejercicios;

import java.util.Scanner;

public class Ejercicio_9_1 {

    public static void main(String[] args) {

        int var1, var2;
        /*El siguiente programa pretende intercambiar dos variables enteras introducidas previamente,
y luego mostrarlas por pantalla. Corrige los errores que encuentres en el código. */

//Primer error, falta instanciar el objeto Scanner:
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce var1: ");
        var1 = teclado.nextInt();
        System.out.print("Introduce var2: ");
        var2 = teclado.nextInt();

        //Yo pondria en el print valores de las variables antes del intercambio
        //System.out.println("Ahora var1 es igual a var1");
        //System.out.println("Ahora var2 es igual a var2");
        System.out.println("Valor antes de intercarmbiar de var1 es: " + var1 + " y de Var2 es: " + var2);

        var1 += var2;
        var2 = var1 - var2;
        var1 -= var2;

        System.out.println("Valor despues de intercarmbiar de var1 es: " + var1 + " y de Var2 es: " + var2);

    }
}
