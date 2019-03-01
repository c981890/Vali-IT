import java.util.*;

public class Voistlus{
    private ArrayList<Suusataja> voistlejad;
    private int koguDistants;

    public Voistlus() {
        this.voistlejad = new ArrayList();
        this.koguDistants = 20;
        System.out.println("Start");
        for (int i = 0; i < 50; i++) {
            this.voistlejad.add(new Suusataja(i));
        }
        aeg();
    }

    public void aeg () {
        for (Suusataja member : this.voistlejad) {
            member.suusata();
        }
        System.out.println(voistlejad);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        aeg();
    }
}
