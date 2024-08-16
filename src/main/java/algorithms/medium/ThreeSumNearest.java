package algorithms.medium;

import java.util.Arrays;

public class ThreeSumNearest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int nearest = nums[0] + nums[1] + nums[2];
        int diff = Math.abs(target - nearest);
        for(int i = 0; i < nums.length; i ++){
            int j = i + 1, k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                int tempDiff = Math.abs(target - sum);

                if(sum < target){
                    j++;
                }else {
                    k--;
                }
                if(tempDiff <= diff){
                    nearest = sum;
                    diff = tempDiff;
                }
            }
        }
        return nearest;
    }
}
