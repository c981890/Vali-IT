import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] algus = new int[20];
        for (int i = 0; i < algus.length; i++) {
            algus[i] = i;
        }
        System.out.println(Arrays.toString(algus));

        for (int i = 0; i < algus.length; i++) {
            int rand = (int) (Math.random() * 20);
            int salvestan = algus[i];
            algus[i] = algus[rand];
                    algus[rand] = salvestan;
        }
        System.out.println(Arrays.toString(algus));

    }
}
