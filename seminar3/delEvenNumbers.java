package seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

public class delEvenNumbers {
    public static void main(String[] args) {

        List <Integer> numbersList  = Arrays.asList(10, 15, 4, 36, 13, 0, 3); 
        List <Integer> resList = new ArrayList<>();
        

        for (int num : numbersList) {
           
            if (num % 2 != 0) {
                resList.add(num);
                
            }    
            
        }
        System.out.println(resList);

    }
            

    
}
