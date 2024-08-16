package algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i ++){
            if((i > 0 && nums[i] != nums[i-1]) || i == 0) {
                int target = -nums[i];
                int j = i + 1, k = nums.length - 1;
                while (j < k) {

                    if(nums[j] + nums[k] == target) {
                        //nums[j] != nums[j-1] && ((k == nums.length - 1) || k < nums.length - 1 && nums[k] != nums[k + 1]) &&
                        if((k == nums.length - 1) || k < nums.length - 1 && nums[k] != nums[k + 1]) {
                            result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        }
                        j++;
                        k--;
                    } else {
                        if (nums[j] + nums[k] < target) {
                            j++;
                        } else {
                            k--;
                        }
                    }
                }
            }
        }
        return result;
    }
}
