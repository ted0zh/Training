package Maps;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int couples = Integer.parseInt(sc.nextLine());
        TreeMap<String, List<String>> synonymCouples = new TreeMap<>();
        for (int i = 0; i < couples; i++) {
            String word = sc.nextLine();
            String synonym = sc.nextLine();
           synonymCouples.putIfAbsent(word,new ArrayList<>());
           synonymCouples.get(word).add(synonym);

        }

    }
}
