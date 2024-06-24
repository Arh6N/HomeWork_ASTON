import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, String> contakt = new HashMap<>();

    public void addContact(String lastName, String phoneNumber) {
        if (!contakt.containsKey(phoneNumber)) {
            contakt.put(phoneNumber, lastName);
        }
    }

    public void getContact(String lastName) {
        ArrayList<String> keys = new ArrayList<>();
        contakt.forEach((k, val) -> {
            if (val.equals(lastName)) {
                keys.add(k);
            }
        });
        System.out.println("Имя:" + lastName + " Контактный телефон:" + keys);
    }
}