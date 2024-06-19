import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> contakt = new HashMap<>();

    public void addContact(String lastName, String phoneNumber) {
        if (contakt.get(lastName) != null) {
            if (contakt.get(lastName).contains(phoneNumber) != true) {
                contakt.get(lastName).add(phoneNumber);
            }
        } else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            contakt.put(lastName, numbers);
        }
    }

    public void getContact(String lastName) {
        System.out.println("Имя:" + lastName + ", контактный телефон:" + contakt.get(lastName));
    }
}