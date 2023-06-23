package textProcessing;

import java.util.Scanner;

public class TextFilter
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] bannedWords = sc.nextLine().split(", ");
        String text = sc.nextLine();
        for (String ban : bannedWords){
            if(text.contains(ban)){
                text=text.replace(ban,astreix(ban));
            }
        }
        System.out.println(text);
    }
    public static String astreix(String word){
        StringBuilder replacement = new StringBuilder();
        int length = word.length();
        for (int i = 0; i < length; i++) {
            replacement.append("*");
        }

        return replacement.toString();
    }

}
