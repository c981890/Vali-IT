import java.util.*;

public class Suusataja {
    private int stardinumber;
    private double kiirus;
    private double labitudDistants;
    private double dopinguKordaja;
    private double dopinguKordajaPiir;

    public Suusataja (int i) {
        this.stardinumber = i;
        this.kiirus = getRandomNumberInRange(10, 20);
        // this.kiirus = Math.random() * 20;
        this.labitudDistants = 0;
        this.dopinguKordaja = Math.random();
        this.dopinguKordajaPiir = 0.5;
    }

    public void suusata() {

        if (this.dopinguKordaja < this.dopinguKordajaPiir) {
            this.labitudDistants += this.kiirus/3600;
        } else {
            this.labitudDistants += (this.kiirus/3600) * 1.15;
        }

    }

    public String toString() {
        int dist = (int)(this.labitudDistants);
        String nool = this.stardinumber + ": ";
        for (int i = 0; i <  dist; i++) {
            nool += "=";
        }
        nool += ">";
        return "Võistleja nr. " + nool;

        // return "Võistleja: " + this.stardinumber +" (läbitud distants: " + dist + ")";
    }

    public boolean kasOnLopetanud(int koguDistants) {

        return this.labitudDistants >= koguDistants;
    }

    public String getDopinguKordaja() {
        if (this.dopinguKordaja < dopinguKordajaPiir) {
            return "dopingukontroll oli negatiivne.";
        }
        return "dopingukontrollis oli A proov positiivne.";
    }

    // https://www.mkyong.com/java/java-generate-random-integers-in-a-range/
    public static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
