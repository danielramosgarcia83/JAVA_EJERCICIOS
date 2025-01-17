package drgt07;

import java.util.ArrayList;// clase llamada Parking que gestione los coches. Ejercicio 07.06

public class Parking {

    //Propiedades
    private final ArrayList<String> parkings = new ArrayList<>();
    private int plazas_ocup = 0, max_plazas = 0;
    private String matricula;

    public Parking(int max_pl) {
        this.max_plazas = max_pl;
    }

    //a Matriculas Plazas Ocupadas
    public String[] plazas_utilizadas() {
        String matriculas[]=new  String [plazas_ocup];
        for (int i = 0; i < plazas_ocup; i++)
        {
            matriculas[i]=parkings.get(i);
        }
        return matriculas;

    }
    //b Aparcar ->Pasando la matricula, devuelve numero de plaza o CERO sí esta lleno

    public boolean aparcar(String p) {
        if (parkings.size() < this.max_plazas) {
            parkings.add(p);
            this.plazas_ocup++;
            return true;
        }
        return false;
    }

    //c Desaparcar -> Devuelve matricula a desaparecer o un array vacio
    public int Desaparcar() {
        if (!parkings.isEmpty()) {
            this.matricula = parkings.get(parkings.size() - 1);
            parkings.remove(this.matricula);
            return this.plazas_ocup--;
        }
        return 0;
    }

    //d Mostrar cantidad plazas libres
    public int plazas_libres() {
        return max_plazas-parkings.size();
    }
    
    public int ult_plaza() {
        return parkings.size();
    }

}
