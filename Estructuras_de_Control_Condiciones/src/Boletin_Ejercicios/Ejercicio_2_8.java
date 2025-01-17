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
public class Ejercicio_2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//
//        2.8. La tabla siguiente representa las horas de salida de un bus
//        . Diseña un algoritmo al que se le introduzca el día (1-7) y la hora(9 - 14)
//        , verifique la entrada y nos informe si hay bus o no.Hacer una
//        primera condición que haga la verificación de la entrada de datos y otra única condición para ver si
//        hay bus.
        int dia, hora;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el dia (1-7)");
        dia = teclado.nextInt();
        System.out.println("Introduce hora (9-14)");
        hora = teclado.nextInt();

//        System.out.println(((dia < 1 || dia > 7) || (hora < 9 || hora > 14)) ? "Dia u hora invalido"
//                //  Condicional de Lun, mar, mir y vier, buses a las 9 y 14.
//                : (dia > 0 && dia < 6 && dia != 4) && (hora == 10 || hora == 14) ? "Hay buses a las " + hora
//                        //  Condicional de jueves, buses a las 9,12 y 14.
//                        : (dia == 4) && (hora == 10 || hora == 12 || hora == 14) ? "Hay buses a las " + hora
//                                //  Condicional de Sabados solo a las 10.
//                                : (dia == 6 && hora == 10) ? "Hay buses a las " + hora
//                                        //  Condicional de domingos, buses desde 9 a 14.          
//                                        : (dia == 7 && (hora > 8 && hora < 15)) ? "Hay buses a las " + hora : "No hay buses los dias " + dia + " a las " + hora
//        );

        if ((dia < 1 || dia > 7) || (hora < 9 || hora > 14)) {
            System.out.println("Dia u hora invalido");
        } else {
            switch (dia) {
                //Lun, mar, mier, vier, buses a las 10 y 14
                case 1, 2, 3, 5 ->
                    System.out.println((hora == 10 || hora == 14) ? "Hay buses a las " + hora : "El dia " + dia + " a las " + hora + " hora no tiene buses");
                case 4 ->
                    System.out.println((hora == 10 || hora == 12 || hora == 14) ? "Hay buses a las " + hora : "El dia " + dia + " a las " + hora + " hora no tiene buses");
                case 6 ->
                    System.out.println((hora == 10) ? "Hay buses a las " + hora : "El dia " + dia + " a las " + hora + " hora no tiene buses");
                case 7 ->
                    System.out.println(((hora > 8 && hora < 15)) ? "Hay buses a las " + hora : "El dia " + dia + " a las " + hora + " hora no tiene buses");
            }
        };

    }
}
