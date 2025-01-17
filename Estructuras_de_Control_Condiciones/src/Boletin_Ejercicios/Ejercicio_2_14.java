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
public class Ejercicio_2_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        2.14. Diseña un algoritmo capaz de obtener la letra del DNI a partir del número de DNI. Consiste
//en dividir dicho número entre 23 y tomar el resto de la división asignándole la letra correspondiente
//según la siguiente tabla (Hacer con switch, no empleando ni arrays ni String)
//    
//RESTO 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
//LETRA T R W A G M Y F P D  X  B  N  J  Z  S  Q  V  H  L  C  K  E

        int resto;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa número de DNI");
        resto = teclado.nextInt() % 23;

        switch (resto) {
            case 0 ->
                System.out.println("La letra del DNI es T");
            case 1 ->
                System.out.println("La letra del DNI es R");
            case 2 ->
                System.out.println("La letra del DNI es W");
            case 3 ->
                System.out.println("La letra del DNI es A");
            case 4 ->
                System.out.println("La letra del DNI es G");
            case 5 ->
                System.out.println("La letra del DNI es M");
            case 6 ->
                System.out.println("La letra del DNI es Y");
            case 7 ->
                System.out.println("La letra del DNI es F");
            case 8 ->
                System.out.println("La letra del DNI es P");
            case 9 ->
                System.out.println("La letra del DNI es D");
            case 10 ->
                System.out.println("La letra del DNI es X");
            case 11 ->
                System.out.println("La letra del DNI es B");
            case 12 ->
                System.out.println("La letra del DNI es N");
            case 13 ->
                System.out.println("La letra del DNI es J");
            case 14 ->
                System.out.println("La letra del DNI es Z");
            case 15 ->
                System.out.println("La letra del DNI es S");
            case 16 ->
                System.out.println("La letra del DNI es Q");
            case 17 ->
                System.out.println("La letra del DNI es V");
            case 18 ->
                System.out.println("La letra del DNI es H");
            case 19 ->
                System.out.println("La letra del DNI es L");
            case 20 ->
                System.out.println("La letra del DNI es C");
            case 21 ->
                System.out.println("La letra del DNI es K");
            case 22 ->
                System.out.println("La letra del DNI es E");
        }

    }

}
