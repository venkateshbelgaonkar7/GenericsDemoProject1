package hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap<>(4, 0.70f, true);
        phonebook.put("Ram", 212);
        phonebook.put("shyam", 112);
        phonebook.put("rocky", 990);
        phonebook.put("kala", 121);
        System.out.println("Ram's number: "+phonebook.get("Ram"));

        System.out.println("\nList of contacts in phonebook: ");

        for(Map.Entry<String, Integer> entry: phonebook.entrySet()) {
            System.out.println(entry.getKey() + ": "+entry.getValue());
        }
    }
}
