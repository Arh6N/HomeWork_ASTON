import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class WordsApp {
    public void wordsArr(ArrayList<String> words) {
        System.out.println("Исходный список:");
        words.forEach(System.out::println);
    }

    public void wordsCount(ArrayList<String> words) {
        System.out.println("\nКоличество повторений слова:");
        HashMap<String, Integer> wordsCount = new HashMap<>();
        for (String s : words) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        wordsCount.entrySet().forEach(System.out::println);
    }

    public void wordsUnique(ArrayList<String> words) {
        System.out.println("\nУникальные слова: ");
        HashSet<String> unique = new HashSet<>(words);
        unique.forEach(System.out::println);
    }

}
