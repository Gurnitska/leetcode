package algorithms.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeSumTest {
    @Test
    public void test1(){
        ThreeSum threeSum = new ThreeSum();
        int [] intput = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum.threeSum(intput);
        //[[-1,-1,2],[-1,0,1]]
        List<List<Integer>> expected = new ArrayList<>(){{
            add(List.of(-1, -1, 2));
            add(List.of(-1, 0, 1));
        }};
        assertEquals(expected, result);
    }

    @Test
    public void test2(){
        ThreeSum threeSum = new ThreeSum();
        int [] intput = new int[]{0,1,1};
        List<List<Integer>> result = threeSum.threeSum(intput);
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, result);
    }
    @Test
    public void test3(){
        ThreeSum threeSum = new ThreeSum();
        int [] intput = new int[]{0,0,0};
        List<List<Integer>> result = threeSum.threeSum(intput);
        List<List<Integer>> expected = new ArrayList<>(){{
            add(List.of(0,0,0));
        }};
        assertEquals(expected, result);
    }
    @Test
    public void test4(){
        ThreeSum threeSum = new ThreeSum();
        int [] intput = new int[]{0,0,0,0};
        List<List<Integer>> result = threeSum.threeSum(intput);
        List<List<Integer>> expected = new ArrayList<>(){{
            add(List.of(0,0,0));
        }};
        assertEquals(expected, result);
    }
    @Test
    public void test5(){
        ThreeSum threeSum = new ThreeSum();
        int [] intput = new int[]{1,-1,-1,0};
        List<List<Integer>> result = threeSum.threeSum(intput);
        List<List<Integer>> expected = new ArrayList<>(){{
            add(List.of(-1,0,1));
        }};
        assertEquals(expected, result);
    }
    @Test
    public void test6(){
        ThreeSum threeSum = new ThreeSum();
        int [] intput = new int[]{-2,0,0,2,2};
        List<List<Integer>> result = threeSum.threeSum(intput);
        List<List<Integer>> expected = new ArrayList<>(){{
            add(List.of(-2,0,2));
        }};
        assertEquals(expected, result);
    }


}
