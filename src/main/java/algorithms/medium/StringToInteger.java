package algorithms.medium;

public class StringToInteger {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.isEmpty()){
            return 0;
        }
        StringBuilder result = new StringBuilder();
        boolean isNegative = false;
        int index = 0;
        if(s.charAt(0) == '-'){
            isNegative = true;
            index++;
        }else if(s.charAt(0) == '+'){
            index++;
        }
        while( index < s.length()){
            char ch = s.charAt(index);
            if(Character.isDigit(ch)){
                result.append(ch);
            }else{
                break;
            }
            index++;
        }
        int intResult = 0;

        if(!result.isEmpty()){
            String tempres = result.toString().replaceFirst("^0+(?!$)", "");
            intResult = parseInt(tempres, isNegative);
        }
        return intResult;
    }

    private int parseInt(String s, boolean isNegative){
        int result;
        if(s.length() > 10 || Integer.MAX_VALUE < Long.parseLong(s) ){
            result = isNegative ? Integer.MIN_VALUE: Integer.MAX_VALUE;
        }else{
            result = isNegative ? -Integer.parseInt(s): Integer.parseInt(s);

        }

        return result;
    }
}
