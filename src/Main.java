import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();
        words.addAll(Arrays.asList("one", "two", "three", "four", "six", "four", "five", "six", "six", "seven", "eight", "eight", "eight", "eight", "nine"));
        System.out.println("Исходный список:");
        words.forEach(System.out::println);

        System.out.println("\nКоличество повторений слова:");
        HashMap<String, Integer> wordsCount = new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            String s = words.get(i);
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        wordsCount.entrySet().forEach(System.out::println);
        System.out.println("\nУникальные слова: ");
        HashSet<String> unique = new HashSet<>(words);
        unique.forEach(System.out::println);
    }
}
