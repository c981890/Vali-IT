import java.util.*;

public class Suusataja {
    private int stardinumber;
    private double kiirus;
    private double labitudDistants;
    double dopinguKordaja;

    public Suusataja (int i) {
        this.stardinumber = i;
        this.kiirus = Math.random() * 20;
        this.labitudDistants = 0;
    }

    public void suusata() {
        labitudDistants += this.kiirus/3600;
    }

    public String toString() {
        int dist = (int)(this.labitudDistants *1000);
        String nool = this.stardinumber + ": ";
        for (int i = 0; i <  dist; i++) {
            nool += "=";
        }
        return "Võistleja: " + this.stardinumber +" (läbitud distants: " + dist + ")";
    }

    public boolean kasOnLopetanud(int koguDistants) {
        return this.labitudDistants >= koguDistants;
    }
}
