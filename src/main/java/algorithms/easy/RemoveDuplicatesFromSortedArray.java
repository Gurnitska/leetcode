package algorithms.easy;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int[] resultNums = new int[nums.length];
        int currectNumber = 1;
        if(nums.length > 0){
            int tempValue = nums[0];
            resultNums[0] = nums[0];
            for(int i=1; i < nums.length; i ++){
                if(tempValue != nums[i]){
                    currectNumber++;
                    tempValue = nums[i];
                    resultNums[currectNumber-1] = nums[i];
                    nums[currectNumber-1] = nums[i];
                }
            }
            nums = resultNums;
            return currectNumber;
        }
        return 0;
//        return removeDuplicates2(nums);
    }

    private int removeDuplicates2(int[] nums){
        return (int)Arrays.stream(nums).distinct().count();
    }
}
