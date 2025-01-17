/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud4_strings_o_cadenas;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        boolean a = true;
//        boolean b = false;
//
//        if ((!a || !b) && (b || a)) {
//            System.out.println("Se cumple");
//        }
//
//        Scanner tec = new Scanner(System.in);
//        System.out.println("Escribe un numero del 1 y 1000");
//        int num = tec.nextInt();
//        int intentos = 0;
//        int i = 0;
//
//        if (num > 1 && num < 1001) {
//            while (i != num) {
//                i = (int) (Math.random() * 1000 + 1);
//                intentos++;
//            }
//        }
//        if (i == num) {
//            System.out.println("Total intentos para encontrar tu numero de forma aleatoria:%d\r\n" + intentos);
//        } else {
//            System.out.println("No he encontrado tu numero");
//        }

        String a = "12111";

        String s = "";

        for (int i = 0; i < a.length();) {
            s = s + i;
            i += Integer.parseInt(a.substring(i, i + 1));
        }
        System.out.println(s);

    }
}
