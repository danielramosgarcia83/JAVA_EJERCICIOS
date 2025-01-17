/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package drgt01;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class DRGt01e09 {

    public static void main(String[] args) {

        int var1, var2;
        int var_intercambio = 0;
        /*El siguiente programa pretende intercambiar dos variables enteras introducidas previamente,
y luego mostrarlas por pantalla. Corrige los errores que encuentres en el código. */

//Primer error, falta instanciar el objeto Scanner:
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce var1: ");
        var1 = teclado.nextInt();
        System.out.print("Introduce var2: ");
        var2 = teclado.nextInt();

        //Yo pondria valores de las variables antes del intercambio
        System.out.println("Valor var1 antes de intercarmbiar es: "+ var1 + " y de Var2 es: "+ var2);
        
        //Usaria una variable intermedio "var_intercambio" para no cargarme el valor de var1 y poder devolverlo a var2:
        var_intercambio=var1;
        
        var1 = var2;
        var2 = var_intercambio;

        //Falta incluir la var en el print para ver su valor:
        //System.out.println("Ahora var1 es igual a var1");
        //System.out.println("Ahora var2 es igual a var2");
        
        System.out.println("Ahora var1 es igual a var1");
        System.out.println("Ahora var2 es igual a var2");
        
        System.out.println("Valor var1 despues de intercarmbiar es: "+ var1 + " y de Var2 es: "+ var2);


    }
}
