package textProcessing;

import java.util.Scanner;

public class Substring
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String partToRemove = sc.nextLine();
        String wholePhrase = sc.nextLine();
        String result = wholePhrase;
        while(result.contains(partToRemove)){

            result= result.replace(partToRemove,"");
        }
        System.out.println(result);
    }
}
