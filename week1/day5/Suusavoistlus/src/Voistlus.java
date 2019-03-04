import java.util.*;

public class Voistlus{
    private ArrayList<Suusataja> voistlejad;
    private int koguDistants;
    private ArrayList<Suusataja> katkestajad;
    private int lopetanuteProtsent;

    public Voistlus() {
        this.voistlejad = new ArrayList();
        this.katkestajad = new ArrayList<>();
        this.koguDistants = 20;
        System.out.println("Start");
        for (int i = 1; i < 20; i++) {
            this.voistlejad.add(new Suusataja(i));
        }
        this.lopetanuteProtsent = (int) (this.voistlejad.size() * 0.7);
        aeg();
    }

    // Võetakse random number
    // ja kui see on üle .95,
    // siis võetakse random int
    // ja tehakse sellele pop memberite arrays
    // ning pannakse see eraldi array listi
    // ning prinditake see list lõpus välja.

    public void aeg () {

        for (Suusataja member : this.voistlejad) {
            member.suusata();
            System.out.println(member);
            boolean lopetanud = member.kasOnLopetanud(this.koguDistants);
            if (lopetanud) {
                System.out.println("Võitja on: " + member + " ja " + member.getDopinguKordaja());
                System.out.println("Katkestajad: " + this.katkestajad);
                return;
            }
        }
        System.out.println("-------------------");

        double kasKatkestab = Math.random();
        int katkestajaIndex = Suusataja.getRandomNumberInRange(0, this.voistlejad.size()-1);
        if (kasKatkestab > 0.9998 && this.voistlejad.size() > this.lopetanuteProtsent) {
            Suusataja katkestaja = this.voistlejad.get(katkestajaIndex);
            this.katkestajad.add(katkestaja);
            this.voistlejad.remove(katkestajaIndex);
        }

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        aeg();
    }
}
