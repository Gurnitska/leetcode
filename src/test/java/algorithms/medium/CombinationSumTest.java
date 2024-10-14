package algorithms.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {
    //    Input: candidates = [2,3,5], target = 8
//    Output: [[2,2,2,2],[2,3,3],[3,5]]
    @Test
    public void test(){
        CombinationSum combinationSum = new CombinationSum();
        List<List<Integer>> list = combinationSum.combinationSum(new int[]{2,3,5}, 8);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(2,2,2,2));
        expected.add(List.of(2,3,3));
        expected.add(List.of(3,5));

        assertEquals(expected, list);

    }


}