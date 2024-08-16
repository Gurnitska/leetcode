package algorithms.easy;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondMaxTest {
    @Test
    public void test(){
        int[] numbers = {5,6,34,34,34,45,45,55,55};
        SecondMax secondMax = new SecondMax();
        int result = secondMax.findSecondMax(numbers);
        assertEquals(45, result);
    }
}
