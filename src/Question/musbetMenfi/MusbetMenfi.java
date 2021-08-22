package Question.musbetMenfi;

import java.util.Scanner;

public class MusbetMenfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("daxil edin : ");
        int eded = scanner.nextInt();
        say(eded);
    }
    public static void say(int eded){
        if (eded>0){
            System.out.println(eded+" musbetdir");
        }if (eded==0){
            System.out.println(eded+" eded sıfıra beraberdir");
        }if (eded<0){
            System.out.println("eded menfidir");
        }
    }
}
