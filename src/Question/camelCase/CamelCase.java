package Question.camelCase;

import java.io.*;
import java.util.*;

class Result {


    public static int camelcase(String s) {
        // Write your code here
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            String str = String.valueOf(s.charAt(i));
            if (str.equals(str.toUpperCase())) {
                count++;
            }
        }
        return count;
    }
}


class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(Result.camelcase(word));
    }
}
