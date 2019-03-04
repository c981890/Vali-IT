import java.sql.Array;

public class Main {

    public static void main(String[] args) {

        // countEvens([2, 1, 2, 3, 4])

        int[] jarjend = new int[]{2, 1, 2, 3, 4};
        int loendur = 0;

        for (int i = 0; i < jarjend.length; i++) {
            if (jarjend[i] % 2 == 0) {
                loendur++;
            }
        }
        System.out.println(loendur);

        int[] jarjend2 = new int[]{1, 2, 2, 1, 13};
        int summa = 0;

        int[] sums = new int[]{13, 1, 2, 13, 2, 1, 13};

        System.out.println(sum13(sums));

        int[] sums3 = new int[]{1, 2, 2, 6, 99, 99, 7};
        System.out.println("sum67 vastus: " + sum67(sums3));

        int[] sums4 = new int[]{1, 2, 2};
        System.out.println("has22 vastus: " + has22(sums4));
    }

    // Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
    public boolean sum28(int[] nums) {
        int sumOf2s = 0;
        for (int member : nums) {
            if (member == 2) {
                sumOf2s += member;
            }
        }
        if (sumOf2s == 8) {
            return true;
        } else {
            return false;
        }
    }


    // Given an array of ints, return true if the array contains no 1's and no 3's.
    public boolean lucky13(int[] nums) {
        int nr1Loendur = 0;
        int nr3Loendur = 0;
        for (int member : nums) {
            if (member == 1) {
                nr1Loendur++;
            } else if(member == 3) {
                nr3Loendur++;
            }
        }
        if (nr1Loendur == 0 && nr3Loendur == 0) {
            return true;
        } else {
            return false;
        }

    }



    /*
    Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky,
    so it does not count and numbers that come immediately after a 13 also do not count.
     */
    public static int sum13(int[] nums) {
        int summa = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 13) {
                summa += nums[i];
            } else if (nums[i] == 13) {
                i++;
            }
        }
        return summa;
    }

    /*
    Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to
    the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
     */
    public static int sum67(int[] nums) {
        int summa = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 6) {
                summa += nums[i];
            } else if (nums[i] == 6) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 7) {
                        continue;
                    } else if (nums[j] == 7) {
                        i = j;
                        break;
                    }

                }
            }
        }

        return summa;
    }

    // Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
    public static boolean has22(int[] nums) {
        boolean vastus = false;
        if (nums.length > 1) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == 2 && nums[i + 1] == 2) {
                    vastus = true;
                    break;
                } else {
                    vastus = false;
                }

            }

        }
        return vastus;
    }

}


