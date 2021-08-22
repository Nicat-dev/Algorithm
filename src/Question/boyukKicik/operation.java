package Question.boyukKicik;

//Birbirinden farklı olarak verilen iki adet sayıdan, büyük olanı bulup gösteren algoritma

import java.util.Scanner;

public class operation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a ededini daxil edin : ");
        int a = scanner.nextInt();
        System.out.print("b ededini daxil edin : ");
        int b = scanner.nextInt();
        say(a,b);
    }

    public static void say(int a, int b){
        if (a>b){
            System.out.println(a+" boyukdur");
        }else if (a<b){
            System.out.println(b+" boyukdur");
        }else {
            System.out.println("beraberdir");
        }
    }
}
