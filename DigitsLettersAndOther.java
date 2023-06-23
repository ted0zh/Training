package textProcessing;

import java.util.Scanner;

public class DigitsLettersAndOther
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String word = sc.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder symbols = new StringBuilder();
        StringBuilder letters = new StringBuilder();

        for (char symbol:word.toCharArray()) {
            if(Character.isDigit(symbol)){
                digits.append(symbol);
            }else if(Character.isLetter(symbol)){
                letters.append(symbol);
            }else{
                symbols.append(symbol);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);

    }
}
