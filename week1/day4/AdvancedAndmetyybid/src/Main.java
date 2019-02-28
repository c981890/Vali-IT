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

        int[] massiiv8 = new int[]{9, 5, 3, 28, 5, 6, 7, 58};
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

        // Loo Stringide massiiv, mis on alguses tühi aga siis lisad veel sõne. Prindi välja.

        String[] stringMassiiv = new String[6];
        stringMassiiv[2] = "Tere";
        stringMassiiv[3] = ", ";
        stringMassiiv[4] = "maailm!";

        System.out.print(stringMassiiv[2]);
        System.out.print(stringMassiiv[3]);
        System.out.println(stringMassiiv[4]);

        String[] slice = new String[4 - 1];

        // Copy elements of arr to slice
        for (int i = 0; i < slice.length; i++) {
            slice[i] = stringMassiiv[2 + i];
        }

        System.out.println(Arrays.toString(slice));


        // Loo massiiv, kus on 100 kohta.
        // Sisesta sellesse massiivi loetelu numbreid 0..99
        // Prindi välja

        int[] massiiv100 = new int[100];

        for (int i = 0; i < massiiv100.length; i++) {
            massiiv100[i] = i;
        }

        for (int i = 0; i < massiiv100.length; i++) {
            System.out.println(massiiv100[i]);
        }

    }
}
