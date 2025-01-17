package DRGt08_CuestionesPrevias;

/**
 * Justificando tu respuesta. Luego comprueba los resultados, ejecutando un
 * programa con las sentencias propuestas: a) a) ¿Qué mostraría el siguiente
 * código?. b) Si a continuación se ejecutan estas instrucciones ¿qué mostraría?
 * c) Sobre las mismas clases, vamos a crear un nuevo BichoDormilon ¿qué
 * mostrarían estas sentencias? d) Vamos a hacer algo parecido otra vez, vamos a
 * crear otro BichoDormilon ¿qué mostrarían estas sentencias?
 */
public class DRGt8cpB {

    public static void main(String[] args) {
        //a)
        Bicho bi = new Bicho(); //hambre =50 y private peso=50
        BichoDormilon bd = new BichoDormilon(); //hambre=50 y sueño=100(sueño*2)
        
        System.out.println("bi -> hambre: " + bi.hambre); //50
        System.out.println("bd -> hambre: " + bd.hambre); //50
        System.out.println("bd -> sueño: " + bd.sueño); //100
        //System.out.println("bd -> peso: " + bd.peso);
        
        //b)
        bi.come();//-5 hambre y +1peso / 50-5=45 y 50+1=51
        bd.come();//-10 hambre y +5peso / hambre 50-10=40 y peso 50+5=55
        System.out.println("bi -> hambre: " + bi.hambre);// 50-5=45
        System.out.println("bd -> hambre: " + bd.hambre);// 50-10=40
        bd.aDormir();//-5 hambre, +1 peso y sueño=0 / 40-5=35, 55+1=56 y peso=0
        System.out.println("bd -> hambre: " + bd.hambre);//hambre= 35
        System.out.println("bd -> sueño: " + bd.sueño);//sueño=0

    }
}
/**

**/
