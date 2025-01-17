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
public class Ejercicio_2_1_k {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//Leer un número y decir si es múltiplo de 2, de 3 y/o de 10. Si no es múltiplo de 2 ya no
//hay que mirar si lo es de 10.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero entero");
        int numero = teclado.nextInt();
        int mult2 = numero % 2;
        int mult3 = numero % 3;
        int mult10 = numero % 10;

        if(mult2==0)
        {
            if(mult3==0)
            {
                if(mult10==0)
                {
                    System.out.println(numero+" Es multiplo de 2,3,10");
                }
                else
                    {
                        System.out.println(numero+" Es multiplo de 2 y 3");
                    }
            }
            else
            {
                if (mult10==0)
                        {
                        System.out.println(numero+" Es multiplo de 2 y 10");
                        }
                else
                        {
                        System.out.println(numero+" Es multiplo de 2");
                        }
            }
        }        
        else
        {
            if(mult3==0)
            {
                System.out.println(numero+" Es multiplo de 3");
            }
            else
            {
                System.out.println(numero+" No es multiplo de nunguno");
            }
        }
        
        }
    }


