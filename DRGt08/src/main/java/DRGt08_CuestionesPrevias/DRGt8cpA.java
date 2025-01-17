package DRGt08_CuestionesPrevias;

/**
 * Justificando tu respuesta. Luego comprueba los resultados, ejecutando un
 * programa con las sentencias propuestas: a) ¿Qué mostraría el siguiente
 * código?
 */
public class DRGt8cpA {

    public static void main(String[] args) {
        Bicho bi = new Bicho();
        BichoDormilon bd = new BichoDormilon();
        System.out.println("bi -> hambre: " + bi.hambre);
        System.out.println("bd -> hambre: " + bd.hambre);
        System.out.println("bd -> sueño: " + bd.sueño);
        //System.out.println("bd -> peso: " + bd.peso);

    }
}
/**
 * No se puede llamar a una propiedad private (peso) desde una clase hija
 * Se imprime correctamente las otras porque son publicas en clase padre e hijo
 * Desde la clase hijo se imprime una propiedad de padre y otra propia
**/