package seminar5;


import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;


// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу, которая найдет и выведет повторяющиеся имена
//с количеством повторений. Отсортировать по убыванию популярности.


public class findPrintRepeat {
    
    public static void main(String[] args) {
        List<String> listName = Arrays.asList("Антон","Иван", "Петр", "Антон", "Антон","Сергей", "Петр", "Петр");
                
        Map <String, Integer> map = new LinkedHashMap<>();
        
        
        for (int i = 0; i < listName.size(); i++) {
            
            if (map.containsKey(listName.get(i))) {
                map.put(listName.get(i), map.get(listName.get(i))+1);
            } 
            else {
                map.put(listName.get(i), 1);
            }
        }
        System.out.println(map);

        
        
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }

    
}
