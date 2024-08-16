package algorithms.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterCombinationPhoneNumberTest {

//    Example 1:
//
//    Input: digits = "23"
//    Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
//    Example 2:
//
//    Input: digits = ""
//    Output: []
//    Example 3:
//
//    Input: digits = "2"
//    Output: ["a","b","c"]

    @Test
    public void test1(){
        LetterCombinationPhoneNumber letterCombinationPhoneNumber = new LetterCombinationPhoneNumber();
        List<String> result = letterCombinationPhoneNumber.letterCombinations("23");
        List<String> expected = List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        assertEquals(expected, result);
    }    @Test
    public void test2(){
        LetterCombinationPhoneNumber letterCombinationPhoneNumber = new LetterCombinationPhoneNumber();
        List<String> result = letterCombinationPhoneNumber.letterCombinations("");
        List<String> expected = List.of();
        assertEquals(expected, result);
    }    @Test
    public void test3(){
        LetterCombinationPhoneNumber letterCombinationPhoneNumber = new LetterCombinationPhoneNumber();
        List<String> result = letterCombinationPhoneNumber.letterCombinations("2");
        List<String> expected = List.of("a", "b", "c");
        assertEquals(expected, result);
    }
    @Test
    public void test4(){
        LetterCombinationPhoneNumber letterCombinationPhoneNumber = new LetterCombinationPhoneNumber();
        List<String> result = letterCombinationPhoneNumber.letterCombinations("234");
        List<String> expected = List.of("adg","adh","adi","aeg","aeh","aei","afg","afh","afi","bdg","bdh","bdi","beg",
                "beh","bei","bfg","bfh","bfi","cdg","cdh","cdi","ceg","ceh","cei","cfg","cfh","cfi");
        assertEquals(expected, result);
    }
}
