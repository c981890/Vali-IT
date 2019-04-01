package ee.valiit.romannumeral;

public class RomanNumerals {

    static int[] ARABIC_DIGITS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    static String[] ROMAN_DIGITS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};


    public static String  convert(int arabic) {

        String roman = "";

        for (int i = 0; i < ARABIC_DIGITS.length; i++) {
            while (arabic >= ARABIC_DIGITS[i]) {
                roman += ROMAN_DIGITS[i];
                arabic -= ARABIC_DIGITS[i];
            }
        }
        return roman;
    }
}

