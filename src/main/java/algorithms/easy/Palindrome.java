package algorithms.easy;

public class Palindrome {
    public boolean isPalindrome(int x) {
        int reverse = reverseInt(x);
        return reverse == x;
    }

    private int reverseInt (int x){
        int xa = 0;
        while (x % 10 > 0 || x >= 10){
            xa = xa * 10 + x % 10;
            x = x/10;
        }
        return xa;
    }
}
