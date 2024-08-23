package algorithms.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindFirstLastInSortedArrayTest {
    @Test
    public void test1(){
        FindFirstLastInSortedArray findFirstLastInSortedArray = new FindFirstLastInSortedArray();
        int[] result = findFirstLastInSortedArray.searchRange(new int[]{5,7,7,8,8,10}, 8);
        assertArrayEquals(new int[]{3,4}, result);
    }
    @Test
    public void test2(){
        FindFirstLastInSortedArray findFirstLastInSortedArray = new FindFirstLastInSortedArray();
        int[] result = findFirstLastInSortedArray.searchRange(new int[]{5,7,7,8,8,10}, 6);
        assertArrayEquals(new int[]{-1, -1}, result);
    }
    @Test
    public void test3(){
        FindFirstLastInSortedArray findFirstLastInSortedArray = new FindFirstLastInSortedArray();
        int[] result = findFirstLastInSortedArray.searchRange(new int[]{0}, 8);
        assertArrayEquals(new int[]{-1, -1}, result);
    }

    @Test
    public void test4(){
        FindFirstLastInSortedArray findFirstLastInSortedArray = new FindFirstLastInSortedArray();
        int[] result = findFirstLastInSortedArray.searchRange(new int[]{0}, 0);
        assertArrayEquals(new int[]{0, 0}, result);
    }
    @Test
    public void test5(){
        FindFirstLastInSortedArray findFirstLastInSortedArray = new FindFirstLastInSortedArray();
        int[] result = findFirstLastInSortedArray.searchRange(new int[]{2,2}, 3);
        assertArrayEquals(new int[]{-1, -1}, result);
    }
    @Test
    public void test6(){
        FindFirstLastInSortedArray findFirstLastInSortedArray = new FindFirstLastInSortedArray();
        int[] result = findFirstLastInSortedArray.searchRange(new int[]{2,2}, 2);
        assertArrayEquals(new int[]{0, 1}, result);
    }
    @Test
    public void test7(){
        FindFirstLastInSortedArray findFirstLastInSortedArray = new FindFirstLastInSortedArray();
        int[] result = findFirstLastInSortedArray.searchRange(new int[]{1,3}, 1);
        assertArrayEquals(new int[]{0, 0}, result);
    }
    @Test
    public void test8(){
        FindFirstLastInSortedArray findFirstLastInSortedArray = new FindFirstLastInSortedArray();
        int[] result = findFirstLastInSortedArray.searchRange(new int[]{1,4}, 4);
        assertArrayEquals(new int[]{1, 1}, result);
    }

}