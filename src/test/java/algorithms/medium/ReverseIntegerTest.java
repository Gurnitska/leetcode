package algorithms.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {

//    Example 1:
//
//    Input: x = 123
//    Output: 321
//    Example 2:
//
//    Input: x = -123
//    Output: -321
//    Example 3:
//
//    Input: x = 120
//    Output: 21

    @Test
    public void test1(){
        ReverseInteger reverseInteger = new ReverseInteger();
        int result = reverseInteger.reverse(123);
        assertEquals(321, result);
    }

    @Test
    public void test2(){
        ReverseInteger reverseInteger = new ReverseInteger();
        int result = reverseInteger.reverse(-123);
        assertEquals(-321, result);
    }

    @Test
    public void test3(){
        ReverseInteger reverseInteger = new ReverseInteger();
        int result = reverseInteger.reverse(120);
        assertEquals(21, result);
    }

    @Test
    public void test4(){
        ReverseInteger reverseInteger = new ReverseInteger();
        //2147483648
        //1534236469
        int result = reverseInteger.reverse(1534236469);
        assertEquals(0, result);
    }
}
