import java.util.Arrays;

public class Country {
    private int population;
    private String name;
    private String[] enimKoneldudKeeled;

    public Country(int population, String name, String[] enimKoneldudKeeled) {
        this.population = population;
        this.name = name;
        this.enimKoneldudKeeled = enimKoneldudKeeled;
    }

    public Country() {

    }


    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getEnimKoneldudKeeled() {
        return enimKoneldudKeeled;
    }

    public void setEnimKoneldudKeeled(String[] enimKoneldudKeeled) {
        this.enimKoneldudKeeled = enimKoneldudKeeled;
    }

    @Override
    public String toString() {
        return "Riik: " + getName() + "; Rahvaarv: " + getPopulation() + "; Enim kõneldud keeled: "
                + Arrays.toString(getEnimKoneldudKeeled());
    }
}
