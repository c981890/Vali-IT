import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Keskseks teemaks on array ehk massiiv

        int[] massiiv = new int[6];
        ArrayList list = new ArrayList();

        String massiivStr = Arrays.toString(massiiv);
        System.out.println(massiivStr);

        // Muuda kolmandal pos. olev number viieks.

        massiiv[2] = 5;
        System.out.println(Arrays.toString(massiiv));

        // Prindi välja viimane element masssiivist. Määra sellele enne väärtus.
        massiiv[5] = 7;
        System.out.println(massiiv[5]);

        // Prindi välja viimane element massivist hoolimata massiivi suurus.
        int viimane = massiiv.length - 1;
        System.out.println(massiiv[viimane]);
        System.out.println(massiiv[massiiv.length - 1]);

        // Loo massiv kus numbrid kohe määratud.

        int[] massiiv8 = new  int[] {9, 5, 3, 28, 5, 6, 7, 58};
        System.out.println(Arrays.toString(massiiv8));

        // Prindi välja ükshaaval kõik väärtused massiiv2-st.
        int index = 0;
        while (index < massiiv8.length) {
            System.out.println(massiiv8[index]);
            index++;
        }

        // Teeme sama tsükli kiiremini kasutades for tsüklit

        for (int i = 0; i < massiiv8.length; i++) {
            System.out.println(massiiv8[i]);
        }

    }
}
