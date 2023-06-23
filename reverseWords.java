package textProcessing;

import java.util.Scanner;

public class reverseWords
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while(!input.equals("end")){
            System.out.printf("%s = %s\n",input,reverseWord(input));
            input=sc.nextLine();
        }

    }

    private static String reverseWord(String input) {
        StringBuilder reverseWord = new StringBuilder();
        reverseWord.append(input);
        reverseWord.reverse();

        return reverseWord.toString();
    }
}
