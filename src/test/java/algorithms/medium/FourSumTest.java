package algorithms.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FourSumTest {
    @Test
    public void test() {
        FourSum fourSum = new FourSum();
        List<List<Integer>> result = fourSum.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-2, -1, 1, 2));
        expected.add(Arrays.asList(-2, 0, 0, 2));
        expected.add(Arrays.asList(-1, 0, 0, 1));
        assertEquals(expected, result);

    }
    @Test
    public void test1(){
        FourSum fourSum = new FourSum();
        List<List<Integer>> result = fourSum.fourSum(new int[]{0, 0, 0, 0}, 0);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 0, 0, 0));
        assertEquals(expected, result);
    }

    @Test
    public void test2(){
        FourSum fourSum = new FourSum();
        List<List<Integer>> result = fourSum.fourSum(new int[]{2, 2, 2, 2, 2}, 8);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(2, 2, 2, 2));
        assertEquals(expected, result);
    }

    @Test
    public void test3() {
        FourSum fourSum = new FourSum();
        List<List<Integer>> result = fourSum.fourSum(new int[]{-3,-2,-1,0,0,1,2,3}, 0);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-3,-2,2,3));
        expected.add(Arrays.asList(-3,-1,1,3));
        expected.add(Arrays.asList(-3,0,0,3));
        expected.add(Arrays.asList(-3,0,1,2));
        expected.add(Arrays.asList(-2,-1,0,3));
        expected.add(Arrays.asList(-2,-1,1,2));
        expected.add(Arrays.asList(-2,0,0,2));
        expected.add(Arrays.asList(-1,0,0,1));
        assertEquals(expected, result);

    }

    @Test
    public void test4() {
        FourSum fourSum = new FourSum();
        List<List<Integer>> result = fourSum.fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296);
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, result);

    }
}