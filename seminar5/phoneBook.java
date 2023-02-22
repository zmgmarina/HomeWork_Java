package seminar5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.

public class phoneBook {
    

    public static void main(String[] args) {
        Map <String, List> phoneBook = new HashMap<>();

        phoneBook.put("Иванов Сергей", Arrays.asList("8958434175", "8954735444", "8956235454"));
        phoneBook.put("Орлов Сергей", Arrays.asList("8745198544", "8745363144"));
        phoneBook.put("Петрова Ирина", Arrays.asList("8954184546", "8952035444"));
        
        printContact(phoneBook);
    }

    private static void printContact(Map<String, List> map){
        for (Map.Entry<String,List> pair : map.entrySet()) {
            System.out.println(pair.getKey()+ " " + pair.getValue());
        }
    }
}
