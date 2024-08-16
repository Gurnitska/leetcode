package algorithms.medium;
public class PalindromicSubstring {

    //Given a string s, return the longest
    //palindromic
    //
    //substring
    // in s.
    public String longestPalindrome(String s) {
        int length = s.length();
        StringBuilder longestPalindrome = new StringBuilder(String.valueOf(s.charAt(0)));
        boolean isDefaultPalindrome = true;
        for(int i = 0; i < length; i++){
            if (s.charAt(0) != s.charAt(i)) {
                isDefaultPalindrome = false;
                break;
            }
        }
        if(isDefaultPalindrome){
            longestPalindrome = new StringBuilder(s);
            return longestPalindrome.toString();
        }
        for(int i = 0; i < length; i++){
            for(int j = i; j <= length; j++){
                StringBuilder temp = new StringBuilder(s.substring(i, j));
                boolean flag = false;
                for (int k = 0; k < temp.length()/2; k++){
                    flag = temp.charAt(k) == temp.charAt(temp.length() - 1 - k);
                    if(!flag){
                        break;
                    }
                }
                if(flag){
                    if(longestPalindrome.length() <= temp.length()){
                        longestPalindrome = temp;
                    }
                }

            }
        }
        return longestPalindrome.toString();
    }
}