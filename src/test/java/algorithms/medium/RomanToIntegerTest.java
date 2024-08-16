package algorithms.medium;

import algorithms.easy.RomanToInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {
    @Test
    public void test1(){
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInt("III");
        assertEquals(3, result);
    }
    @Test
    public void test2(){
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInt("LVIII");
        assertEquals(58, result);
    }
    @Test
    public void test3(){
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInt("MCMXCIV");
        assertEquals(1994, result);
    }

    @Test
    public void test4(){
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInt("DCXXI");
        assertEquals(621, result);
    }

    //MDCCCLXXXIV
    @Test
    public void test5(){
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInt("MDCCCLXXXIV");
        assertEquals(1884, result);
    }
}
