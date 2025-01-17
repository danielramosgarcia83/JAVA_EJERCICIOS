/*
9.10. Haz un programa con un menú que permita gestionar un parking.
• El parking tiene 100 plazas y pueden aparcar 3 tipos de vehículos distintos: Coches, Furgonetas y Autobuses.
• Todos los vehículos pagan 4 céntimos por minuto, pero las furgonetas pagan además un
suplemento de 20 céntimos por cada metro de su longitud y los autobuses pagan un
suplemento de 25 céntimos por asiento.
• El menú del programa deberá permitir:
a) Entrada de un vehículo. Se le pide al usuario la matrícula, tipo de vehículo y datos
adicionales para el cálculo de la estancia (longitud, número de asientos…).
b) Salida del vehículo. Se le pide al usuario la matrícula , se calcula el importe a pagar y libera la plaza.
c) Mostrar la lista de vehículos en el parking con la matrícula, tipo de vehículo y
fecha/hora de llegada (piensa en el método toString). Al final número total de plazas ocupadas.
d) Salir
• Puedes hacer coste 4 céntimos por segundo (en vez de por minuto) para probarlo. • No hay el
concepto de número de plaza, los coches van aparcando donde quieren. • Mantén la mayor
cantidad de información (datos y cálculos) en las clases, no en el programa.
Puedes crear las clases en el mismo archivo que el programa (por comodidad) con el
modificador de acceso por defecto.
• El parking será un ArrayList. Para localizar un vehículo (en la opción de menú de Salida del
vehículo) emplea ArrayList.indexOf y ello te puede implicar definir equals en alguna clase.
 */
package drgt09;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Daniel
 */
public class DRGt09e10 {

    //ArrayList Parking
    static public ArrayList<Vehiculo> Vehiculos = new ArrayList<>();
    static public Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        String matricula = "";
        do {
            // MENU PRINCIPAL
            System.out.println("MENU PARKING");
            System.out.println("1)-ENTRADA VEHICULOS");
            System.out.println("2)-SALIDA VEHICULOS");
            System.out.println("3)-LISTA PLAZAS OCUPADAS");
            System.out.println("4)-SALIR");

            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1 -> {
                    if (Vehiculos.size() == 100) { // Comprueba si el parking está lleno
                        System.out.println("PARKING LLENO");
                    } else {
                        System.out.println("INDIQUE LA MATRICULA:");
                        matricula = teclado.nextLine();
                        crearVehiculos(matricula); // Llama al método para crear el vehículo
                    }
                }
                case 2 -> {
                    System.out.println("INDIQUE LA MATRICULA:");
                    matricula = teclado.nextLine();
                    facturarVehiculo(matricula); // Llama al método para facturar el vehículo
                }
                case 3 -> {
                    // Mostrar lista de vehículos
                    System.out.println("Lista de vehiculos en el parking:");
                    System.out.println(Vehiculos);
                    System.out.println("Total plazas ocupadas: " + Vehiculos.size());
                }
                case 4 -> {
                    System.out.println("Programa cerrado.");
                }
                default -> {
                    System.out.println("Opcion invalida.");
                }
            }
        } while (opcion != 4);

    }//MAIN

    //FUNCION CREAR VEHICULOS
    public static void crearVehiculos(String matric) {
        System.out.println("Tipo Vehiculo");
        System.out.println("1) Coches");
        System.out.println("2) Furgonetas");
        System.out.println("3) Autobuses");
        int tipo = Integer.parseInt(teclado.nextLine());

        switch (tipo) {
            case 1 -> {
                Vehiculos.add(new Coche(matric, "Coches"));
            }
            case 2 -> {
                System.out.println("Indica el largo (Metros)");
                float longitud = Float.parseFloat(teclado.nextLine());
                Vehiculos.add(new Furgoneta(matric, "Furgonetas", longitud));
            }
            case 3 -> {
                System.out.println("Indica Cantidad de asientos");
                int asientos = Integer.parseInt(teclado.nextLine());
                Vehiculos.add(new Autobus(matric, "Autobuses", asientos));
            }
            default -> {
                System.out.println("Opcion Invalida");
            }
        }
    }

    //Funcion salida
    //Facturar
    public static void facturarVehiculo(String matric) {
        // Buscando la posición de la matrícula en el ArrayList
        Vehiculo buscarMatricula = new Vehiculo(matric, "");
        int plaza = Vehiculos.indexOf(buscarMatricula);

        if (plaza != -1) {
            // Verificando qué instancia de vehículo es para facturar
            float importe = 0;
            if (Vehiculos.get(plaza) instanceof Coche coche) {
                importe = coche.calcularImporte();
            } else if (Vehiculos.get(plaza) instanceof Furgoneta furgoneta) {
                importe = furgoneta.calcularImporte();
            } else if (Vehiculos.get(plaza) instanceof Autobus autobus) {
                importe = autobus.calcularImporte();
                System.out.println(autobus.getFechaentrada().format(autobus.f));
            }
            // Mostrar importe y eliminar vehículo del parking
            System.out.printf("El importe total es: %.2f euros\n", importe);
            Vehiculos.remove(plaza);
        } else {
            System.out.printf("Matricula %s no encontrada.\n", matric);
        }
    }

}//PROGRAMA

