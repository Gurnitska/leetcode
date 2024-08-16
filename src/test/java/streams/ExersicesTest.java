package streams;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExersicesTest {

    @Test
    public void averageTest(){
        double result = Exersices.calculateAverage(List.of(5,4,9,3));
        assertEquals(5.25, result);
    }

    @Test
    public void upperCaseTest(){
        List<String> result = Exersices.toUpperCase(List.of("mama", "papa"));
        assertEquals("MAMA", result.get(0));
    }

    @Test
    public void oddSumTest(){
        double result = Exersices.oddSum(List.of(5,4,9,3));
        assertEquals(4, result);
    }

    @Test
    public void removeDuplicateTest(){
        List<Integer> result = Exersices.removeDuplicate(List.of(5,4,9,5,4,4,4,4,9,3,3));
        Collections.sort(result);
        List<Integer> expected = List.of(3,4,5,9);
        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void merge2ArraysTest(){
        int[] firstArray = new int[]{1,3,6};
        int[] secondArray = new int[]{2,4,5};
        int[] result = Exersices.merge2Arrays(firstArray, secondArray);
        int[] expected = new int[]{1,2,3,4,5,6};
        assertArrayEquals(expected, result);
    }
    @Test
    public void merge2ArraysStreamsTest(){
        int[] firstArray = new int[]{1,3,6};
        int[] secondArray = new int[]{2,4,5};
        int[] result = Exersices.merge2ArraysStreams(firstArray, secondArray);
        int[] expected = new int[]{1,2,3,4,5,6};
        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateOccurencesTest(){
        Map<Integer, Long> results = Exersices.calculateOccurences(new int[]{1,1,2,2,3,2,4,5,6,7,2,7,8});
        assertEquals(1, results.get(3));
     }
}
