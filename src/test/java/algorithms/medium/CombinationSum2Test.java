package algorithms.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSum2Test {
//    Input: candidates = [10,1,2,7,6,1,5], target = 8
//    Output:
//            [
//            [1,1,6],
//            [1,2,5],
//            [1,7],
//            [2,6]
//            ]
    @Test
    public void test(){
        CombinationSum2 combinationSum = new CombinationSum2();
        List<List<Integer>> list = combinationSum.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1,1,6));
        expected.add(List.of(1,2,5));
        expected.add(List.of(1,7));
        expected.add(List.of(2,6));

        assertEquals(expected, list);

    }
//    [1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1]
    @Test
    public void test2(){
        CombinationSum2 combinationSum = new CombinationSum2();
        List<List<Integer>> list = combinationSum.combinationSum2(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 30);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1,1,6));
        expected.add(List.of(1,2,5));
        expected.add(List.of(1,7));
        expected.add(List.of(2,6));

        assertEquals(expected, list);

    }
}