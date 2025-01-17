/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud3_compresor_descompresor_de_cadenas_sencillo;

import java.util.Scanner;

/**
 *
 * @author mike
 */
public class Compresor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("Introduce una cadena con repeticiones (sin digitos):");
        String cadenaO = tec.nextLine();
        String comprimida = "";
        int i, j;
        //Variables para hacer la descompresion de la cadena con repeticiones:
        String cadenaD = "";
        String dig = "";
        int x, y;

        for (i = 0; i < cadenaO.length(); i++) {
            for (j = i + 1; j < cadenaO.length() && cadenaO.charAt(i) == cadenaO.charAt(j); j++);
            if (j - i > 1) {
                comprimida += (j - i);
                comprimida += cadenaO.charAt(i);
                i = j - 1;
            } else {
                comprimida += cadenaO.charAt(i);
            }
        }
        System.out.println("La cadena comprimida es:" + comprimida);

        /////DESCOMPRESION/////
        for (x = 0; x < comprimida.length(); x++) {
            ///Sí caracter es digito:
            if (Character.isDigit(comprimida.charAt(x)))
            {
                //Si el siguiente es digito tambien, ocurre una cancatenacion en una cadena de digitos (DIG)
                //sin considerar el ultimo digito, ese se agrega siempre despues del bucle
                //y seria el caso de que solo fuese 1 digito.
                for (y = x; y < comprimida.length() && Character.isDigit(comprimida.charAt(y + 1)); y++)
                {
                    dig += comprimida.charAt(y);
                }
                //En caso de no ser al menos 2 consecutivos, agrega el digito sin mas.
                dig += comprimida.charAt(y);
                //Bucle de repeticiones de digitos:
                for(int c=1;c<Integer.parseInt(dig);c++)
                {
                    cadenaD += comprimida.charAt(y+1);
                }
                //Y finalmente, agregar la letra siguiente al digito a la cadena Descomprimida
                cadenaD += comprimida.charAt(y + 1);
                //Con esto, actualizo el ITERADOR X y reinciamos la cadena DIG para la siguiente vuelta
                x = y + 1;
                dig="";
            } ///Caracter no es digito, simplemente lo agrego el caracter a la cadena Descomprimida.
            else
            {
                cadenaD += comprimida.charAt(x);
            }
        }
        System.out.println("La cadena DEScomprimida es:" + cadenaD);
        System.out.println(cadenaO.equals(cadenaD)?"La Cadena con repeticiones es igual a la cadena DEScomprimida":"No son iguales");
    }
}
