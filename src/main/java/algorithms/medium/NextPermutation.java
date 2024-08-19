package algorithms.medium;

public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int firstIndex = -1;
        int secondIndex = -1;
        for(int i = nums.length - 1; i > 0; i--){
            if(nums[i] > nums[i - 1]){
                firstIndex = i - 1;
                break;
            }
        }
        if(firstIndex > -1) {
            for (int i = nums.length - 1; i > firstIndex; i--) {
                if (nums[firstIndex] < nums[i]) {
                    secondIndex = i;
                    int temp = nums[firstIndex];
                    nums[firstIndex] = nums[secondIndex];
                    nums[secondIndex] = temp;
                    for (int j = firstIndex + 1, k = nums.length - 1; j < k; j++, k--) {
                        temp = nums[j];
                        nums[j] = nums[k];
                        nums[k] = temp;
                    }
                    break;
                }
            }
        }else{
            for (int j = 0, k = nums.length - 1; j < k; j++, k--) {
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
            }
        }
    }
}
