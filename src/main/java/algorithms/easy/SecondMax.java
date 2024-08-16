package algorithms.easy;

public class SecondMax {
    public int findSecondMax(int[] numbers){
        int firstMax = 0,
          secondMax = 0;
        for(int i = 0; i < numbers.length; i ++){
            if(firstMax < numbers[i]){
                secondMax = firstMax;
                firstMax = numbers[i];
            }
        }
        return secondMax;
    }

}
