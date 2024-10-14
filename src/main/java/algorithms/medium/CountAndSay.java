package algorithms.medium;

import java.util.LinkedHashMap;
import java.util.stream.Stream;

public class CountAndSay {
    public String countAndSay(int n) {
        StringBuilder result = new StringBuilder();
        char temp = '1';
        for(int i = 1; i < n + 1; i ++){
            int count = 1;
            StringBuilder finalResult = new StringBuilder();
            if(result.length() > 1) {
                temp = result.charAt(0);
                for (int j = 1; j < result.length(); j++) {

                    if (temp == result.charAt(j)) {
                        count++;
                    } else{
                        finalResult.append(count).append(temp);
                        temp = result.charAt(j);
                        count = 1;
                    }
                    if(j == result.length() - 1){
                        finalResult.append(count).append(temp);
                    }
                }
            }else{
                if(result.length() == 1){
                    finalResult.append(count).append(temp);
                }
                if(result.isEmpty()){
                    finalResult.append(temp);
                }

            }
            result = finalResult;
        }
        return result.toString();
    }
}
