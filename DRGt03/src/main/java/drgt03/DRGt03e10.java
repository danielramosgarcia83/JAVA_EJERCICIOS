/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package drgt03;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class DRGt03e10 {
    public static void main(String[] args) {
        // TODO code application logic here

//Programa al que se le introduzcan las edades de los alumnos (-1 para finalizar) y nos informe
//si hay alguno menor de edad.
//En cuanto encuentre un menor de edad, la respuesta va a ser “Sí hay alguno”,
//aunque luego sigamos introduciendo edades, esta situación ya no va a cambiar, ojo
//al hacer el “if”.

        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la edad de (-1 para finalizar):");
        numero = teclado.nextInt();

        if (numero == -1) {
            System.out.println("Programa finalizado");
        } else {
            while (numero >= 18) {
                System.out.println("Introduce otra edad (-1 para finalizar):");
                numero = teclado.nextInt();

            }
            while(numero != -1) {
                System.out.println("Sí hay alguno");
                System.out.println("Introduce otra edad (-1 para finalizar):");
                numero = teclado.nextInt();
            }
            System.out.println("Programa finalizado");
        }

    }
}
