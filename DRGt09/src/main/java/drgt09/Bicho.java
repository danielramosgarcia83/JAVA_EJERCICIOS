package drgt09;

/* Examina la clase Bicho y su clase hija BichoDormilon:
 */
class Bicho {

    public int hambre;
    private int peso;

    Bicho() {
        this.hambre = 50;
        this.peso = 50;
    }

    Bicho(int h, int p) {
        this.hambre = h;
        this.peso = p;
    }

    public void come() {
        this.hambre -= 5;
        this.peso++;
    }
}

class BichoDormilon extends Bicho {

    public int sueño;

    BichoDormilon() {
        this.sueño = this.hambre * 2;
    }

    BichoDormilon(int i) {
        super(i, 0);
        this.sueño = i + 20;
    }

    @Override
    public void come() {
        this.hambre -= 10;
        this.sueño += 5;
    }

    public void aDormir() {
        super.come();
        this.sueño = 0;
    }
}
