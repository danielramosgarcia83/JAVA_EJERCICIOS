/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package drgt01;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class DRGt01e07 {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
1.7. Queremos realizar un pequeño programa para introducirlo en el ordenador de a bordo de
nuestro coche y que nos informe del consumo medio del coche cada 100 km. Diseña un programa
al que le introduzcamos el kilometraje de la última vez que se repostó, el kilometraje actual, los litros
de gasolina que tenía al finalizar la última vez que repostó y la cantidad de gasolina actual.
        
        consumo_medio c/100km?
        
        Que pida:
        kms_ult_repostaje
        km_actual
        lts_gasolina_ult_repostaje
        cant_gasolina_actual
         */
        float consumo_medio, km_ult_rep, km_act, lt_ult_rep, lt_act;
        

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce kilometraje de la ultima vez que se reposto");
        km_ult_rep = teclado.nextFloat();

        System.out.println("Introduce kilometraje actual");
        km_act = teclado.nextFloat();

        System.out.println("Introduce los litros de gasolina que tenia al finalizar la ultima vez que reposto");
        lt_ult_rep = teclado.nextFloat();

        System.out.println("Introduce la cantidad de gasolina actual");
        lt_act = teclado.nextFloat();

        //Aqui lo que ocurre es que Math.round redondea a entero, entonces lo que hay que hacer es
        //mult *100 antes del redondeo, y luego del redondeo /100.
        //De esta forma al *100 nos garantizamos 2 decimales.
        //Importante la f porq si la div es entre enteros dara entero aunq sea float.
        consumo_medio = Math.round(((lt_ult_rep - lt_act) / (km_act - km_ult_rep)*100)*100)/100f;
        
        

        System.out.println("km_act: " + km_act);
        System.out.println("km_ult_rep: " + km_ult_rep);
        System.out.println("lt_ult_rep: " + lt_ult_rep);
        System.out.println("lt_act: " + lt_act);

        System.out.println("Recorrido es: " + (km_act - km_ult_rep));
        System.out.println("Litros consumidos: " + (lt_ult_rep - lt_act));

        System.out.println("El consumo medio cada 100kms es: " + consumo_medio);
    }
}
