package dojo.roman;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class RomanNumbers {

    private static final Map<String, Integer> values = new HashMap<>();

    static {
        values.put("I", 1);
        values.put("IV", 4);
        values.put("V", 5);
        values.put("IX", 9);
        values.put("X", 10);
    }

    public static int asInt(String romanNumeral) {
        if (romanNumeral.isEmpty()) {
            throw new InvalidRomanNumeralException("Invalid Roman Numeral " + romanNumeral);
        }

        // II = 2
        // IV = 4
        // IX = 9
        // XC = 90
        // XCIX = 99
        int i = 0;
        int total = 0;
        if (romanNumeral.length() == 1) {
            return values.get(romanNumeral);
        } else {
            while (i < romanNumeral.length()) {
                int valueToAdd;
                Optional<String> twoCharToken = twoCharToken(romanNumeral, i);
                if (twoCharToken.isPresent()) {
                    valueToAdd = values.get(twoCharToken.get());
                    i = i + 2;
                } else {
                    String currentOneCharToken = romanNumeral.substring(i, i + 1);
                    valueToAdd = values.get(currentOneCharToken);
                    i = i + 1;
                }
                total = total + valueToAdd;
            }
        }
        return total;
    }

    private static Optional<String> twoCharToken(String romanNumeral, int i) {
        // XCIX
        if (romanNumeral.length() >= i + 2) {
            String token = romanNumeral.substring(i, i + 2);
            if (values.containsKey(token)) {
                return Optional.of(romanNumeral.substring(i, i + 2));
            }
        }
        return Optional.empty();
    }
}
