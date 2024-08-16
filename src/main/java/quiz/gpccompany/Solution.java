package quiz.gpccompany;

import java.util.ArrayList;
import java.util.List;

//calculate sum of all multiples of number from List for each number
public class Solution {

    public List<Long> calculate(List<Integer> list){
        long startTime = System.currentTimeMillis();
        List<Long> result = new ArrayList<>();
        Long currentSum = 1L;
        for(int i = 0; i < list.size(); i ++){
            Integer temp = list.get(i);
            for(int j = 2; j <= temp/2; j++){
                if(temp % j == 0){
                    currentSum = currentSum + j;
                }
            }
            currentSum = currentSum + temp;
            result.add(currentSum);
            currentSum = 1L;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Start time in ms " + startTime);
        System.out.println("End time in ms " + endTime );
        System.out.println("Duration in ms " + (endTime - startTime));
        return result;
    }
}
