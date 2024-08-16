package algorithms.easy;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidParentthesesTest {

    @Test
    public void test1(){
        String s = "()";
        boolean result = new ValidParentheses().isValid(s);
        assertTrue(result);
    }

    @Test
    public void test2(){
        String s = "()[]{}";
        boolean result = new ValidParentheses().isValid(s);
        assertTrue(result);
    }

    @Test
    public void test3(){
        String s = "(]";
        boolean result = new ValidParentheses().isValid(s);
        assertFalse(result);
    }

    //([)]
    @Test
    public void test4(){
        String s = "([)]";
        boolean result = new ValidParentheses().isValid(s);
        assertFalse(result);
    }

    @Test
    public void test5(){
        String s = "{[]}";
        boolean result = new ValidParentheses().isValid(s);
        assertTrue(result);
    }
}
