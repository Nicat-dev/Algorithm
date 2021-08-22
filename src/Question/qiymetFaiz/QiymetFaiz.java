package Question.qiymetFaiz;

import java.util.Scanner;

public class QiymetFaiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long qiymet = scanner.nextLong();
    }
    public static Long say(Long qiymet){
        Long ilkdeyer = qiymet;
        Long netice = ilkdeyer%100*18;
        qiymet = ilkdeyer+qiymet;
        return qiymet;
    }
}
