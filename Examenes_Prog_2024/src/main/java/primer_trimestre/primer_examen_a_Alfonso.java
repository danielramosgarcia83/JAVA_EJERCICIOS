package primer_trimestre;

import java.util.Scanner;

/**
 *
 * @author Daniel
 * ejercicio 2
 */
public class primer_examen_a_Alfonso {

    public static void main(String[] args) {
        int numero, contador = 0, sumaDigitos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero positivo: ");

        numero = sc.nextInt();
        while (numero >= 10 && contador < 15) {
            
            if (numero % 3 == 0 && numero % 7 != 0) {
                sumaDigitos = 0;
                int temp = numero;
                
                while (temp > 0) {
                    //En cada vuelta: Valor de sumaDigitos + el resto de temp/10
                    //cuando sea menor que 10, ejemplo 3, 3%10=3 porq el cociente es 0
                    sumaDigitos += temp % 10; 
                    //En cada vuelta: al ser int, la div es exacta, se carga los decimales, temp=temp/10
                    //Ejemplos: 66/10=6; 27/10=2, 333/10=33 y despues 33/10=3 y sale del bucle al ser temp>0
                    //Es la reduccion de la que habla el profe
                    temp /= 10; 
                }
                System.out.println("La suma de los dígitos de " + numero + " es: " + sumaDigitos);
            }
            contador++;
            System.out.println("Introduce un número entero positivo: ");
            numero = sc.nextInt();
        }

    }
}
