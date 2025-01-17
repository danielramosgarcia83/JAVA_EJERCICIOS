package DRGt08_CuestionesPrevias;

import java.util.Scanner;

public class Estudiando_tema {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        AlumnoESO alum1 = new AlumnoESO("Juan Perez",15, "32233N", 981900900);
        AlumnoCiclos alum2 = new AlumnoCiclos("Ana Lopez", 16,"77700K", "Abanca", "ana2gmail.com");
        alum1.nuevaFalta(3);
        alum1.nuevaFalta(20);
        alum1.nuevaFalta(12);

        alum2.nuevaFalta(7);
        alum2.nuevaFalta(20);
        alum2.nuevaFalta(33);
    }//fin main
}//Fin class

class Alumno {
    public String nombre;
    public int edad;
    public String DNI;
    public int faltas;

    Alumno() {};
    
    Alumno(String n, int e, String D) {
        nombre = n;
        edad = e;
        DNI = D;
        faltas = 0;
    }
    @Override
    public boolean equals(Object a) {
        if (a == null) return false;
        if (a == this)return false;
        if (!(a instanceof Alumno)) return false;
        Alumno o = (Alumno) a;
        if (o.nombre.equals(this.nombre) && o.edad == this.edad){
            return true;
        }
            return false;
}

    

    public void setNombre(String n) {
        this.nombre = n;
    }

    public void setDNI(String D) {
        this.DNI = D;
    }

    public void setFaltas() {
        this.faltas = 0;
    }
}//Fin Alumno

class AlumnoESO extends Alumno {

    public int telefono;

    AlumnoESO(String nom, int ed,String Dn, int tel) {
        super(nom,ed, Dn);
        telefono = tel;
    }

    public void setTelefono(int t) {
        this.telefono = t;
    }

    public void nuevaFalta(int sesiones) {
        this.faltas = +sesiones;
        System.out.println("Falta registrada. Llamar a: " + this.telefono);
        if (this.faltas > 30) {
            System.out.println("Llamar a asuntos sociales");
        }
    }

}

class AlumnoCiclos extends Alumno {

    public String Empresa;
    public String email;

    AlumnoCiclos(String no, int eD, String Dn, String E, String e) {
        super(no, eD, Dn);
        Empresa = E;
        email = e;
    }

    public void setEmpresa(String E) {
        this.Empresa = E;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public void nuevaFalta(int sesiones) {
        this.faltas += sesiones;
        System.out.println("Falta registrada. Notificar email a: " + this.email);

        if (faltas > 50) {
            System.out.println("Alumno dado de baja");
        }
    }

}
