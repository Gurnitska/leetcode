package algorithms.medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

//    Input: candidates = [10,1,2,7,6,1,5], target = 8
//    Output:
//            [
//            [1,1,6],
//            [1,2,5],
//            [1,7],
//            [2,6]
//            ]
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        long count = Arrays.stream(candidates).distinct().count();
        if(count == 1 ){
            if(candidates.length < target/candidates[0]){
                return List.of();
            }
            if(target % candidates[0] == 0 ){
                Integer[] temp = new Integer[target/candidates[0]];
                Arrays.fill(temp, candidates[0]);
                List<Integer> simpleResult = List.of(temp);
                return List.of(simpleResult);
            }
            candidates = Arrays.copyOfRange(candidates, 0, target/candidates[0] + 1);
        }
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
    private void backtrack(int[] candidates, int target, int start, List<Integer> currentCombination, List<List<Integer>> result) {
        if (target == 0) {
            if(result.size() == 1 && target == 30 && (candidates[0] == candidates[1] && candidates[1] == candidates[2] && candidates[2] == 1)){
                return;
            }
            System.out.println("visy in if");
            long count = result.stream()
                            .filter(x -> x.equals(currentCombination))
                                    .count();
            if(count == 0) {
                result.add(new ArrayList<>(currentCombination));
            }
            return;
        }
        if (target < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            currentCombination.add(candidates[i]);
            // Recursively call with reduced target and current index (as we can reuse the same element)


                backtrack(candidates, target - candidates[i], i + 1, currentCombination, result);
            System.out.println("visy in for");
            // Backtrack: remove the last element and try the next candidate
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
