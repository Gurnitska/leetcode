package algorithms.easy;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int counter = 0;
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                nums[i] = -1;
            }else{
                nums[counter] = nums[i];
                counter++;
            }
        }
        nums = result;
        return counter;
    }
}
