package drgt06;
import java.util.Random;
import java.util.Scanner;
////Daniel Ramos Garcia - DAW - B - 2024
/**
 * (Opcional) Realiza mediante objetos un juego de Gato y Ratón: sobre un
 * tablero que por el momento es de 20 filas x 20 columnas (aunque podría
 * cambiar el tamaño), el gato y ratón se sitúan inicialmente en una posición al
 * azar. En cada turno el gato y el ratón se mueven alternativamente. El ratón
 * es rápido pero ciego así que se mueve de 2 en 2 casillas pero en una
 * dirección aleatoria (si el movimiento provocase que saliese del tablero,
 * vuelve a generarlo hasta que sea un movimiento válido). El gato se mueve de
 * una en una casilla pero siempre en dirección hacia el ratón. El programa
 * termina cuando se encuentren. El programa mostrará la situación del tablero
 * después de cada movimiento (el usuario pulsará "ENTER" para que se produzca
 * cada movimiento). Pistas: - Hacer una clase TableroGatoRaton, con un
 * constructor en el que se crea las dimensiones cantidad de filas y cantidad de
 * columnas. Esa clase tiene un método para pintar el tablero, por ejemplo, con
 * un punto para casillas vacías, una “G” para la posición del gato y una “R”
 * para la posición del Ratón. - Hacer una clase Ratón y una clase Gato cuyas
 * propiedades son su posición, con un constructor que sitúa al gato o ratón en
 * una posición inicial, y un método mover que cambia de posición, según las
 * reglas descritas. - Hacer un main() que cree un tablero, un ratón y un gato y
 * alterne los movimientos de los dos últimos.
 */
public class DRGt06e17 {
    public static void main(String[] args) {
        //Creando tablero
        DRGt06e17_tablero tablero = new DRGt06e17_tablero();
        DRGt06e17_tablero.Max_filas = 5;
        DRGt06e17_tablero.Max_columnas = 5;
        
        //Posiciones iniciales aleatorias Gato/Raton
        //Toma de la clase tablero de arriba, el max fila/columna para no desbordar.
        int pos_ini_fila_gato = fila_aleatoria(DRGt06e17_tablero.Max_filas);
        int pos_ini_columna_gato = columna_aleatoria(DRGt06e17_tablero.Max_columnas);
        int pos_ini_fila_raton = fila_aleatoria(DRGt06e17_tablero.Max_filas);
        int pos_ini_columna_raton = columna_aleatoria(DRGt06e17_tablero.Max_columnas);
        
        // PINTANDO PRIMER TABLERO, GATO Y RATON ALEATORIO
        tablero.pintar_tablero(pos_ini_fila_gato, pos_ini_columna_gato, pos_ini_fila_raton, pos_ini_columna_raton);

        DRGt06e17_gato gato = new DRGt06e17_gato(pos_ini_fila_gato, pos_ini_columna_gato);
        DRGt06e17_raton raton = new DRGt06e17_raton(pos_ini_fila_raton, pos_ini_columna_raton);

        //GENERANDO MOVIMIENTO DE 2 EN 2 RATON:
        //Se me ocurre, que sea aleatorio la direccion
        //1:der 2:abajo 3:izq 0:arriba
        
        /**Aqui genero el movimiento aleatorio de la direccion para el RATON con metodo "mover_raton"
        Lo siguiente es pasarle la direccion a gato del raton para que sepa a donde a ido
        y pueda perseguirlo con su metodo "mover_gato"
        Esto se va a repetir MIENTRAS que ambos NO esten en la misma posicion fila/columna
        * **/
        do//Repite en caso de desbordamiento de tablero
        {
            raton.mover_raton();
            gato.mover_gato(raton.mov_direccion, raton);
            System.out.println("Presiona ENTER para siguiente movimiento");
            Scanner teclado = new Scanner(System.in);
            teclado.nextLine();
            tablero.pintar_tablero(gato.fila, gato.columna, raton.fila, raton.columna);
            //Comprobaba sí funcionaba con este Print:
            System.out.println("mov raton: "+raton.fila+":"+raton.columna);
        } while (gato.fila != raton.fila || gato.columna != raton.columna);
        //Pintamos tablero despues del movimento con ENTER
        System.out.println("Gana gato");
    }
    //funciones para generar numeros aleatorias
    //FILAS
    public static int fila_aleatoria(int num_f) {
        int fila_random_generada;

        Random fila_random = new Random();
        fila_random_generada = fila_random.nextInt(num_f);

        return fila_random_generada;
    }

    //COLUMNAS
    public static int columna_aleatoria(int num_c) {
        int columna_random_generada;

        Random columna_random = new Random();
        columna_random_generada = columna_random.nextInt(5);

        return columna_random_generada;
    }
}
