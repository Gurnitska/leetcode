package algorithms.medium;

import java.util.Arrays;

public class ZigzagConvertion {
    public String convert(String s, int numRows) {
        int step = numRows + numRows - 2;
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i ++){
            rows[i] = new StringBuilder();
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length() && step > 0; i = i + step){
            for(int j = 0; j < numRows; j++){
                if((i+ j ) < s.length()) {
                    rows[j].append(s.charAt(i + j));
                }else{ 
                    break;
                }
            }
            for(int j = numRows - 2; j > 0; j--){
                int index = i + numRows + (numRows - j - 2);
                if(index < s.length()) {
                    rows[j].append(s.charAt(index));
                } else{
                    break;
                }
            }
        }
        if (numRows > 1) {
            Arrays.stream(rows).forEach(result::append);
        } else {
            result.append(s);
        }
        return result.toString();
    }
}
