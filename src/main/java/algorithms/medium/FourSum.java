package algorithms.medium;

import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new LinkedHashSet<>();
        if(target < 0 && nums[0] > 0){
            return List.copyOf(result);
        }
        for(int m = 0; m < nums.length - 3; m ++) {
            int tempTarget = target - nums[m];
            for (int i = m + 1; i < nums.length - 2; i++) {
                int j = i + 1, k = nums.length - 1;
                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == tempTarget) {
                        result.add(Arrays.asList(nums[m], nums[i], nums[j], nums[k]));
                        j++;
                        k--;
                    }
                    if (sum < tempTarget) {
                        j++;
                    }
                    if (sum > tempTarget){
                        k--;
                    }
                }
            }

        }
        return List.copyOf(result);
    }
}
