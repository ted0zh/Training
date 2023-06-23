package textProcessing;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        StringBuilder output = new StringBuilder();
        for (String word:input) {
            int length = word.length();
            output.append(word.repeat(length));
        }
        System.out.println(output);
    }
}
