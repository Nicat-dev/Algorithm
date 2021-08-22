package Question.Qiymetlendireme;

import java.util.Scanner;

//Girilen vize ve final notlarına göre öğrencinin dersten geçip geçmediğini bulan algoritma
public class Qiymet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("daxil edin : ");
        say(scanner.nextInt());
    }

    public static void say(int a){
        if (a>90){
            System.out.println("A aldiniz");
        }else if ((91>a) & (a>80)){
            System.out.println("B aldiniz");
        }else if ((81>a) & (a>70)){
            System.out.println("C aldiniz");
        }else if ((71>a) & (a>61)){
            System.out.println("D aldiniz");
        }else if ((61>a) & (a>50)){
            System.out.println("E aldiniz");
        }else {
            System.out.println("F aldiniz (kesildiniz)");
        }
    }

}
