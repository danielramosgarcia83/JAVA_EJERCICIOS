/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package drgt03;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class DRGt03e04 {
    public static void main(String[] args) {
        // TODO code application logic here

//3.4. Diseñar un programa capaz de leer un valor entero, que verifique que esté comprendido entre
//1 y 10, y mostrar su tabla de multiplicar. 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = teclado.nextInt();
        if (numero>0&&numero<=10)
        {
            System.out.println("La tabla de multiplicar por "+numero+" de es:");
            for(int i=0;i<=10;i++)
            {
                System.out.println(numero+"*"+i+"="+i*numero);
            }
        }
        else
        {
            System.out.println("El numero " + numero + " esta fuera del rango 1 y 10");
        };
    }
}
