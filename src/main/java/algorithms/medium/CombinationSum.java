package algorithms.medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

//    Input: candidates = [2,3,5], target = 8
//    Output: [[2,2,2,2],[2,3,3],[3,5]]
//    Input: candidates = [2], target = 1
//    Output: []
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> currentCombination, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }
        if (target < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            currentCombination.add(candidates[i]);
            // Recursively call with reduced target and current index (as we can reuse the same element)
            backtrack(candidates, target - candidates[i], i, currentCombination, result);
            // Backtrack: remove the last element and try the next candidate
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
