/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Boletin_Ejercicios;

/**
 *
 * @author Daniel
 */
//3.7. Indica la funcionalidad del siguiente programa. ¿Tiene algún error?¿Falta alguna llave?
//¿Podrías reducir el recorrido del for para que el programa sea más rápido, manteniendo su
//funcionalidad?
import java.util.Scanner;

public class Ejercicio_3_7 {

    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número natural entre 1 y 1000: ");
        num = teclado.nextInt();
        if (num < 0 || num > 1000) //Aqui no puede ser && para garantizar que el num este entre 0 y 1000
        {
            System.out.println("Numero incorrecto.");
        } else {
            for (int i = num; i >= 1; i--)//el iterador es i, no num, esto "num >= 1" es incorrecto
            {
                if (num % i == 0) {
                    System.out.println(num + " dividido por " + i + " es exacto"); //Creo que busca las divisiones exactas, lo pondre en el print
                }
            }
        }
    }
}
