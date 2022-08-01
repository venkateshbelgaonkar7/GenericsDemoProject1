package hashmap;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("jhon", 25588);
        phonebook.put("mike", 9980);    /* In a HashMap order of elements is not retained */
        phonebook.put("lucy", 1021);    /* because it is not indexed */
        phonebook.put("rose", 2456);
        phonebook.put("rose", 1111);
        phonebook.put(null, 000);  /*Allow null*/
        System.out.println(phonebook);

//        if (phonebook.containsValue(9980)) {
//            phonebook.remove(9980);
//        }

//        if (phonebook.containsKey("rose")) {
//            phonebook.remove("rose");
//        }
        System.out.println(phonebook);

    }
}
