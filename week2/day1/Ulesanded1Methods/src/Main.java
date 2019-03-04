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

    // Given an array of ints, return true if every element is a 1 or a 4.
    public boolean only14(int[] nums) {
        int loendur = 0;
        for (int member : nums) {
            if (member != 1 && member != 4) {
                loendur++;
            }
        }
        if (loendur > 0) {
            return false;
        } else if (loendur == 0){
            return true;
        }
    }


    /*
    This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first
    problem for job interviews. (See also: FizzBuzz Code.) Consider the series of numbers beginning at start and
    running up to but not including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4. Return a
    new String[] array containing the string form of these numbers, except for multiples of 3, use "Fizz" instead
    of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz". In Java,
    String.valueOf(xxx) will make the String form of an int or other type. This version is a little more complicated
    than the usual version since you have to allocate and index into an array instead of just printing, and we vary
    the start/end instead of just always doing 1..100.
     */
    public String[] fizzBuzz(int start, int end) {
        int massiiviSuurus = end - start;
        String[] massiiv = new String[massiiviSuurus];
        int algus = start;
        for (int i = 0; i < massiiv.length; i++) {
            if (algus % 3 == 0 && algus % 5 != 0) {
                massiiv[i] = "Fizz";
                algus++;
            } else if (algus % 3 != 0 && algus % 5 == 0) {
                massiiv[i] = "Buzz";
                algus++;
            } else if (algus % 3 == 0 && algus % 5 == 0) {
                massiiv[i] = "FizzBuzz";
                algus++;
            } else {
                massiiv[i] = Integer.toString(algus);
                algus++;
            }
        }
        return massiiv;
    }

    /*
    Given start and end numbers, return a new array containing the sequence of integers from start up to but not
    including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the
    start number. Note that a length-0 array is valid. (See also: FizzBuzz Code)
     */
    public int[] fizzArray3(int start, int end) {
        int massiiviSuurus = end - start;
        int[] massiiv = new int[massiiviSuurus];
        for (int i = 0; i < massiiv.length; i++) {
            massiiv[i] = start;
            start++;
        }
        return massiiv;
    }


    /*
    Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" ..
    through n-1. N may be 0, in which case just return a length 0 array. Note: String.valueOf(xxx) will make the
    String form of most types. The syntax to make a new string array is: new String[desired_length].
    (See also: FizzBuzz Code)
     */
    public String[] fizzArray2(int n) {
        String[] massiiv = new String[n];

        for (int i = 0; i < massiiv.length; i++) {
            massiiv[i] = Integer.toString(i);
        }
        return massiiv;
    }


    /*
    Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
    The given n may be 0, in which case just return a length 0 array. You do not need a separate if-statement
    for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works. The
    syntax to make a new int array is: new int[desired_length].
     */
    public int[] fizzArray(int n) {
        int[] massiiv = new int[n];
        for (int i = 0; i < massiiv.length; i++) {
            massiiv[i] = i;

        }
        return massiiv;

    }


    // Given an array of ints, return true if the number of 1's is greater than the number of 4's.
    public boolean more14(int[] nums) {
        int nrOf1 = 0;
        int nrOf4 = 0;
        for (int member : nums) {
            if (member == 1) {
                nrOf1++;
            } else if(member == 4) {
                nrOf4++;
            }
        }
        if (nrOf1 > nrOf4) {
            return true;
        } else {
            return false;
        }
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


