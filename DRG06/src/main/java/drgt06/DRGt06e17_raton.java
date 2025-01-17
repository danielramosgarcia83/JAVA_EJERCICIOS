package drgt06;

import java.util.Random;

public class DRGt06e17_raton {

    public int fila, columna, mov_direccion;

    public DRGt06e17_raton(int f, int c) {
        this.fila = f;
        this.columna = c;
    }
/*
 * Basicamente, necesito verificar si el movimiento no es valido por desbordarse
 * Mientras el movimiento sea superior a los limites del tablero o menor a 0
 * genero otro movimiento aleatorio en el ELSE, pero sí es valido, pues hago un set a la propiedad
 * Fila o COlumna segun el caso
 * En el main podre pintar su nueva posicion, ademas guardo ese mov en "mov_direccion"
 * para que el gato sepa en todo momento a donde voy y pueda perseguirme
 */
    public void mover_raton() {
        //1:der 2:abajo 3:izq 0:arriba
        Random dir_raton_random= new Random();
        int direccion = dir_raton_random.nextInt(4);
        
        boolean desborde=true;
        
        while(desborde)
        {
        if(direccion==1&&this.columna + 2<DRGt06e17_tablero.Max_columnas)
        {
            this.columna += 2;
            desborde=false;
        }
        else if (direccion==2&&this.fila + 2<DRGt06e17_tablero.Max_filas)
        {
            this.fila += 2;
            desborde=false;

        }
        else if(direccion==3&&this.columna - 2>=0)
        {
            this.columna -= 2;
            desborde=false;

        }
        else if (direccion==0&&this.fila - 2>=0)
        {
            this.fila -= 2;
            desborde=false;

        }
        else
        {
            direccion = dir_raton_random.nextInt(4);
        }
        }
        this.mov_direccion=direccion;

    }
}



