public class Main {
    public static void main(String[] args) {

        Koer pontu = new Koer();
        pontu.lausu();
        pontu.maga();
        pontu.ajaPeremeesYles();

        Kass nurr = new Kass();
        nurr.lausu();
        nurr.maga();
        pontu.ajaPeremeesYles();

        System.out.println(nurr.getSaba());
        System.out.println(pontu.getSaba());

    }
}
