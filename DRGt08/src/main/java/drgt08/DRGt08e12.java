package drgt08;

import java.util.ArrayList;

/**
 * @author Daniel 8.12: • Haz un programa que cree un ArrayList de Asalariados y
 * otro de ConsultoresExternos e introduzca “a mano” empleados en ambos
 * ArrayList. - Después modificar el contenido de ambos ArrayList añadiendo las
 * horas extra/horas trabajadas respectivamente. - Fijar el importe de hora
 * extra a 20 euros y la hora de consultor a 100 euros y modificar de nuevo los
 * ArrayList calculando el salario final de cada trabajador. - Finalmente,
 * recorriendo con un for-each ambos ArrayList, obtener el total que gastará la
 * empresa en salarios.
 *
 * - ¿Sería útil tener un ArrayList que pudiese contener instancias de ambas
 * clases?
 *
 */
/**
 * Crear una clase llamada Trabajador con los atributos privados: id, nombre,
 * fecha de nacimiento y salario base. • Dispondrá también de un constructor que
 * inicialice todos sus campos, getters, setters, método toString () y equals
 * (), sabiendo que dos trabajadores son iguales si tienen el mismo ‘id’. •
 * Crear una subclase de Trabajador llamada Asalariado que añade un nuevo
 * atributo llamado salarioFinal y otro llamado horasExtra. • El constructor de
 * esta nueva clase Asalariado incorpora la inicialización a cero de las horas
 * extra y el salario final igual al salario base. • La clase Asalariado también
 * incorpora setter y getter para las horas extra y un método llamado
 * calcularSalarioFinal() al que se le pasa a cuanto se paga la hora extra en
 * ese momento y calcula el salario final del empleado siendo su salario base
 * más el importe de las horas extras trabajadas. • Crear una subclase de
 * Trabajador llamada ConsultorExterno que añade un nuevo atributo llamado
 * horasTrabajadas y salarioFinal. • El constructor de esta nueva clase
 * ConsultorExterno incorpora la inicialización a cero de las horas trabajadas,
 * salario base y salario final. • La clase ConsultorExterno también incorpora
 * setter y getter para las horas trabajadas y un método llamado
 * calcularSalarioFinal() al que se le pasa a cuanto se paga la hora a los
 * consultores en ese momento y calcula el salario final del consultor solo en
 * función de las horas trabajadas (el salario base de estos trabajadores es
 * cero).
 *
 *
 */
public class DRGt08e12 {

    public static void main(String[] args) {
        //Variables para sumar sueldos obtenidos en los foreach
        float SueldosAsalariados = 0, SueldosConsultores = 0;
        //Asalariados
        ArrayList<Asalariado> Asalariados = new ArrayList<>();
        Asalariados.add(new Asalariado("A1", "Maria", "1990-03-10", 1000f));
        Asalariados.add(new Asalariado("A2", "Juan", "2000-08-05", 1000f));
        Asalariados.add(new Asalariado("A3", "Jose", "1979-06-12", 1000f));
        Asalariados.add(new Asalariado("A4", "David", "1998-09-17", 1000f));
        //Asignando horas extras
        Asalariados.get(0).setHorasExtra(5f);
        Asalariados.get(1).setHorasExtra(10f);
        Asalariados.get(2).setHorasExtra(15f);
        Asalariados.get(3).setHorasExtra(20f);
        //Asignando importe de hora extra a 20 euros
        for (Asalariado asalariado : Asalariados) {
            asalariado.calcularSalarioFinal(20f);
        }

        //ConsultoresExternos
        ArrayList<ConsultorExterno> ConsultoresExternos = new ArrayList<>();
        ConsultoresExternos.add(new ConsultorExterno("C1", "Lucas", "1985-01-25"));
        ConsultoresExternos.add(new ConsultorExterno("C2", "Pedro", "1955-09-02"));
        ConsultoresExternos.add(new ConsultorExterno("C3", "Manuel", "1967-05-14"));
        ConsultoresExternos.add(new ConsultorExterno("C4", "Francisco", "1999-07-09"));
        //Asignando horas trabajadas
        ConsultoresExternos.get(0).setHorasTrabajadas(25f);
        ConsultoresExternos.get(1).setHorasTrabajadas(30f);
        ConsultoresExternos.get(2).setHorasTrabajadas(35f);
        ConsultoresExternos.get(3).setHorasTrabajadas(40f);
        //Asignando importe de la hora de consultor a 100 euros
        for (ConsultorExterno consultor : ConsultoresExternos) {
            consultor.calcularSalarioFinal(100f);
        }

        //Calculando sueldos
        for (Asalariado asalariado : Asalariados) {
            SueldosAsalariados += asalariado.getSalarioFinal();
        }
        for (ConsultorExterno consultor : ConsultoresExternos) {
            SueldosConsultores += consultor.getSalarioFinal();
        }
        System.out.printf("El total de sueldo para asalariados es: %.2f%n", SueldosAsalariados);
        System.out.printf("El total de sueldo para Consultores es: %.2f%n", SueldosConsultores);
        System.out.printf("El total de sueldos de la empres es: %.2f%n", SueldosAsalariados + SueldosConsultores);
        
        System.out.println("Datos en los array");
        System.out.println(Asalariados);
        System.out.println(ConsultoresExternos);


//¿Sería útil tener un ArrayList que pudiese contener instancias de ambas clases?
//Si, un solo array con todos los arreglos, nos ahorraria codigo, aprovechando herencia, supongo
//e ir sobreescribiendo 

    }//Fin main
}//fin programa
