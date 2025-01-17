//Daniel Ramos Garcia - DAW - B - 2024
package drgt07;
import java.util.Scanner;
//Realizar una clase llamada Parking que gestione los coches aparcados en un parking mediante
//un Array que almacene las matrículas. El parking es un poco raro, mide solo 3 metros de ancho y
//caben 20 coches, pero uno detrás de otro por lo que el último en entrar debe ser el primero en salir
//(esta estructura se llama pila LIFO – Last Input, First Output ). La clase debe tener métodos siguientes:
//a. Mostrar el estado del parking, esto es las matrículas de las plazas ocupadas.
//b. Aparcar: se le pasará el número de matrícula. Devuelve número de plaza o cero si lleno.
//La plaza del fondo es la número 1 y la que está más cerca de la entrada es la 20.
//c. Desaparcar: (¿hace falta pasarle algún parámetro?). Devuelve la matrícula del coche a
//desaparcar o bien una cadena vacía si el parking está vacío.
//d. Mostrar la cantidad de plazas libres en ese momento.
//Hacer un programa con un menú que permita al usuario usar los métodos creados mostrando la
//información del parking correspondiente a los métodos creados (los métodos no deben escribir nada
//por consola, eso lo hace el programa que usa la clase)
//Para implementar este tipo de estructuras LIFO existe una Colecciones que resuelven
//esto de forma más sencilla, se verá en el tercer trimestre.
public class DRGt07e06 {
    
    static Parking parking;
    static Scanner teclado;
    static int plaza;

    public static void main(String[] args) {
        parking = new Parking(5);
        int opcion;

        do {
            //MENU
            teclado = new Scanner(System.in);
            System.out.println("------Menu Parking------");
            System.out.println("Elige una opción:");
            System.out.println("1 - Ver plazas Ocupadas");
            System.out.println("2 - Aparcar");
            System.out.println("3 - Desaparcar");
            System.out.println("4 - Cantidad Plazas Libres");
            System.out.println("0 - Salir");
            System.out.println("------------------------");

            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1 ->
                    ver_plazas_ocupadas();
                case 2 ->
                    aparcar();
                case 3 ->
                    desaparcar();
                case 4 ->
                    plazas_libres();
                case 0 -> {
                    System.out.println("Salir");
                    break;
                }
                default ->
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 0);
    }

    private static void ver_plazas_ocupadas() {
        String[] matriculas = parking.plazas_utilizadas();
        for (int i = 0; i < matriculas.length; i++) {
            System.out.println("Plaza: " + (i + 1) + " " + matriculas[i]);
        }
    }

    private static void aparcar() {
        System.out.println("Ingrese una matricula");
        if (parking.aparcar(teclado.nextLine())) {
            parking.plazas_utilizadas();
            System.out.println("Plaza " + parking.ult_plaza() + " Asignada");
        } else {
            System.out.println("Plazas llenas");
        }
    }

    private static void desaparcar() {
        plaza = parking.Desaparcar();
        if (plaza != 0) {
            System.out.println("Plaza " + plaza + " Removida");
        } else {
            System.out.println("Vacio");
        }
        parking.plazas_utilizadas();
    }

    private static void plazas_libres() {
        //20 - el size del array
        System.out.println("Hay " + parking.plazas_libres() + " plazas disponibles");
    }
}
