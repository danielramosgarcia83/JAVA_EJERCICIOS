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
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
    1.4. Queremos conocer los datos estadísticos de una asignatura, por lo tanto, necesitamos un
programa al que se le introduzcan por consola el número de suspensos, suficientes, notables y
sobresalientes de una asignatura, y nos calcule:
• El tanto por ciento de alumnos que han superado la asignatura.
• El tanto por ciento de notables y sobresalientes de la asignatura.
    
    Trata de minimizar el número de operaciones realizadas. Los datos se introducen en variables sin
decimales, pero los porcentajes sí tienen decimales. ¿Tendría algún sentido pedirle al usuario que
introdujese el total de alumnos? 
         */
        int suspensos, suficientes, notables, sobresalientes,total;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce numero de suspensos: ");
        suspensos = teclado.nextInt();
        System.out.println("Introduce numero de suficientes: ");
        suficientes = teclado.nextInt();
        System.out.println("Introduce numero de notables: ");
        notables = teclado.nextInt();
        System.out.println("Introduce numero de sobresalientes: ");
        sobresalientes = teclado.nextInt();

        //% superados
        //Primero necesitamos el total, sumando todas las variables.
        total = suspensos + suficientes + notables + sobresalientes;
        //% superados:
        System.out.println("% de superados: " + ((float)(total - suspensos) / total) * 100 + "%");
        //%Notables
        System.out.println("% de notables: " + ((float)notables / total) * 100 + "%");
        //%sobresalientes
        System.out.println("% de sobresalientes: " + ((float)sobresalientes / total) * 100 + "%");

    }

}
