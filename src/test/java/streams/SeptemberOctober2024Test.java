package streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SeptemberOctober2024Test {

    @Test
    public void test(){
        SeptemberOctober2024 septOct = new SeptemberOctober2024();
        int[] array = new int[]{1,2,3,3,4,5,6};
        int sum = septOct.sumOfOdd(array);
        assertEquals(12, sum);
    }

    @Test
    public void test2(){
        SeptemberOctober2024 septOct = new SeptemberOctober2024();
        int[] array = new int[]{1,2,3,3,4,5,6};
        long count = septOct.calculateAppearence(array, 3);
        assertEquals(2, count);
    }

    @Test
    public void test3(){
        SeptemberOctober2024 septOct = new SeptemberOctober2024();
        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Andrew");
        List<String> result = septOct.aNames(names);
        assertEquals(Arrays.asList("Alice", "Andrew","Anna"), result);
    }
    @Test
    public void test4(){
        SeptemberOctober2024 septOct = new SeptemberOctober2024();
        List<String> result = septOct.convertToNames();
        assertEquals(Arrays.asList("Alice", "Bob", "Charlie"), result);
    }

    @Test
    public void testsumStringLength(){
        SeptemberOctober2024 septOct = new SeptemberOctober2024();
        List<String> words = Arrays.asList("Java", "Stream", "API", "Task");
        int result = septOct.sumStringLength(words);
        assertEquals(17, result);
    }

    @Test
    public void testgroupByName(){
        SeptemberOctober2024 septOct = new SeptemberOctober2024();
        List<String> cities = Arrays.asList("Amsterdam", "Berlin", "Athens", "Barcelona", "Boston");
        Map<Character, List<String>> result= septOct.groupByName(cities);
        Map<Character, List<String>> expected = new HashMap<>();
        expected.put('A', List.of("Amsterdam", "Athens"));
        expected.put('B', List.of("Berlin", "Barcelona", "Boston"));
        assertEquals(expected, result);
    }

    @Test
    public void testJoining(){
        SeptemberOctober2024 septemberOctober2024 = new SeptemberOctober2024();
        String result = septemberOctober2024.joinElements();
        assertEquals("apple, banana, cherry", result);
    }

    @Test
    public void testcheckNegative(){
        SeptemberOctober2024 septemberOctober2024 = new SeptemberOctober2024();
        List<Integer> otherNumbers = Arrays.asList(1, -2, 3, 4, 5);
        boolean result = septemberOctober2024.chechNegative(otherNumbers);
        assertTrue(result);
    }

    @Test
    public void testConvert(){
        SeptemberOctober2024 septemberOctober2024 = new SeptemberOctober2024();
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] result = septemberOctober2024.convertArray(array);
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9}, result);
    }
}