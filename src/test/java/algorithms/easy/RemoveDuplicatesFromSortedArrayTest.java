package algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void test1(){
        int[] nums = new int[]{1,1,2};
        int number = 2;
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int expectedNumber = removeDuplicatesFromSortedArray.removeDuplicates(nums);

        assertEquals(number, expectedNumber);
    }

    @Test
    public void test2(){
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int number = 5;
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int expectedNumber = removeDuplicatesFromSortedArray.removeDuplicates(nums);

        assertEquals(number, expectedNumber);
    }

}