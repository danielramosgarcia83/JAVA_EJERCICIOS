package drgt08;

/**
 * @author Daniel
 *
 * 8.10. Copia la clase _MovilPrepago que te proporcionará el profesor con un nombre nuevo,
 * por ejemplo, MovilPrepago y realiza las siguientes operaciones:
 
 * • Crea una subclase llamada MovilPlus igual que la anterior pero que al efectuar llamadas
      no se le aplica ningún coste por el establecimiento de llamada y tiene una nueva funcionalidad
      llamada videollamada a la que se le pasa los segundos de la videollamada y
      reduce el saldo de forma similar a ‘navegar’. En este caso, cada segundo de llamada son 2 MB de datos
      (recuerda que los atributos de MovilPrepago son privados, esto puede ser un problema a resolver).
      
 * • Crea constructor para la nueva clase, que llame al constructor de la clase padre.
 * • Sobrescribe el método toString () en la superclase para que muestre el número y el saldo del móvil.
 * • Añade una nueva subclase de MovilPrepago llamada MovilTarifaPlana¸
      en la que se redefine el método navegar para no reducir el saldo y además en el constructor fija
      el coste de navegación a cero.
      
 * • Haz un programa que cree una instancia de MovilPrepago, otra de MovilPlus y otra de MovilTarifaPlana,
      y realicen diversas operaciones sobre los mismos: llamar, navegar, videollamar, etc.
      mostrando como se reduce su saldo con el nuevo método toString ().
 */
public class DRGt08e10 {

    public static void main(String[] args) {
        
        
        
        //MovilPrepago llamar, navegar
        
        MovilPrepago Pregago1= new MovilPrepago(111111,0.4f,1.2f,20);
        System.out.println("Datos MovilPrepago");
        System.out.println(Pregago1);
        
        System.out.println("Llamando..");
        Pregago1.efectuarLlamada(5);
        System.out.println(Pregago1);
        
        System.out.println("Navegando...");
        Pregago1.navegar(5);
        System.out.println(Pregago1);


        //MovilPlus videollamar
        MovilPlus Plus1 = new MovilPlus(222222,0.5f,1,30,1.28f);
        System.out.println("Datos MovilPlus");
        System.out.println(Plus1);

        System.out.println("videollamada...");
        Plus1.videollamada(15);
        System.out.println(Plus1);

        //MovilTarifaPlana llamar, navegar, videollamar
        MovilTarifaPlana Plana1 = new MovilTarifaPlana(333333,0.5f,15);
        System.out.println("Datos MovilTarifaPlana");
        System.out.println(Plana1);


        System.out.println("Navegando sin coste...");
        Plana1.navegar(10);
        System.out.println(Plana1);

        


    }

}
