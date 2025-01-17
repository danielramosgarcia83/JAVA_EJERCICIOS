/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package drgt02;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class DRGt02e05 {

    public static void main(String[] args) {
        // TODO code application logic here
        
//2.5. Diseñar un algoritmo al que se le introduzca la cantidad de horas, minutos y segundo
//mostrados en un reloj digital, que verifique que los valores sean correctos y calcule el total de
//segundos transcurridos desde el comienzo del día. No emplear las clases de fecha de Java.
//23:59:57 será una hora correcta y 25:61:88 será una hora incorrecta 
        int hora, min, seg;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce Hora(s)");
        hora = teclado.nextInt();

        System.out.println("Introduce Minuto(S)");
        min = teclado.nextInt();

        System.out.println("Introduce segundo(s)");
        seg = teclado.nextInt();
        
        boolean comprobador = (hora <= 24) && (min <= 60) && (seg <= 60);

        System.out.println((comprobador) ? hora+" Hora(s), " + min + " minuto(s) y " +seg+ " segundo(s), son: " + ((hora*60*60)+(min*60)+seg) + " segundos.": "Alguno es incorrecto");

    }
}
