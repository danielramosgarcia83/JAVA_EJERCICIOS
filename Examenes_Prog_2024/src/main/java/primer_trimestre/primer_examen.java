/**
•	Todos los ejercicios hacen referencia al lenguaje Java.
•	Por comodidad se pueden definir todas las clases, atributos y métodos como “publicas" y no son necesarios setters ni setters.
•	Puedes usar todas las clases de Java que consideres necesarias.
•	Se recomienda hacer los ejercicios en hojas "a sucio” a lápiz y cuando esté terminado.
•	pasarlo a limpio en las hojas de examen, a bolígrafo.
•	Todas las hojas numeradas y con el nombre del alumno.

Se desea hacer el programa que gestione una cuenta corriente bancaria a partir de una clase llamada Cuenta. De una cuenta tendremos que mantener los siguientes atributos:
•	Número de cuenta que la identifica.
•	Fecha de creación (será la fecha del sistema en el momento de crearla).
•	Porcentaje de comisión (5% igual para todas las cuentas y no se puede modificar). Esta comisión se aplica en cada retirada de fondos aplicando ese porcentaje sobre el importe a retirar y reduce el saldo.
•	Saldo (con decimales y nunca puede ser negativo) Las cuentas se crean inicialmente con saldo cero y el saldo tiene que estar siempre actualizado. 
•	Movimientos sobre la cuenta (habrá muchos en una cuenta) de cada uno tendremos fecha del movimiento, concepto e importe (los ingresos serán movimientos con signo positivos y las retiradas serán negativas, también con decimales).
 
Y los siguientes métodos:
•	Método: Retirar: Se le pasa importe del movimiento (double), concepto (String) y fecha (String formato "aaaa-mm-dd"). Reduce el saldo con el importe pasado (y la comisión aplicada) y se almacena el movimiento. Devuelve saldo actualizado o -1 si no se puede hacer la retirada porque dejaría el saldo negativo.
Ejemplo:
Saldo 1210 euros. Una retirada de 200 euros, reduce en 210€ el saldo. Devuelve 1000.
Saldo 200 euros. Una retirada de 200 euros, no se puede hacer. Devuelve -1.
•	Método: Ingresar. Se le pasa importe, concepto y fecha del movimiento. Aumenta el saldo y devuelve saldo actualizado.
•	Método: Imprime_movimientos: No se le pasa nada e imprime los movimientos.

Se pide desarrollar la clase 'cuenta' con sus atributos, constructores necesarios y métodos solicitados. (y también clases adicionales si son necesarias).
Se pide desarrollar una clase principal con una función main() que, cree una instancia de cuenta al principio y luego presente un menú al usuario con las distintas opciones para manejar la cuenta (ingresar, retirar, imprimir movimientos, salir), en las que se pedirán por teclado al usuario los datos necesarios, llamará a los métodos con esos datos y mostrará el resultado de la llamada.
**/
package primer_trimestre;

/**
 * @author Daniel
 * 1ª EVAL. 02/12/2024 (Prof. José Juan Torre Barbeito)
 */
public class primer_examen {

    public static void main(String[] args) {
        // TODO code application logic here

    }
}
