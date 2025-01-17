/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package drgt03;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class DRGt03e09 {
    public static void main(String[] args) {
        // TODO code application logic here
//3.9. Sumar una cantidad de números que se van introduciendo por teclado hasta que la suma de
//los mismos valga más de 100.

        int numero;
        int suma = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Introduce un numero");
            numero = teclado.nextInt();
            suma = suma + numero;

            if (suma <= 100) {
                System.out.println("La suma de los numeros es " + suma);
            } else {
                System.out.println("La suma de los numeros es " + suma + " y a superado el valor 100");
            }
        } while (suma <= 100);
    }
}
