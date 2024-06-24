import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("one", "two", "three", "four", "six", "four", "five", "six", "six", "seven", "eight", "eight", "eight", "eight", "nine"));
        WordsApp wordsapp = new WordsApp();
        wordsapp.wordsArr(words);
        wordsapp.wordsCount(words);
        wordsapp.wordsUnique(words);
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Литвинов", "89217715246");
        phoneBook.addContact("Витвинов", "89217715246");
        phoneBook.addContact("Литвинов", "89211233212");
        phoneBook.getContact("Литвинов");
        phoneBook.getContact("Витвинов");
    }
}
