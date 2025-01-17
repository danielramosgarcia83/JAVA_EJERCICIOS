/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Boletin_de_Ejercicios;

/**
 *
 * @author Daniel
 */
public class Cuestiones_previas_F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        f)Indicar el valor de las variables enteras ‘a’, ‘b’ y ‘c’, ‘d’
        sobre las que se efectúan consecutivamente las operaciones:
         */
        int a = 3, b = 2;
        int c = a * b - b;
        int d = b * b;
        a = b - a;
        b++;
        d += 2;
        System.out.println(a); //a=2-3=-1
        System.out.println(b); //b=2+1=3
        System.out.println(c); //(3*2)-2=4
        System.out.println(d); //4+2=6

    }

}
