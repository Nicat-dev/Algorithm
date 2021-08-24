package Question.arrayQuestion;

import java.util.Scanner;

public class ArrayQuestion {
    public static int minSizeStr(String[] strs) {
        int min = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (min > strs[i].length()) {
                min = strs[i].length();
            }
        }
        return min;
    }

    public static String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        int minSize = minSizeStr(strs);
        if (len == 1) return strs[0];

        StringBuilder response = new StringBuilder();
        int counter = 0;
        boolean isEquals = true;

        while (minSize > counter
                && isEquals) {
            if (strs[0].equals("")) {
                return response.toString();
            }
            char tmp = strs[0].charAt(counter);

            for (int j = 1; j < len; j++) {
                if (strs[j].equals("")) {
                    return response.toString();
                }
                if (tmp == strs[j].charAt(counter)) {
                    isEquals = true;
                } else {
                    isEquals = false;
                    break;
                }
            }
            if (isEquals) {
                response.append(tmp);
                counter++;
            }
        }
        return response.toString();
    }
}
