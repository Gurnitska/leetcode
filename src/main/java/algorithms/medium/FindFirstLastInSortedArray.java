package algorithms.medium;

public class FindFirstLastInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int tempLeft = -1, tempRight = -1;
        if(nums.length == 0){
            return new int[]{tempLeft, tempRight};
        }
        if(nums.length == 1){
            if(nums[0] == target){
                return new int[]{0,0};
            }else{
                return new int[]{tempLeft, tempRight};
            }
        }
        if(nums[0] > target && nums[nums.length -1] < target){
            return new int[]{tempLeft, tempRight};
        }
        int upLimit = nums.length - 1;
        int downLimit = 0;
        int temp;
        int targetIndex;
        while(upLimit >= downLimit){
            temp = downLimit + (upLimit - downLimit)/2;
            if(target == nums[temp]){
                targetIndex = temp;
                for(int j = targetIndex; j >= 0; j--){
                    if(nums[j] != target){
                        tempLeft = j + 1;
                        break;
                    }
                    if(j == 0 && nums[j] == target){
                        tempLeft = 0;
                    }
                }
                for(int j = targetIndex; j < nums.length; j++){
                    if(nums[j] != target){
                        tempRight = j - 1;
                        break;
                    }
                    if(j == nums.length -1  && nums[j] == target){
                        tempRight = nums.length - 1;
                    }
                }
                break;
            }
            if(target > nums[temp]){
                downLimit ++;
            }else{
                upLimit --;
            }
        }
        return new int[]{tempLeft, tempRight};
    }
}
