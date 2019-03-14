import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Ülesanne 1.
        ylesanne1();

        // Ülesanne 2.
        int muutuja1 = 3;
        int muutuja2 = 3;
        boolean ylesanne2Vastus = ylesanne2(muutuja1, muutuja2);
        System.out.println("Ülesanne 2: " + ylesanne2Vastus);

        // Ülesanne 3.
        String[] stringideMassiiv = new String[] {"üks", "kaks", "kolm", "neli"};
        ArrayList<Integer> taisarvudeMasssiiv = ylesanne3(stringideMassiiv);
        System.out.println("Üleasnne 3: " + taisarvudeMasssiiv);

        // Ülesanne 4.
        int aastaarv0 = 0;
        int aastaarv1 = 1;
        int aastaarv128 = 128;
        int aastaarv598 = 598;
        int aastaarv1624 = 1624;
        int aastaarv1827 = 1827;
        int aastaarv1996 = 1996;
        int aastaarv2017 = 2017;
        System.out.println("Ülesanne 4: " + ylesanne4(aastaarv0));
        System.out.println("Ülesanne 4: " + ylesanne4(aastaarv1));
        System.out.println("Ülesanne 4: " + ylesanne4(aastaarv128));
        System.out.println("Ülesanne 4: " + ylesanne4(aastaarv598));
        System.out.println("Ülesanne 4: " + ylesanne4(aastaarv1624));
        System.out.println("Ülesanne 4: " + ylesanne4(aastaarv1827));
        System.out.println("Ülesanne 4: " + ylesanne4(aastaarv1996));
        System.out.println("Ülesanne 4: " + ylesanne4(aastaarv2017));

        // Ülesanne 5.
        Country countrySoome = new Country();
        countrySoome.setName("Soome");
        countrySoome.setPopulation(5513000);
        String[] countrySoomeEnimKoneldudKeeled = new String[] {"soome keel","rootsi keel"};
        countrySoome.setEnimKoneldudKeeled(countrySoomeEnimKoneldudKeeled);
        System.out.println("Ülesanne 5: " + countrySoome.toString());



    }

    private static int ylesanne4(int aastaarv) {
        byte century = 0;
        if (aastaarv < 1 || aastaarv > 2018) {
            century = -1;
        } else {
            century = (byte) ((aastaarv / 100) + 1);
        }
        return century;
    }

    private static ArrayList<Integer> ylesanne3(String[] stringideMassiiv) {
        ArrayList taisarvudeMassiiv = new ArrayList<>();
        for (int i = 0; i < stringideMassiiv.length; i++) {
            taisarvudeMassiiv.add(stringideMassiiv[i].length());
        }
        return taisarvudeMassiiv;
    }


    private static boolean ylesanne2(int muutuja1, int muutuja2) {
        return (muutuja1 == muutuja2);
    }

    public static void ylesanne1() {
        double pi = Math.PI;
        System.out.println("Ülesanne 1: " + 2 * pi);
    }



}
