package algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.TreeSet;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        char[] letters = s.toCharArray();
        List<String> substrings = new ArrayList<>();
        Set<Character> substring = new LinkedHashSet<>();
        for(int i=0; i< letters.length; i++){
            boolean isNotExist = substring.add(letters[i]);
            if(!isNotExist){
                String tempString = fromSetToString(substring);
                substrings.add(tempString);
                int index = tempString.indexOf(letters[i]);
                tempString = tempString.substring(index + 1, tempString.length());
                substring.clear();
                if(tempString.length() > 0) {
                    Arrays.stream(tempString.split("")).forEach(a -> substring.add(a.charAt(0)));
                }
                substring.add(letters[i]);
            }
        }
        String tempString = letters.length != 0 ? fromSetToString(substring) : "";
        if(letters.length != 0 && substring.size() > 0 && !substrings.contains(tempString)){
            substrings.add(tempString);
        }
        int size = 0;

        for(String subst : substrings){
            if(size < subst.length()){
                size = subst.length();
            }
        }
        return size;
    }
    private String fromSetToString(Set<Character> substring){
        return substring.toString().substring(1, 3 * substring.size() - 1)
                        .replaceAll(", ", "");
    }

//а вот так надо было
    public int lengthOfLongestSubstring_ideal(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            while(!set.add(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
