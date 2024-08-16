package algorithms.medium;


import org.junit.jupiter.api.Test;

public class LongestSubstringTest {

    @Test
    public void test1(){
        String s = "pwwkew";
        LongestSubstring longestSubstring = new LongestSubstring();
        longestSubstring.lengthOfLongestSubstring(s);
    }

    @Test
    public void test2(){
        String s = "dvdf";
        LongestSubstring longestSubstring = new LongestSubstring();
        longestSubstring.lengthOfLongestSubstring(s);
    }

    @Test
    public void test3(){
        String s = "";
        LongestSubstring longestSubstring = new LongestSubstring();
        longestSubstring.lengthOfLongestSubstring(s);
    }


    @Test
    public void test4(){
        String s = "ckilbkd";
        LongestSubstring longestSubstring = new LongestSubstring();
        longestSubstring.lengthOfLongestSubstring(s);
    }
}
