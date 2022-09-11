package modell;

import java.util.concurrent.ThreadLocalRandom;

public class Karakter {
    public int eletero ;

    public Karakter(int eletero, int tamadas, int hely) {
        this.eletero = eletero;
        this.tamadas = tamadas;
        this.hely = hely;
    }
    public int tamadas ;
    public int hely;

    public Karakter() {
        this( ThreadLocalRandom.current().nextInt(5, 15),ThreadLocalRandom.current().nextInt(1, 5),ThreadLocalRandom.current().nextInt(1, 3));
    }
    
    

    public int getEletero() {
        return eletero;
    }

    public int getTamadas() {
        return tamadas;
    }

    public int getHely() {
        return hely;
    }

    public void setHely() {
        this.hely = ThreadLocalRandom.current().nextInt(1, 3);
    }

    public void setEletero(int eletero) {
        this.eletero = eletero;
    }

    public void setTamadas(int tamadas) {
        this.tamadas = tamadas;
    }
    
    
    @Override
    public String toString() {
        return "Karakter{" + "eletero=" + eletero + ", tamadas=" + tamadas + ", hely=" + hely + '}';
    }
    
    
    
}
