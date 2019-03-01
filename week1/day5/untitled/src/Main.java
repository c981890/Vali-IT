import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi!");

        // Loo kolm muutuajt numbritega.
        // Moodusta lause nende muutujatega.
        // Prindi see lause välja.

        int aasta = 88;
        int kuu = 9;
        int paev = 16;
        String lause = "Krister sündis " + paev + "." + kuu + "." + aasta + ".";
        System.out.println(lause);

        // %d on täisarv
        // %f on komakohaga
        // %s on string
        String paremLause = String.format("Krister sündis %d.%d.%d.", paev, kuu, aasta);
        System.out.println(paremLause);


        // Loo HashMap järgneva infoga:
        // Loe kokku mitu lampi on klassis
        // Loe kokku mitu inimest on klassis
        HashMap klassiAsjad = new HashMap();
        klassiAsjad.put("aknad", 5);
        klassiAsjad.put("lambid", 8);
        klassiAsjad.put("inimesed", 21);

        System.out.println(klassiAsjad);


        // prindi välja kui palju on inimesi klassis, kasutades juba loodud HashMapi.

        System.out.println(klassiAsjad.get("inimesed"));

        klassiAsjad.put(10, "tasapinnad");
        System.out.println(klassiAsjad.get(10));

        // loo uusHashMap kuhu saab sisestada ainult String:double paare.
        // sisesta sinna midagi.

        HashMap<String, Double> vajalikeAsjadeKogus = new HashMap<>();
        vajalikeAsjadeKogus.put("kohvipakid", 10.0);
        vajalikeAsjadeKogus.put("piim", 5.0);

        







    }
}
