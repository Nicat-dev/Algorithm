package Question.ortancilEded;

import java.util.Random;
import java.util.Scanner;

public class OrtaEded {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("daxil edin : ");
        say(scanner.nextInt());
    }
    public static void say(int count){
        Random random = new Random();
        int arr[] = new int[count];

        for (int i = 0; i <count; i++) {
            arr[i] = random.nextInt(10);
            System.out.println(" "+arr[i]);
        }
        System.out.println("netice : "+arr[count/2-1]);
    }

}