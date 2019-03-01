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

        // switch
        int rongiNr = 50;
        String suund = null;
        switch (rongiNr) {
            case 50: suund = "Pärnu";  break;
            case 55: suund = "Haapsalu"; break;
            case 10: suund = "Vormsi"; break;
        }

        System.out.println(suund);

        // FOREACH
        int[] mingidNumbrid = new int[]{8, 4, 62, 12};
        for (int member : mingidNumbrid) {
            System.out.println(member);
        }

        // Õpilane saab 0-100
        // kui punkte alla 50, kukub ta läbi
        // vastasel juhul on hinne täisarvuline punktid/20
        // 100 => 5
        // 80 => 4
        // 67 => 3
        // 50 => 2

        int punkte = 49;
        if (punkte > 100 || punkte <0) {
            throw new Error();
        }
        switch ( punkte / 20) {
            case 5:
                System.out.println("suurepärane");
                break;
            case 4:
                System.out.println("hea");
                break;
            case 3:
                System.out.println("rahuldav");
            case 2:
                System.out.println("ee... õppisid ka?");
            default:
                System.out.println("Kukkusid läbi");
        }



    }
}
