package algorithms.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringToIntegerTest {
//    Example 1:
//
//    Input: s = "42"
//    Output: 42
//    Explanation: The underlined characters are what is read in, the caret is the current reader position.
//    Step 1: "42" (no characters read because there is no leading whitespace)
//            ^
//    Step 2: "42" (no characters read because there is neither a '-' nor '+')
//            ^
//    Step 3: "42" ("42" is read in)
//            ^
//    The parsed integer is 42.
//    Since 42 is in the range [-231, 231 - 1], the final result is 42.
//    Example 2:
//
//    Input: s = "   -42"
//    Output: -42
//    Explanation:
//    Step 1: "   -42" (leading whitespace is read and ignored)
//            ^
//    Step 2: "   -42" ('-' is read, so the result should be negative)
//            ^
//    Step 3: "   -42" ("42" is read in)
//            ^
//    The parsed integer is -42.
//    Since -42 is in the range [-231, 231 - 1], the final result is -42.
//    Example 3:
//
//    Input: s = "4193 with words"
//    Output: 4193
//    Explanation:
//    Step 1: "4193 with words" (no characters read because there is no leading whitespace)
//            ^
//    Step 2: "4193 with words" (no characters read because there is neither a '-' nor '+')
//            ^
//    Step 3: "4193 with words" ("4193" is read in; reading stops because the next character is a non-digit)
//            ^
//    The parsed integer is 4193.
//    Since 4193 is in the range [-231, 231 - 1], the final result is 4193.

    @Test
    public void test1(){
        StringToInteger stringToInteger = new StringToInteger();
        int result = stringToInteger.myAtoi("42");
        assertEquals(42, result);
    }

    @Test
    public void test2(){
        StringToInteger stringToInteger = new StringToInteger();
        int result = stringToInteger.myAtoi("   -42");
        assertEquals(-42, result);
    }

    @Test
    public void test3(){
        StringToInteger stringToInteger = new StringToInteger();
        int result = stringToInteger.myAtoi("4193 with words");
        assertEquals(4193, result);
    }
    @Test
    public void test4(){
        StringToInteger stringToInteger = new StringToInteger();
        int result = stringToInteger.myAtoi("-912834723323");
        assertEquals(-2147483648, result);
    }
    @Test
    public void test5(){
        StringToInteger stringToInteger = new StringToInteger();
        int result = stringToInteger.myAtoi("");
        assertEquals(0, result);
    }

    //21474836460
    @Test
    public void test6(){
        StringToInteger stringToInteger = new StringToInteger();
        int result = stringToInteger.myAtoi("21474836460");
        assertEquals(2147483647, result);
    }
}
