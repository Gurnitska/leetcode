package algorithms.easy;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongestCommonPrefixTest {

    @Test
    public void test1(){
        String[] strs = new String[]{"flower","flow","flight"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String result = longestCommonPrefix.longestCommonPrefix(strs);

        assertEquals("fl", result);
    }

    @Test
    public void test2(){
        String[] strs = new String[]{"dog","racecar","car"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String result = longestCommonPrefix.longestCommonPrefix(strs);

        assertEquals("", result);
    }

    @Test
    public void test3(){
        String[] strs = new String[]{"dog"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String result = longestCommonPrefix.longestCommonPrefix(strs);

        assertEquals("dog", result);
    }

    //["ab", "a"]
    @Test
    public void test4(){
        String[] strs = new String[]{"ab", "a"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String result = longestCommonPrefix.longestCommonPrefix(strs);

        assertEquals("a", result);
    }
}
