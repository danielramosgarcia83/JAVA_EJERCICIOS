/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variables;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class EntradaTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        System.out.print("Introduce un valor: ");
        int valor=teclado.nextInt();
        System.out.print("El valor es: "+ valor);
        
    }
    
}
