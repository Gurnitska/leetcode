package algorithms.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZigzagConversionTest {

//    Input: s = "PAYPALISHIRING", numRows = 3
//    Output: "PAHNAPLSIIGYIR"
//    Example 2:
//
//    Input: s = "PAYPALISHIRING", numRows = 4
//    Output: "PINALSIGYAHRPI"

    @Test
    public void test1(){
        ZigzagConvertion zigzagConvertion = new ZigzagConvertion();
        String result = zigzagConvertion.convert("PAYPALISHIRING", 3);
        assertEquals("PAHNAPLSIIGYIR", result);
    }

    @Test
    public void test2(){
        ZigzagConvertion zigzagConvertion = new ZigzagConvertion();
        String result = zigzagConvertion.convert("PAYPALISHIRING", 4);
        assertEquals("PINALSIGYAHRPI", result);
    }    @Test
    public void test3(){
        ZigzagConvertion zigzagConvertion = new ZigzagConvertion();
        String result = zigzagConvertion.convert("A", 1);
        assertEquals("A", result);
    }

    @Test
    public void test4(){
        ZigzagConvertion zigzagConvertion = new ZigzagConvertion();
        String result = zigzagConvertion.convert("AABBCCDD", 2);
        assertEquals("ABCDABCD", result);
    }
}
