/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_prueba_de_compatibilidad;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Tarea_prueba_de_compatibilidad_Version_SWITCH {

    /*
    
Elaboraremos un programa que recoja las preferencias de una persona en cuanto a comida, deportes, aficiones, etc.
Presentaremos varias preguntas (al menos 4) al usuario con el siguiente formato de muestra:

Elige tu comida favorita:

1) Ensalada César.
2) Lentejas.
3) Pasta Carbonara
4) frijol

Ingrese el número de opción:
    
Una vez que el usuario haya ingresado el número que precede a la opción elegida. Acumularemos puntos de compatibilidad según
la opción seleccionada. Por ejemplo, a fabada le doy 5 puntos, a la pasta 3 y a las demás opciones solo 1. Si el usuario elige
Fabada, acumularé 5 puntos y seguiré haciendo preguntas.
Al final publicaré el porcentaje de compatibilidad que será la puntuación obtenida dividida por el total de puntos posibles
(máxima puntuación posible) multiplicado por 100.
Hacer una versión con estructura "if" y otra con estructura "switch" (versión con ->)
    
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, elige tu preferencia Musical de la siguiente lista: 1)GROUNGE 2)POP 3)ROCK 4)BLUE");
        int eleccion_musica = teclado.nextInt();
        System.out.println("Por favor, elige tu preferencia en Peliculas de la siguiente lista: 1)Belicas 2)Accion 3)Ciencia Ficcion 4)Terror 5)Drama");
        int eleccion_peliculas = teclado.nextInt();
        System.out.println("Por favor, elige tu preferencia en coches de la siguiente lista: 1)Deportivos 2)Clasicos 3)Antiguos 4)Descapotables");
        int eleccion_coches = teclado.nextInt();
        System.out.println("Por favor, elige tu preferencia en coches de la siguiente lista: 1)Casual 2)Deportiva 3)Vintage 4)Minimalista");
        int eleccion_ropa = teclado.nextInt();

        //Declaracion de variables global que guarda la seleccion del usuario
        int preferencia = 0;
        int puntos_max = 5 * 4;

        //MUSICA
        switch (eleccion_musica) {
            case 1 ->
                preferencia += 1;
            case 2 ->
                preferencia += 2;
            case 3, 4 ->
                preferencia += 5;
            default ->
                System.out.println("Opcion Musica: " + eleccion_musica + " no disponible, no sumas puntos");
        };

        //PELICULAS
        switch (eleccion_peliculas) {
            case 1 ->
                preferencia += 1;
            case 2 ->
                preferencia += 2;
            case 3 ->
                preferencia += 3;
            case 4 ->
                preferencia += 4;
            case 5 ->
                preferencia += 5;
            default ->
                System.out.println("Opcion Peliculas: " + eleccion_peliculas + " no disponible, no sumas puntos");
        };

        //COCHES
        switch (eleccion_coches) {
            case 1, 2 ->
                preferencia += 2;
            case 3, 4 ->
                preferencia += 4;
            default ->
                System.out.println("Opcion Coches: " + eleccion_coches + " no disponible, no sumas puntos");

        };

        //ROPA
        switch (eleccion_ropa) {
            case 4, 1 ->
                preferencia += 5;
            case 3 ->
                preferencia += 2;
            case 2 ->
                preferencia += 1;
            default ->
                System.out.println("Opcion Ropa: " + eleccion_ropa + " no disponible, no sumas puntos");

        };
        System.out.println("Compatibilidad: " + ((float) preferencia / puntos_max) * 100 + "%");

    }
}
