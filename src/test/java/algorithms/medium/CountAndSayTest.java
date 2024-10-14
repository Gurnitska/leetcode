package algorithms.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountAndSayTest {

    @Test
    public void test1(){
        CountAndSay countAndSay = new CountAndSay();
        String result = countAndSay.countAndSay(4);
        assertEquals("1211", result);
    }

}