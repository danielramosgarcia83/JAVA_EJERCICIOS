package drgt09;

public class MovilPrepago {

    public long numeroMovil;
    final private float costeMinutoLlamada;
    final private float costeConsumoMB;
    private float saldo;

    MovilPrepago(long nM, float cML, float cMB, float s) {
        numeroMovil = nM;
        costeMinutoLlamada = cML;
        costeConsumoMB = cMB;
        saldo = s;
    }

    public void efectuarLlamada(int segundos) {
        saldo -= Math.round((costeMinutoLlamada / 60f * segundos) * 100f) / 100f;
        if (saldo < 0) {
            saldo = 0;
        }
    }

    public void navegar(int mb) {
        saldo -= Math.round(costeConsumoMB * mb * 100f) / 100f;
        if (saldo < 0) {
            saldo = 0;
        }
    }

    public boolean recargar(int importe) {
        if (importe % 5 == 0) {
            saldo += importe;
            return true;
        } else {
            return false;
        }
    }

    public float consultarSaldo() {
        return saldo;
    }

    //Mis metodos agregados

    @Override
    public String toString() {
        return "El numero es: " + this.numeroMovil + " y el saldo es: " + this.saldo + "\n";
    }

@Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || !(obj instanceof MovilPrepago)) {
        return false;
    }
    MovilPrepago movil = (MovilPrepago) obj;
    return this.numeroMovil == movil.numeroMovil;
}
   
    

} //fin 

//MovilPlus
class MovilPlus extends MovilPrepago {

    final private float costeConsumoVL;

    public MovilPlus(long nM, float cMB, float s, float cMVL) {
        super(nM, 0, cMB, s);
        this.costeConsumoVL = cMVL;
    }

    public void videollamada(int seg) {
        float mbConsumidos = Math.round(this.costeConsumoVL * seg * 100) / 100f;
        navegar((int) mbConsumidos);
    }

}//fin

//MovilTarifaPlana
class MovilTarifaPlana extends MovilPrepago {

    public MovilTarifaPlana(long nM, float cML, float s) {
        super(nM, cML, 0, s);

    }

    @Override
    public void navegar(int mb) {
    }
}
