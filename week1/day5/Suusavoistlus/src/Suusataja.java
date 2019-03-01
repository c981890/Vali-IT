import java.util.*;

public class Suusataja {
    private int stardinumber;
    private double kiirus;
    private double labitudDistants;

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
        return "Võistleja: " + this.stardinumber +" (läbitud distants: " + dist + ")";
    }
}
