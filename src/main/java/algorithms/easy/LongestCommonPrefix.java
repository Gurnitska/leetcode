package algorithms.easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder commonPr = new StringBuilder("");
        for(int i = 0; i < strs[0].length(); i ++){//номер буквы
            char cur = strs[0].charAt(i);
            boolean flag = true;
            for(int j = 0; j < strs.length; j++){//номер элемента
                if(strs[j].length()- 1 < i || cur != strs[j].charAt(i)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                commonPr.append(cur);
            }else{
                break;
            }
        }
        return commonPr.toString();
    }
}
