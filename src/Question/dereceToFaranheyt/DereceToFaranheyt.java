package Question.dereceToFaranheyt;

import java.util.Scanner;

public class DereceToFaranheyt {
    public static void main(String[] args) {
        double celcius,fahrenheit;
        Scanner oku=new Scanner(System.in);

        System.out.print("Derece cinsinden tempratur değerini daxil edin: ");
        celcius = oku.nextInt();
        fahrenheit = celcius * 1.8 + 32;
        System.out.println("Tepratur deyeri " +fahrenheit + " fahrenheittir.");
    }
}
