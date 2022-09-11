package modell;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.Icon;

public class Karakter {
    public int eletero = ThreadLocalRandom.current().nextInt(5, 15);
    public int tamadas = ThreadLocalRandom.current().nextInt(1, 5);
    public int hely;
    public String nev;
    public Icon kep;
    

    public int getEletero() {
        return eletero;
    }

    public int getTamadas() {
        return tamadas;
    }

    public void setHely(int hely) {
        this.hely = hely;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKep(Icon kep) {
        this.kep = kep;
    }
    
    
    
}
