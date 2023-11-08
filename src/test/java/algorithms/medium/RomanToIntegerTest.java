package algorithms.medium;

import org.junit.Assert;
import org.junit.Test;

import algorithms.easy.RomanToInteger;

public class RomanToIntegerTest {
    @Test
    public void test1(){
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInt("III");
        Assert.assertEquals(3, result);
    }
    @Test
    public void test2(){
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInt("LVIII");
        Assert.assertEquals(58, result);
    }
    @Test
    public void test3(){
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInt("MCMXCIV");
        Assert.assertEquals(1994, result);
    }

    @Test
    public void test4(){
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInt("DCXXI");
        Assert.assertEquals(621, result);
    }

    //MDCCCLXXXIV
    @Test
    public void test5(){
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInt("MDCCCLXXXIV");
        Assert.assertEquals(1884, result);
    }
}
