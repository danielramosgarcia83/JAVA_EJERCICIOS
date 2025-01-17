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
public class Ejercicio_2_1_j {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//j) Leer dos números enteros y diga si el menor de ellos es divisor del mayor (prevenir
//divisiones por cero, que causan error) Repasar operadores en cortocircuito para hacer
//un solo if
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el primer numero entero");
        int primer_num = teclado.nextInt();
        System.out.println("Ingresa el segundo numero entero");
        int segundo_num = teclado.nextInt();

        //Primer numero menor que el segundo
        if (primer_num < segundo_num)
        {
            //No cero y div exacta
            if (primer_num != 0 && segundo_num % primer_num == 0)
                {
                    System.out.println(primer_num + " es divisor de " + segundo_num);
                }
            else
                {
                    //divisor CERO
                    if (primer_num == 0)
                    {
                        System.out.println("NO CEROS");
                    }
                    //Division no exacta
                    else
                    {
                        System.out.println(primer_num + " No es divisor de " + segundo_num);
                    }
                }

        }
        //Segundo num menor que el primero
        else if (segundo_num<primer_num)
        {
        //No cero y div exacta
        if (segundo_num != 0 && primer_num %segundo_num  == 0)
                {
                    System.out.println(segundo_num + " es divisor de " + primer_num);
                }
            else
                {
                    //divisor CERO
                    if (segundo_num == 0)
                    {
                        System.out.println("NO CEROS");
                    }
                    //Division no exacta
                    else
                    {
                        System.out.println(segundo_num + " No es divisor de " + primer_num);

                    }
                }
        }
        //Son iguales, no procede calculos
        else
        {
            System.out.println("Son iguales");
        };
    }
    
    

}
