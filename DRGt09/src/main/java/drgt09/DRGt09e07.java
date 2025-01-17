package drgt09;

import java.util.ArrayList;


/*
9.7. Volviendo a la última parte del ejercicio 1.12, haz un programa que cree un ArrayList que
pueda contener tanto Asalariados como ConsultoresExternos e introduzca “a mano” trabajadores
de ambos tipos en el ArrayList.
• Después modificar el contenido del ArrayList añadiendo 1 hora extra/horas trabajada a
Asalariados y ConsultoresExternos respectivamente
• Fijar el importe de hora extra a 20 euros y la hora de consultor a 100 euros y modificar de
nuevo el ArrayList calculando el salario final de cada trabajador.
• Finalmente, recorriendo con un for-each el ArrayList, obtener el total que gastará la
empresa en salarios.
 */
public class DRGt09e07 {

    public static void main(String[] args) {
        float totalsalario = 0;
        ArrayList<Trabajador> trabajadores = new ArrayList<>();

        trabajadores.add(new Asalariado("A1", "Maria", "1990-03-10", 1000f));
        trabajadores.add(new Asalariado("A2", "Juan", "2000-08-05", 1000f));
        trabajadores.add(new Asalariado("A3", "Jose", "1979-06-12", 1000f));
        trabajadores.add(new Asalariado("A4", "David", "1998-09-17", 1000f));

        trabajadores.add(new ConsultorExterno("C1", "Lucas", "1985-01-25"));
        trabajadores.add(new ConsultorExterno("C2", "Pedro", "1955-09-02"));
        trabajadores.add(new ConsultorExterno("C3", "Manuel", "1967-05-14"));
        trabajadores.add(new ConsultorExterno("C4", "Francisco", "1999-07-09"));

        for (Trabajador trabajador : trabajadores) {
            if (trabajador instanceof Asalariado) {

                Asalariado asalariado = ((Asalariado) trabajador);
                asalariado.setHorasExtra(1f);
                asalariado.calcularSalarioFinal(20f);
                totalsalario += asalariado.getSalarioFinal();
            } else {
                ConsultorExterno consultor = ((ConsultorExterno) trabajador);
                consultor.setHorasTrabajadas(1f);
                consultor.calcularSalarioFinal(100f);
                totalsalario += consultor.getSalarioFinal();

            }
        }
        System.out.printf("El total de sueltos es %.2f",totalsalario);
    }
}
