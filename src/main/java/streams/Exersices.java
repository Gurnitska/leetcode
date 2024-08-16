package streams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exersices {
    // Write a Java program to calculate the average of a list of integers using streams.
    public static double calculateAverage(List<Integer> numbers){
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .average().orElse(0.0);
    }

   // Write a Java program to convert a list of strings to uppercase or lowercase using streams.
    public static List<String> toUpperCase(List<String> strings){
        return strings.stream()
                .map(String::toUpperCase)
                .toList();
    }

    //Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
    public static int oddSum(List<Integer> numbers){
        return numbers.stream()
                .filter(a -> a % 2 == 0  )
                .mapToInt(Integer::intValue)
                .sum();
    }

    //Write a Java program to remove all duplicate elements from a list using streams.
    public static List<Integer> removeDuplicate(List<Integer> numbers){
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static int[] merge2Arrays(int[] firstArray,int[] secondArray){
        int[] resultArray = new int[firstArray.length + secondArray.length];
        for(int i = 0, j = 0, k = 0; ; ){
            if(i == firstArray.length && j == secondArray.length){
                break;
            }
            if(i == firstArray.length && j < secondArray.length){
                resultArray[k] = secondArray[j];
                j++;
            }
            if(i < firstArray.length && j == secondArray.length){
                resultArray[k] = firstArray[i];
                i++;
            }
            if(i < firstArray.length && j < secondArray.length) {
                if (firstArray[i] > secondArray[j]) {
                    resultArray[k] = secondArray[j];
                    j++;
                } else {
                    resultArray[k] = firstArray[i];
                    i++;
                }
            }
            k++;
        }
        return resultArray;
    }

    public static int[] merge2ArraysStreams(int[] firstArray,int[] secondArray){
        return IntStream.concat(Arrays.stream(firstArray), Arrays.stream(secondArray))
                .sorted()
                .toArray();
    }

    public static Map<String, Integer> convertListToMap(List<String> strings){
        return strings.stream()
                .filter(s -> s.contains("a"))
                .collect(Collectors.toMap(s -> s, String::length));
    }

//    int[] input = new int[]{1,1,2,2,3,2,4,5,6,7,2,7,8};

    public static Map<Integer, Long> calculateOccurences(int[] inputArray) {
        return Arrays.stream(inputArray)
            .boxed()
            .collect(Collectors.groupingBy(i-> i, Collectors.counting()));

        //i -> i == Function.identity()
    }




    record Account(BigDecimal balance){}


}
