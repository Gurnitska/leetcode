package algorithms.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        //proper way - use value of numbers as indexes in the boolean array
        boolean isValid = true;
        for (int i = 0; i < 9;i ++){
            //check horizontal
            int [] horizontal = new int[9];
            for(int j = 0; j < 9; j ++){
                if(board[i][j] != '.') {
                    horizontal[j] = Integer.parseInt(String.valueOf(board[i][j]));
                }
            }

            Set<Integer> horizontalNumbers = new HashSet<>();

            for (int number : horizontal) {
                // If adding an element returns false, it's a duplicate
                if (number != 0 && !horizontalNumbers.add(number) ) {
                    isValid = false;
                    System.out.println("Duplicate found: " + number);
                    return isValid;
                }
            }
            //check vertical
            int[] vertical = new int[9];
            for(int j = 0; j < 9; j ++){
                if(board[j][i] != '.') {
                    vertical[j] = Integer.parseInt(String.valueOf(board[j][i]));
                }
            }
            Set<Integer> verticalNumbers = new HashSet<>();

            for (int number : vertical) {
                // If adding an element returns false, it's a duplicate
                if (number != 0 && !verticalNumbers.add(number)) {
                    isValid = false;
                    System.out.println("Duplicate found: " + number);
                    return isValid;
                }
            }



        }
        //check 3x3 box
        for (int i = 0; i < 9;) {
            for(int j = 0; j < 9;){
                Set<Integer> box = new HashSet<>();
                char[] charBox =  new char[]{board[i][j],board[i][j + 1],board[i][j + 2],
                        board[i + 1][j],board[i + 1][j + 1],board[i + 1][j + 2],
                        board[i + 2][j],board[i + 2][j + 1],board[i + 2][j + 2]};
                for (char number : charBox) {
                    if(number != '.') {
                        int tempnumber = Integer.parseInt(String.valueOf(number));
                        // If adding an element returns false, it's a duplicate
                        if (tempnumber != 0 && !box.add(tempnumber)) {
                            isValid = false;
                            System.out.println("Duplicate found: " + number);
                            return isValid;
                        }
                    }
                }
                j = j + 3;
            }
            i = i + 3;
        }
        return isValid;
    }
}
