/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drgt09;

/**
 *
 * @author Daniel
 */
public class Cuestiones {

    public static void main(String[] args) {

// a) Vamos a definir una variable Bicho pero llamar sobre ella al constructor de BichoDormilon.

//¿Qué mostraría el siguiente código?

        Bicho bi2 = new BichoDormilon(10);
        System.out.println("bi2 -> hambre: " + bi2.hambre);
        
        //No se puede acceder a esta propiedad sueño,
        //porque aunq se ha instanciado un BichoDormilon,el tipo es BICHO,
        //No tiene ese atributo
        //System.out.println("bi2 -> sueño: " + bi2.sueño);
        
//b) ¿Solucionaríamos el problema del println anterior así?
//SI, porque se le hace un casting, para que se comporte como tipo BichoDormilon
        System.out.println("bi2 -> sueño: " + ((BichoDormilon) bi2).sueño);

//c)¿Y así?
//Por el print, intuyo que se piensa que, bi2 es igual a bd4
//No es asi, bd4 es otro objeto, pero que apunta a la misma referencia que bi2
        BichoDormilon bd4 = (BichoDormilon) bi2;
        System.out.println("bd2 -> sueño : " + bd4.sueño);
        
 //Demostracion:
 //Si cambio el valor de atrib hambre, aplica para ambos
 //Ambos objetos apuntan a la misma ref en memoria
        bi2.hambre=100;
        System.out.println(bi2.hambre);
        System.out.println(bd4.hambre);
    }

}
