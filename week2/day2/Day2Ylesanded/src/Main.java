public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
    }

    /* We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array,
    at least one of the pair is that value. Return true if the given value is everywhere in the array.
     */
    public boolean isEverywhere(int[] nums, int val) {
        boolean toevaartus = false;
        int kontrollNr = nums.length / 2;
        int loendur = 0;

        for (int i = 0; i < nums.length - 1; i = i + 2) {
            if (nums[i] == val || nums[i+1] == 2) {
                loendur++;
            }
        }

        toevaartus = loendur == kontrollNr;

        if (kontrollNr % 2 == 1) {
            toevaartus = false;
        }

        return toevaartus;
    }



}
