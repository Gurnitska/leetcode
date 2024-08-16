package algorithms.easy;

public class StringPalindrome {

    public boolean isPalindrome(String palindrome){
        boolean isPalindrome = true;
        if(!palindrome.isEmpty()) {
            for (int i = 0, j = palindrome.length() - 1; i < j; i++, j--) {
                if (palindrome.charAt(i) != palindrome.charAt(j)) {
                    isPalindrome = false;
                    break;
                }
            }
        }
        return isPalindrome;
    }

}
