/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package drgt03;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class DRGt03e06 {
    public static void main(String[] args) {
        // TODO code application logic here

//3.6. Diseñar un programa que muestre los números pares comprendidos entre 100 y 1 en orden descendente. 
        int i, contador = 0;

        for (i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
