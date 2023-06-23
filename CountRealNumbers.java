package Maps;

import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        TreeMap<Integer,Integer> occurrence = new TreeMap<>();
        for (Integer number: numbers) {
            if(!occurrence.containsKey(number)){
                occurrence.put(number,0);
            }
            occurrence.put(number, occurrence.get(number)+1);
        }
        for (Map.Entry<Integer, Integer> entry : occurrence.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
