import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        int i = 5;
        int uus = 5 * i++;
        System.out.println("uus: " + uus);

        int c = 0;
        c = c++;
        System.out.println(c);

        String s1 = "Tartu";
        String s2 = "Tallinn";
        int j = s1.compareTo(s2);
        System.out.println(j);

        int[] massiiv1 = new int[] {-10, 17, 21};
        int[] massiiv2 = new int[] {-2, 5, 17, 28};
        int massiividePikkusKokku = massiiv1.length + massiiv2.length;
        System.out.println("Massiivide pikkus kokku: " + massiividePikkusKokku);

        int[] massiivUus = new int[massiividePikkusKokku];

        System.arraycopy(massiiv1, 0, massiivUus, 0, massiiv1.length);
        System.arraycopy(massiiv2, 0, massiivUus, massiiv1.length, massiiv2.length);
        Arrays.sort(massiivUus );
         for (int element : massiivUus) {
             System.out.println(element);
         }

         int[] pooratudMassiiv = new int[massiividePikkusKokku];
         int m = 6;
         for (int element : massiivUus) {
             element *= -1;
             pooratudMassiiv[m] = element;
             m--;
         }
        for (int element : pooratudMassiiv) {
            System.out.println(element);
        }

     }
}
