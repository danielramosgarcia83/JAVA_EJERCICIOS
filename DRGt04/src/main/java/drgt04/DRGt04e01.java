/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package drgt04;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class DRGt04e01 {

    public static void main(String[] args) {
        // TODO code application logic here

//Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente:
        Scanner teclado = new Scanner(System.in);
        String cad;
        int i,j;
        System.out.println("Ingresa una cadena");
        cad = teclado.nextLine();
        System.out.println("La cadena ingresada es : " + cad);
        System.out.println("/////////");

//a. Mostrar por pantalla el contenido de la cadena pasada a mayúsculas y minúsculas.
        System.out.println("a)Cadena en mayuscula: " + cad.toUpperCase());
        System.out.println("a)Cadena en Minuscula: " + cad.toLowerCase());

        System.out.println("/////////");

//b. Decir si en la cadena aparece el carácter ‘x’.
        for (i = 1; i < cad.length(); i++) {
            if (cad.charAt(i) == 'x') {
                System.out.println("b)La letra numero " + (i + 1) + " es X");
            };
        }
        System.out.println("/////////");

//c. Decir si la cadena tiene más de 10 posiciones.
//d. Decir si la cadena contiene el carácter ‘x’ a partir de la cuarta posición.
        for (i = 1; i < cad.length(); i++)
        {
            if(i>=4 && cad.charAt(i)=='x')
                System.out.println("d)Contiene X en la posicion "+(i+1));
        }
            
        System.out.println("/////////");

//e. Crear una cadena formada por las 5 primeras posiciones de la cadena.




//f. Crear una cadena formada por las 5 últimas posiciones de la cadena.
//g. Decir si la cadena es igual a la cadena “hola”.
//h. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena
//es un número, esto es, contiene solo dígitos decimales (del 0 a 9)
//i. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena
//es un número hexadecimal, esto es, contiene solo dígitos decimales (del 0 a 9) y letras de
//la A a F.
//j. Si se encuentra con en su interior con “prueva” sustituir por “prueba”.
//k. Decir si la primera posición de la cadena es igual a la última.
//l. Decir cuántos dígitos numéricos hay en la cadena.
//Como vimos en el primer capítulo, cuando se solicita al usuario un número con los métodos de la
//clase Scanner: nextInt(), nextFloat(), etc. y luego un String con nextLine() se produce un error, ya
//que interpreta el <ENTER> que introducimos al final del número como el contenido de la cadena,
//por lo que la cadena toma valor vacío. Para evitar esto, a partir de este momento, se recomienda
//dejar de usar nextInt(), nextInt(), etc. y usar solo nextLine() con la conversión correspondiente, por
//ejemplo:
//int i = Integer.parseInt (teclado.nextLine());
//Programación - Ejercicios - Cadenas
//Fernando Rodríguez Diéguez. IES Fernando Wirtz Pág. 17
//m. Decir si la cadena es un palíndromo (se lee igual hacia adelante como hacia atrás)
//n. Crear una cadena que sea igual a la introducida, pero con la primera y última posiciones
//intercambiadas. Ejemplo: si introducen: “abcde”, obtendría “ebcda”.

    }
}
