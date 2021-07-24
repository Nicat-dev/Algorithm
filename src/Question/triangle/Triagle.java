package Question.triangle;

import java.util.Scanner;

public class Triagle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("uzunluqu daxil edin : ");
        int uzunluq = scanner.nextInt();
        for (int setir = 0; setir <uzunluq; setir++) {
            System.out.print("");
            for (int sutun = 0; sutun < setir; sutun++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
