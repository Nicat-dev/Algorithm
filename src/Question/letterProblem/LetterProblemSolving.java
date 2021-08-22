package Question.letterProblem;

import java.util.Scanner;
import java.util.Stack;

//cumle ve ya soz daxil edirik aradaki bosluqu silerek palindrom olub olmadiqini yoxlayiriq

public class LetterProblemSolving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sentence : ");
        String sentence = scanner.nextLine();
        String operationWord = sentence(sentence);
        replator(operationWord);

    }
    public static String sentence(String sent){
        String soz = sent.toLowerCase().replaceAll("\\s","");
        return soz;
    }

    public static void replator(String sentence){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i <sentence.length(); i++) {
            stack.push(sentence.charAt(i));
        }

        String reverseString = "";
        while (!stack.isEmpty()){
            reverseString = reverseString +stack.pop();
        }

        if (sentence.equals(reverseString)){
            System.out.println("its palindrome");
            System.out.println(sentence);
        }else {
            System.out.println("its not palindrome");
            System.out.println(sentence);
        }
    }
}