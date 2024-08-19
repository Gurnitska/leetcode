package algorithms.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivideTwoIntegersTest {
    @Test
    void test1() {
        DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();
        int quotient = divideTwoIntegers.divide(10, 3);

        assertEquals(3, quotient);
    }
    @Test
    void test2() {
        DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();
        int quotient = divideTwoIntegers.divide(7, -3);

        assertEquals(-2, quotient);
    }

    @Test
    void test3() {
        DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();
        int quotient = divideTwoIntegers.divide(-2147483648, -1);

        assertEquals(2147483647, quotient);
    }

    @Test
    void test4() {
        DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();
        int quotient = divideTwoIntegers.divide(-2147483648, 1);

        assertEquals(-2147483648, quotient);
    }
    @Test
    void test5() {
        DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();
        int quotient = divideTwoIntegers.divide(-1010369383, -2147483648);

        assertEquals(0, quotient);
    }
}