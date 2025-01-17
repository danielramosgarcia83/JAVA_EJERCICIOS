/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Boletin_Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Ejercicio_2_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//2.15. Haz 3 versiones de un mismo programa, que pida que se introduzcan por teclado 2 números
//int sobre sendas variables llamadas ‘a’ y ‘b’ y que incluyan las instrucciones que se muestran abajo.
//Para cada una de las versiones, ejecútalo varias veces, introduciendo cero para alguno de los valores
//y finalmente explica la diferencia de comportamiento entre cada una de las versiones:
//• Versión a) if (b !=0 && a/b==0) {r = a/b; System.out.println(r);}
//• Versión b) if (a/b==0 && b !=0) {r = a/b; System.out.println(r);}
//• Versión c) if (b !=0 & a/b==0) {r = a/b; System.out.println(r);}
//Puede ser el mismo código con las tres sentencias junta, teniendo una sola vigente y las otras
//dos como comentarios. Comentando unas y descomentando otra vas probando cada caso.
//La explicación puedes ponerla en el propio código, al final, como comentarios. 
        int a,b,r;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        a = teclado.nextInt();
        System.out.println("Ingresa otro numero");
        b = teclado.nextInt();

        //• Versión a)
        // Aqui lo que ocurre es, que al ser a=0 ambas se cumplen y hace la operacion dando 0
        // y cuando es b=0 la primera condicion b!=0 no se cumple y no se ejecuta la condicion verdadera del IF
//        if (b != 0 && a / b == 0) {
//            r = a / b;
//            System.out.println(r);
//        }

        //• Versión b)
        //a=0 se cumplen ambas
        //b=0 dara un error la primera condicion a/b=0 y no se ejecutara dando un error por dividir por 0
//        if (a / b == 0 && b != 0) {
//            r = a / b;
//            System.out.println(r);
//        }
//
//        //• Versión c)
          // Aqui se usa solo 1 "&" y se evaluan ambas siempre, se cumplan o no, no hay corto, será igual al caso a) al final

        if (b != 0 & a / b == 0) {
            r = a / b;
            System.out.println(r);

        }
    }
}
