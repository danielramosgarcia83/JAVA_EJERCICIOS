/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package drgt03;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class DRGt03e02 {

    public static void main(String[] args) {
        // TODO code application logic here
//        Mostrar por pantalla los n primeros números naturales, siendo n el valor tecleado previamente. 

    Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int n=teclado.nextInt();
        System.out.println("los "+n+" primeros números naturales son:");
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}
