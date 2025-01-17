/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin_Ejercicios;

/**
 *
 * @author Daniel
 */
public class Ejercicio_3_27 {

    public static void main(String[] args) {
        // TODO code application logic here

//3.27. La suma de los dígitos de los números múltiplos de tres es también un múltiplo de tres.
//Realizar un programa que compruebe si esta afirmación es correcta o no para los primeros 10000
//números enteros positivos.
        for (int i = 1; i <= 100; i++) {
            if (i < 10) {
                if (i % 3 == 0) {
                    System.out.println(i + " es multiplo de 3");
                }

            }
            else if (i < 100) {
                if (i % 3 == 0) {
                    System.out.println(i + " es multiplo de 3");
                    int decena = i/10;
                    int unidad= i-(decena*10);
                    
                    if((decena+unidad)%3==0)
                    {
                        System.out.println(decena + " + " + unidad +"("+   decena + unidad +")"+" es multiplo de 3");
                    }
                    else
                    {System.out.println(decena + " + " + unidad + " NO ES MULTIPLO DE 3");}
                    
                    
                }

            }
        }

    }

}
