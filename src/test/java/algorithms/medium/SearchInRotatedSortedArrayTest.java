package algorithms.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInRotatedSortedArrayTest {

    @Test
    public void testSearchInRotatedSortedArray() {
        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int expected = 4;
        int result = searchInRotatedSortedArray.search(nums, target);
        assertEquals(expected, result);
    }
}