package algorithms.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    public void test1(){
        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        RemoveElement removeElement = new RemoveElement();
        int expectedNumber = removeElement.removeElement(nums, val);
        assertEquals(2, expectedNumber);
    }

}