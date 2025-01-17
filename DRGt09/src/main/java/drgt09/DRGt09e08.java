package drgt09;

import java.util.Scanner;

/*
9.8. Crea una clase llamada Consola con un método estático sobrecargado llamado leerEntero()
que solicite al usuario que teclee un valor entero, cumpliendo las siguientes características:
• Si no se le pasa ningún parámetro, no tiene requisitos, es simplemente un nextInt().
• Si se le pasa un parámetro de tipo texto, escribe ese texto antes de solicitar el valor.
Ejemplo: leerEntero (“Introduzca su edad”);
• Si se le pasa un parámetro tipo texto y dos enteros, garantizará que el valor tecleado esté
comprendido entre ambos. Ejemplo: leerEntero (“Introduzca su edad”, 0, 120);
• Si se le pasan dos enteros, garantizará que el valor tecleado esté comprendido entre
ambos, pero no muestra texto de instrucciones previo. Ejemplo:
System.out.println (“Introduzca su edad”); leerEntero (0, 120);
Finalmente, haz un programa que pruebe todas las variantes del método.
 */
public class DRGt09e08 {

    public static void main(String[] args) {
        //Finalmente, haz un programa que pruebe todas las variantes del método.
        
        System.out.println("teclee un valor entero");
        Consola.leerEntero(10, 20);
    }
}

class Consola {

    static Scanner teclado = new Scanner(System.in);

    //1)
    //Si no se le pasa ningún parámetro
    //no tiene requisitos, es simplemente un nextInt()
    public static int leerEntero() {
        System.out.println("teclee un valor entero");
        return Integer.parseInt(teclado.nextLine());
    }

    //2))
    //Si se le pasa un parámetro de tipo texto
    //escribe ese texto antes de solicitar el valor
    //Ejemplo: leerEntero (“Introduzca su edad”);
    public static int leerEntero(String texto) {
        System.out.printf("%s \n Teclee un valor entero", texto);
        return Integer.parseInt(teclado.nextLine());
    }

    //3)
    //Si se le pasa un parámetro tipo texto y dos enteros
    //garantizará que el valor tecleado esté comprendido entre ambos.
    //Ejemplo leerEntero (“Introduzca su edad”, 0, 120);
    public static int leerEntero(String texto, int n1, int n2) {
        int num;

        System.out.printf("%s \n Teclee un valor entero min: %d - numero max: %d \n", texto, n1, n2);
        num = Integer.parseInt(teclado.nextLine());
        while (num < n1 || num > n2) {
            System.out.printf("Numero %d fuera de rango (Entre %d y %d)\n", num, n1, n2);
            System.out.printf("%s numero min: %d - numero max: %d \n", texto, n1, n2);
            num = Integer.parseInt(teclado.nextLine());
        }
        return num;
    }

    //4)
    //Si se le pasan dos enteros
    //garantizará que el valor tecleado esté comprendido entre
    //ambos, pero no muestra texto de instrucciones previo.
    //Ejemplo: System.out.println (“Introduzca su edad”); leerEntero (0, 120);
    public static int leerEntero(int n1, int n2) {
        int num;
        num = Integer.parseInt(teclado.nextLine());   
        while (num < n1 || num > n2) {
            num = Integer.parseInt(teclado.nextLine());
        }
        return num;
    }
}
