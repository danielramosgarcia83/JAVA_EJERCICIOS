/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Boletin_Ejercicios;

/**
 *
 * @author Daniel
 */
public class Cuestiones_previas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//Contestar con una frase que es lo que muestran estos programas (intenta contestar sin ejecutarlo):
//a) for (int i=1; i<=10; i++) System.out.println(i);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //imprime del 1 al 10
//b) for (int i=1; i<=10; i+=2) System.out.println(i);
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }

        //impares hasta el 9
//c) for (int i=1; i<=10; i--) System.out.println(i);
        //Bucle infinito
//d) for (int i=10; i>=1; i--) System.out.println(i);
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

// del 10 al 1

//////
//Los siguientes suponiendo int j=10, k=20
//////

        int j = 10, k = 20;
//e) for (int i=j; i<=k; i++) System.out.println(i);

        for (int i = j; i <= k; i++) {
            System.out.println(i);
        }

//Desde 10 a 20
//f) for (int i=j+1; i<=j+5; i++) System.out.println(i);
        for (int i = j + 1; i <= j + 5; i++) {
            System.out.println(i);
        }

//f) i=11, i<=15. Imprime esos, del 11 al 15
        for (int i = k; i >= j; i--) {
            System.out.println(i);
        }

//g) i=20  20>=10 i-1. Imprime regresivo, del 20 al 10


//h) i=10; while (i>=j && i<=k) System.out.println(i);
//        int i = 10;
//        while (i >= j && i <= k) {
//            System.out.println(i);
//        }
//h) 10>=10 AND 10<=20, imprime 10 infinitamente

//i) i=10; while (i>=j && i<=k) { System.out.println(i); i++;}
        int i = 10;
        while (i >= j && i <= k) {
            System.out.println(i);
            i++;
        }

//i) imprime del 10 al 20

//j) i=10; while (i>=j || i<=k) { System.out.println(i); i+=3;}
//        i = 10;
//        while (i >= j || i <= k) { 
//            System.out.println(i);
//            i += 3;
//        }

//j) i >=10 OR 10<=20 imprime desde el 10 sumando 3 infinitamente
//Porque es un OR, siempre será i>=10. 



int edad = 28;
String nombre = "David";
String resultado = String.format("Nombre:%s,edad:%d años",nombre,edad); 
        System.out.println(resultado);
    }

}