//SUPER CLASE VEHICULO
class Vehiculo {

    DateTimeFormatter f = DateTimeFormatter.ofPattern("'Fecha Entrada: 'dd-MM-yyyy' Hora: 'HH:mm:ss");
    protected static final float COSTE = 0.4f;
    private String matricula, tipovehiculo;
    private final LocalDateTime fechaentrada = LocalDateTime.now();

    public Vehiculo(String matricula, String tipovehiculo) {
        this.matricula = matricula;
        this.tipovehiculo = tipovehiculo;
    }

    //Getters
    public float getCoste() {
        return COSTE;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getTipovehiculo() {
        return tipovehiculo;
    }

    public LocalDateTime getFechaentrada() {
        return fechaentrada;
    }

    //Setters
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setTipovehiculo(String tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || (!(obj instanceof Vehiculo))) {
            return false;
        }
        Vehiculo aux = ((Vehiculo) obj);

        return aux.matricula.equals(this.matricula);

    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + ", Tipo: " + tipovehiculo + ", " + fechaentrada.format(f)
                + "\n";
    }

}//FIN SUPER CLASE

//SUBCLASE COCHE
class Coche extends Vehiculo {

    public Coche(String matricula, String tipo) {
        super(matricula, tipo);

    }

    //Setter
    public Float calcularImporte() {
        //Calculo importe (0.4 p/min)
        long tiempoparking = ChronoUnit.MINUTES.between(getFechaentrada(), LocalDateTime.now());
        System.out.printf("Minutos Aparcado: %d \n", tiempoparking);
        return tiempoparking * COSTE;
    }

}

//SUBCLASE Furgoneta
class Furgoneta extends Vehiculo {

    private static final float SUPLEMENTOLONG = 0.20f;
    private final float longitud;

    public Furgoneta(String matricula, String tipo, float longitud) {
        super(matricula, tipo);
        this.longitud = longitud;

    }

    //Setter
    public Float calcularImporte() {
        //Calculo importe (0.4 p/min)
        long tiempoparking = ChronoUnit.MINUTES.between(getFechaentrada(), LocalDateTime.now());
        System.out.printf("Minutos Aparcado: %d \n", tiempoparking);
        return (tiempoparking * COSTE) + (this.longitud * SUPLEMENTOLONG);
    }
}

//SUBCLASE Autobus
class Autobus extends Vehiculo {

    private final int asientos;
    private static final float SUPLEMENTOASIENTO = 0.25f;

    public Autobus(String matricula, String tipo, int asientos) {
        super(matricula, tipo);
        this.asientos = asientos;

    }

    //Setter
    public Float calcularImporte() {
        //Calculo importe (0.4 p/min)
        long tiempoparking = ChronoUnit.MINUTES.between(getFechaentrada(), LocalDateTime.now());
        System.out.println(tiempoparking);
        return (tiempoparking * COSTE) + (this.asientos * SUPLEMENTOASIENTO);
    }
}
