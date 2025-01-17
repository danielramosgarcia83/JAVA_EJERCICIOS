/*

9.9. Haz un programa con un menú que permita gestionar la cola de espera de un médico.

Hay tres tipos de pacientes:

Los que vienen a consulta (se le pide al usuario nombre, fecha de nacimiento, motivo de la consulta).

Los que viene por recetas (se le pide: nombre, fecha de nacimiento, lista de medicamentos).

El que viene a revisión (se le pide nombre, fecha de nacimiento y fecha de la visita anterior).


• Las tarifas del médico son: 
Consulta: 100 eur.
Recetas: 5 eur por cada unidad.
Revisión: 30 eur para mayores de 65 años, 50 eur para resto.

• Crear una clase para cada tipo de paciente en el propio archivo del programa con
los constructores necesarios y el método de facturar() en cada una de las clases.

Implementa herencia si lo crees necesario.

• El programa tendrá un menú para:

a) Registrar la llegada del paciente: se le preguntará por qué viene al médico y se le piden sus datos.
b) Llamar a consulta (por orden de llegada). Se le cobra la tarifa correspondiente.
c) Consultar total facturado hasta ese momento.

 */
package drgt09;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Daniel
 */
public class DRGt09e09 {

    static Scanner teclado = new Scanner(System.in);
    static String nombre, fnac, motivo, ultf;
    static ArrayList<Pacientes> pacientes = new ArrayList<>();

    public static void main(String[] args) {
        int opcion, contador = 0;
        float suma = 0;
        //Lista de pacientes
        //REGISTRO DE LLEGADA
        //Motivo y se le piden datos:
        do {
            System.out.println("///////////////////////");
            System.out.println("Motivo de la consulta");
            System.out.println("1) Consulta");
            System.out.println("2) Recetas");
            System.out.println("3) Revision");
            System.out.printf("4) Llamar a Consulta(%d) \n", pacientes.size());
            System.out.println("5) Total Facturado");
            System.out.println("0) Salir");
            System.out.println("///////////////////////");

            opcion = Integer.parseInt(teclado.nextLine());

            //Funcion para instanciar una clase paciente
            if (opcion > 0 && opcion <= 3) {

                crearpaciente(opcion);

            } else {

                switch (opcion) {
                    case 4 -> {
                        //Llamar a consulta+Cobrar
                        Pacientes sigpaciente = pacientes.get(contador);
                        //Datos del paciente a atender
                        //numero / nombre
                        System.out.printf("Paciente numero: %d - Nombre: %s.  \n", contador + 1, sigpaciente.getNombre());

                        if (sigpaciente instanceof Consulta consulta) {
                            consulta.facturar();
                        } else if (sigpaciente instanceof Receta receta) {
                            receta.facturar();
                        } else {
                            ((Revision) sigpaciente).facturar();
                        }
                        contador++;
                    }
                    case 5 -> {
                        //Total facturado hasta ese momento
                        for (Pacientes paciente : pacientes) {
                            suma += paciente.getFacturado();
                        }
                        System.out.printf("Total Facturado al momento: %.2f \n", suma);
                        suma = 0;
                    }
                    case 0 -> {
                        System.out.println("Programa cerrado!.");
                    }
                    default -> {
                        System.out.println("Opcion invalida");
                    }
                }
            }
            System.out.println(pacientes);
        } while (opcion != 0);
    }//Fin MAIN

    public static void crearpaciente(int opcion) {

        System.out.println("NOMBRE PACIENTE");
        nombre = teclado.nextLine();

        System.out.println("FECHA NACIMIENTO (DD-MM-AAAA)");
        fnac = teclado.nextLine();

        switch (opcion) {
            case 1 -> {
                System.out.println("Motivo de la consulta");
                motivo = teclado.nextLine();

                pacientes.add(new Consulta(nombre, fnac, motivo));
            }
            case 2 -> {
                pacientes.add(new Receta(nombre, fnac, lista()));

            }
            case 3 -> {
                System.out.println("FECHA ULTIMA CONSULTA (DD-MM-AAAA)");
                ultf = teclado.nextLine();
                pacientes.add(new Revision(nombre, fnac, ultf));
            }
            default -> {
                System.out.println("Opcion invalida");
            }
        }
    }

    //Menu recetas
    public static ArrayList<String> lista() {
        ArrayList<String> lista = new ArrayList<>();
        int opcionlista;
        System.out.println("Nombre de Medicamento");
        lista.add(teclado.nextLine());
        do {
            System.out.println("1) Agregar otro medicamento");
            System.out.println("0) Salir");
            opcionlista = Integer.parseInt(teclado.nextLine());
            if (opcionlista == 1) {
                System.out.println("Nombre de Medicamento");
                lista.add(teclado.nextLine());
            } else if (opcionlista != 0) {
                System.out.println("Opcion Invalida");
            }
        } while (opcionlista != 0);
        return lista;
    }

}//Fin PROGRAMA

//CLASE BASE
class Pacientes {

    protected final DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private String nombre;
    private LocalDate fechaNacimiento;
    protected Float facturado;
    static final float CONSULTA = 100;
    static final float RECETA = 5; //eur por cada unidad.

    public Pacientes(String nom, String fn) {
        this.nombre = nom;
        this.fechaNacimiento = LocalDate.parse(fn,this.f);
        this.facturado = 0f;
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Float getFacturado() {
        return facturado;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": Paciente=" + nombre + ", facturado=" + facturado + "\n";
    }

}

//SUB CLASS CONSULTA
class Consulta extends Pacientes {

    private final String motivoConsulta;

    public Consulta(String nom, String fn, String motivo) {
        super(nom, fn);
        this.motivoConsulta = motivo;
    }

    //GETTERS
    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    //SETTERS
    public void facturar() {
        facturado += CONSULTA;
    }
}

// SUB CLASE RECETA
class Receta extends Pacientes {

    private final ArrayList<String> listamedicamentos;

    public Receta(String nom, String fn, ArrayList<String> lista) {
        super(nom, fn);
        this.listamedicamentos = lista;
    }

    //GETTES
    public ArrayList<String> getListamedicamentos() {
        return listamedicamentos;
    }

    //SETTERS
    public void facturar() {
        facturado += (listamedicamentos.size() * RECETA);
    }
}

// SUB CLASE REVISION
class Revision extends Pacientes {

    private final LocalDate fechavisitaant;

    public Revision(String nom, String fn, String fa) {
        super(nom, fn);
        this.fechavisitaant = LocalDate.parse(fa,this.f);

    }

    //GETTERS
    public LocalDate getFechavisitaant() {

        return fechavisitaant;
    }

    //SETTERS
    public void facturar() {
        
        System.out.printf("La edad es: %d \n", calcularEdad());
    }
    
    private long calcularEdad(){
        long edad = ChronoUnit.YEARS.between(getFechaNacimiento(), LocalDate.now());
        if (edad > 65) {
            facturado += 30f;
        } else {
            facturado += 50f;
        }
        return edad;
    };
}
