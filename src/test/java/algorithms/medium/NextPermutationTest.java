package algorithms.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextPermutationTest {

    @Test
    public void testNextPermutation() {
        NextPermutation np = new NextPermutation();
        int[] nums = {1, 2, 3};
        np.nextPermutation(nums);
        assertArrayEquals(new int[]{1, 3, 2}, nums);
    }

    @Test
    public void testNextPermutation2() {
        NextPermutation np = new NextPermutation();
        int[] nums = {3,2,1};
        np.nextPermutation(nums);
        assertArrayEquals(new int[]{1,2,3}, nums);
    }
    @Test
    public void testNextPermutation3() {
        NextPermutation np = new NextPermutation();
        int[] nums = {1,1,5};
        np.nextPermutation(nums);
        assertArrayEquals(new int[]{1,5,1}, nums);
    }

    @Test
    public void testNextPermutation4() {
        NextPermutation np = new NextPermutation();
        int[] nums = {1,4,5,2};
        np.nextPermutation(nums);
        assertArrayEquals(new int[]{1,5,2,4}, nums);
    }

}