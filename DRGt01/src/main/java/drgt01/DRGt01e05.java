/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package drgt01;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class DRGt01e05 {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
1.5. Un departamento de climatología ha realizado recientemente su conversión al sistema
métrico. Diseñar un algoritmo para realizar las siguientes conversiones:

• Leer por consola la temperatura dada en la escala Celsius y mostrar su equivalente
Fahrenheit (la fórmula de conversión es “F=9/5 ºC+32”). Resultado redondeado a dos
decimales.
• Leer la cantidad de agua del pluviómetro en pulgadas y mostrar su equivalente en
centímetros (25.5 mm = 1 pulgada). Resultado redondeado a un decimal.
         */

        float celsius, fahrenheit, pulgadas, centimetros, conversion_a_celsius, conversion_a_fahrenheit, conversion_a_pulgadas, conversion_a_centimetros;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce temperatura en Celsius: ");
        celsius = teclado.nextFloat();
        System.out.println("Introduce temperatura en Fahrenheit: ");
        fahrenheit = teclado.nextFloat();
        System.out.println("Introduce cantidad de agua en pulgadas: ");
        pulgadas = teclado.nextFloat();
        System.out.println("Introduce cantidad de agua en centimetros: ");
        centimetros = teclado.nextFloat();
        conversion_a_fahrenheit = Math.round((9f / 5 * celsius + 32) * 100) / 100f;
        System.out.println("La conversion de Celsius a fahrenheit es: " + conversion_a_fahrenheit);
        conversion_a_celsius = Math.round((5 * (fahrenheit - 32) / 9) * 100) / 100f;
        System.out.println("La conversion de fahrenheita a Celsius es: " + conversion_a_celsius);
        conversion_a_centimetros=Math.round(pulgadas*25.4f*100)/100.0f ;
        System.out.println("La conversion de Pulgadas a mm es: "+conversion_a_centimetros);
        conversion_a_pulgadas=Math.round(centimetros/25.4f*100)/100.0f ;
        System.out.println("La conversion de MM a Pulgadas es: "+conversion_a_pulgadas);
    }
}
