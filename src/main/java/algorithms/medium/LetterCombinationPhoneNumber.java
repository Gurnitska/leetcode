package algorithms.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationPhoneNumber {
    static Map<String, String> numbersLetters = Map.of(
            "2", "abc",
            "3", "def",
            "4", "ghi",
            "5", "jkl",
            "6", "mno",
            "7", "pqrs",
            "8", "tuv",
            "9", "wxyz");

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }
        backtrack(result, "", digits);
        return result;
    }

    private static void backtrack(List<String> result, String combination, String digits) {
        if (digits.isEmpty()) {
            result.add(combination);
            return;
        }
        String digit = String.valueOf(digits.charAt(0));
        String letters = numbersLetters.get(digit);
        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);
            backtrack(result, combination + letter, digits.substring(1));
        }
    }
}
