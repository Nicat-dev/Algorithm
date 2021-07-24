package Question.Palindrom;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir reqem girin");
        int palindrom = scanner.nextInt();
        int ilkdeger = palindrom;
        int length = String.valueOf(palindrom).length();

        int kalan,deger=0;
        for (int i = 0; i<length; i++){

            kalan = palindrom % 10;
            deger = deger * 10 + kalan;
            palindrom = palindrom /10;
        }
        if(deger == ilkdeger) {
            System.out.println(deger + " palindrom sayidir.");
        }
        else {
            System.out.println(deger + " palindrom say değildir.");
        }
    }
}
