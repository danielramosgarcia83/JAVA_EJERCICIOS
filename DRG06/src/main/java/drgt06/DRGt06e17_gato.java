package drgt06;

public class DRGt06e17_gato {

    public int fila, columna, nueva_fila, nueva_columna;

    public DRGt06e17_gato(int f, int c) {

        this.fila = f;
        this.columna = c;
    }

    public void mover_gato(int mov_raton, DRGt06e17_raton raton) {
        
        if(mov_raton==1||mov_raton==3) //1 y 3: columna
        {
            //Son iguales columnas gato y raton?
            if(this.columna==raton.columna)
            {
                //No nos movemos por alli, hay que mirar las filas
                //la fila raton es menor que la de gato?
                if(raton.fila<this.fila)
                {
                   this.fila--;
                }
                else
                {
                    this.fila++;
                }
            }
            else
            {
                //columnas no son iguales, alli si nos podemos acercar por alli
                //Igual, evaluar si es mayor o menor la columna del gato respecto al raton
                if(raton.columna<this.columna)
                {
                   this.columna--; 
                }
                else
                {
                    this.columna++;
                }
            }
        }
        else //2 y 4: Fila
        
                    {
            //Son iguales filas gato y raton?
            if(this.fila==raton.fila)
            {
                //No nos movemos por alli, hay que mirar las filas
                //la fila raton es menor que la de gato?
                if(raton.columna<this.columna)
                {
                   this.columna--;
                }
                else
                {
                    this.columna++;
                }
            }
            else
            {
                //columnas no son iguales, alli si nos podemos acercar por alli
                //Igual, evaluar si es mayor o menor la columna del gato respecto al raton
                if(raton.fila<this.fila)
                {
                   this.fila--; 
                }
                else
                {
                    this.fila++;
                }
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /**
        //Lo primero es saber si el raton se movio horizonal(recibo String columna) o vertical (recibo string fila)
        if(tipo_mov_raton=="columna")
        {
            //necesito saber si el gato esta antes para restar 1 o despues del raton para sumar 1 
            if(this.columna>=mov_raton_aleatorio)
            {
                this.columna--;
            }
            else
                this.columna++;
        }    
        else
        
            if(this.fila<=mov_raton_aleatorio)
                {
                    this.fila--;
                }
                else
                    this.fila++;
            

        **/
        }
        
    }


