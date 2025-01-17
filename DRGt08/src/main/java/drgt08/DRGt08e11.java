package drgt08;

import java.util.ArrayList;

/**
 * @author Daniel
 *
 * 8.11. Usando las clases del ejercicio anterior, haz un programa que cree un ArrayList de teléfonos
 * de tipo MovilPlus.. Inserta varios teléfonos y luego prueba el método remove () pasándole como
 * parámetro un objeto de tipo MovilPlus. ¿Funciona? Modifica la clase con los cambios necesarios
 * para que funcione (haciendo una nueva versión).
 */
public class DRGt08e11 {

    public static void main(String[] args) {
        int numElim=111115;

        ArrayList <MovilPlus> movilesPlus1= new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            
            movilesPlus1.add(new MovilPlus(111111+i,0.5f,1f,10,1.5f));
            System.out.printf("Numero %d creado %n",movilesPlus1.get(i).numeroMovil);
        }
        
        //Mostrando el contenido del arrayList con toString sobreescrito
        System.out.println("El contenido del arrayList es:");
        System.out.println(movilesPlus1);
        
        //Removiendo un objeto del array despues de sobreescribir equals
        //porque lo llama remove() para compararpor defecto  referencias,
        //ahora compara el atributo de la superclase publico "numeroMovil".
        
        System.out.printf("Eliminando el num %d...%n",numElim);
        movilesPlus1.remove(new MovilPlus(numElim,0.5f,1f,10,1.5f));
        
        //Verificando que se elimina y ya no esta en el arrayList
        System.out.println("El NUEVO contenido del arrayList es:");
        System.out.println(movilesPlus1);
        
        
        
        //Verificando que el objeto no esta en el objeto
        for (MovilPlus movilPlus : movilesPlus1) {
                if (movilPlus.numeroMovil ==numElim) {
                    System.out.printf("El numero %d no fue eliminado",numElim);
            }          
        }
    }//fin main
    

}//fin programa
