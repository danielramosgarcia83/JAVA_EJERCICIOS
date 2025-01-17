/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package drgt03;

/**
 *
 * @author Daniel
 */
public class DRGt03e14 {
    public static void main(String[] args) {
        // TODO code application logic here

//3.14. Diseñar un algoritmo que informe de los números perfectos que hay entre 1 y 10000. Un
//número perfecto si es igual a la suma de todos los divisores menores que él. 
        for (int i = 1; i <= 1000; i++) {
            
            int suma = 0;
            for (int j = 1; j < i - 1; j++) {
                if (i % j == 0) {
                    suma = suma + j;
                }
            }
            if (suma == i) {
                System.out.println(i + " es un numero perfecto");
            }
        }
    }
}
