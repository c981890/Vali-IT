public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        int number = 5;
        double n2 = 5.1;
        byte bait = 5;

        System.out.println(2.0 - 1.1);
        System.out.println(200 - 110);

        String nimi = "Krister";
        nimi.length();

        System.out.println(nimi);

        char algusTaht = 'K';

        if (number == 5) {

        } else if (number > 5) {

        } else {

        }

        System.out.println("tere " + 5);
        System.out.println(5 + " tere");

        int liitmine = (int) (number + n2);

        System.out.println(liitmine);

        System.out.println(summa(5, 4));

        int parisNumber = Integer.parseInt("4");
        double parisNumber2 = Double.parseDouble("4.1");

        String puuvli1 = "Banaan";
        String puuvli2 = "Banaan";

        if (puuvli1.equals(puuvli2)) {
            System.out.println("PUUVLID on VÕRDSED");
        } else {
            System.out.println("Pole võrdsed");
        }

        Koer.auh();
        Koer.lausu();
        Kass.nurr();

    }

    public static int summa (int a, int b) {
        return a + b;
    }
}
