package Question.tuSum;

import java.util.Scanner;
//verdiyimiz reqemin arrayde 2 verilenin cemi edirse hemin reqemleri basqa bir arrayde capa vermek

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];
        int arr1[] = new int[2];
        for (int i = 0; i <arr.length; i++) {
            System.out.print("daxil et(array) : ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("daxil et : ");
        int target = scanner.nextInt();
        for (int i = 0; i <arr.length; i++) {
            for (int j = 1; j <arr.length; j++) {
                if (target == arr[i]+arr[j]) {
                    arr1[0] =arr[i];
                    arr1[1] = arr[j];
                }else {
                    j++;
                }
            }
        }
        System.out.println(arr1[0]+" "+arr[1]);
    }
}
