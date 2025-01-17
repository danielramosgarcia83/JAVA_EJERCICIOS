package drgt06;
public class DRGt06e17_tablero
{
    public static int Max_filas, Max_columnas;
    public char gato;
    public char raton;
    public char vacio;

    public DRGt06e17_tablero() {
        this.gato = 'G';
        this.raton = 'R';
        this.vacio = '*';
    }

    public void pintar_tablero(int fg,int cg,int fr,int cr)
    {       
//pintar tablero
        for (int i =0; i<DRGt06e17_tablero.Max_filas ; i++)
        {
            for (int j =0; j< DRGt06e17_tablero.Max_columnas; j++)
            {
                if(i==fg&&j==cg) //pinta G gato
                {
                    System.out.print("G");
                }
                else if(i==fr&&j==cr)
                {
                    System.out.print("R"); //pinta R raton
                }
                else
                System.out.print(this.vacio);
            }
            System.out.println("");
        }
        System.out.println("La posicion del gato es :"+fg+" "+cg);
        System.out.println("La posicion del raton es :"+fr+" "+cr);

    }
    

    
    
}
