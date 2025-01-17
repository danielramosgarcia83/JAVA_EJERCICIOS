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
public class DRGt02e01c {

    public static void main(String[] args) {
        // TODO code application logic here
        //c) Leer un número entero y de determinar si se trata de un número par o impar.
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero entero");
        int numero = teclado.nextInt();
        
        System.out.println(numero%2==0?"El numero es par":"El numero es impar");
    }
}
