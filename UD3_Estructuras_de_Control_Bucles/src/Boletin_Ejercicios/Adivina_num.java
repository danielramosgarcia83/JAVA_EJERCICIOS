/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Boletin_Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Adivina_num {

    public static void main(String[] args) {
        int dificultad, intentos, numero_aleatorio;
        int numero_elegido;
        int intentos_usados = 1;

        Random random = new Random();
        numero_aleatorio = random.nextInt(11);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Elige dificultad:");
        System.out.println("1-Facil: 5 intentos");
        System.out.println("2-Medio: 3 intentos");
        System.out.println("3-Dificil: 2 intentos");

        dificultad = teclado.nextInt();
        
        while(dificultad<1||dificultad>3)
            
        {
                System.out.println("Error, Elige dificultad entre 1-3:");
                dificultad = teclado.nextInt();
        }
        
        intentos = switch (dificultad)
        
        {
            case 1 -> 5;
            case 2 -> 3;
            default -> 2;
        };

        do
        {
            
            System.out.println("Elige un numero entre 0-10:");
            System.out.println("Numero de intentos restantes: "+intentos);

            numero_elegido = teclado.nextInt();
            
            if (numero_elegido > numero_aleatorio)
            {
                System.out.println("Numero muy alto.");
            }
            
            else if (numero_elegido < numero_aleatorio)
            {
                System.out.println("Numero muy bajo.");
            }
            
            else
            {
                System.out.println("Bien, el numero es: " + numero_aleatorio + ". Numero de intentos: " + intentos_usados);
                return;
            }
            
            intentos--;
            intentos_usados++;
            
        }
        
        while (intentos > 0);

            System.out.println("Se te acabaron los intentos. El numero era: " + numero_aleatorio);
        
    }
}
