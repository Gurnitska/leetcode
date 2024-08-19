package algorithms.medium;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        int result = 0;
        boolean isResultPositive = (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0);
        if(divisor == 1){
            return dividend;
        }else if(divisor == -1){
            if(dividend == Integer.MIN_VALUE){
                return Integer.MAX_VALUE;
            }
            return -dividend;
        }
        if(divisor == Integer.MIN_VALUE){
            if(dividend != Integer.MIN_VALUE) {
                return 0;
            } else {
                return 1;
            }
        }
        divisor = Math.abs(divisor);
        if(dividend == Integer.MIN_VALUE){
            dividend = dividend + divisor;
            result++;
        }

        dividend = Math.abs(dividend);
        while(dividend >= divisor){
            result++;
            dividend = dividend - divisor;
        }
        if(!isResultPositive){
           result = result * (-1);
        }
        return result;
    }
}
