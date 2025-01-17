/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Boletin_de_Ejercicios;

/**
 *
 * @author Daniel
 */
public class Cuestiones_previas_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Precedencias
        1) Incrementos/Decrementos ++,+=,--,-=
        2) *,/,%
        3)+,-
        4)Logicos : <,<=,>,>=,==,!= &&, ||
        */
        int a=2*3+4; //(2*3=6)+4=10
        int b=4+2*3; //4+(2*3=6)=10
        int c=5-10%2; //5-(residuo 10/2=0)=5
        float d=5/2; // 5/2=2 porque la division es entre enteros, por ende el "a" tambien lo será
        float e=5f/2; //5/2=2.5 Hemos dejado claro que uno no es entero, por eso da decimales
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        
    }
    
}
