package seminar3;

import java.util.Arrays;
import java.util.List;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

public class maxMinAverage {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(10, 2, 3, 3, 3, 4);        
        
        int min = numbersList.get(0);
        int max = numbersList.get(0);
        for (Integer i: numbersList) {
            if(i < min) min = i; 
            if(i > max) max = i;
        }
        System.out.println("минимальное число: " + min);
        System.out.println("максимальное число: " + max);
        

        Integer sum = 0;
        if(!numbersList.isEmpty()) {
            for (Integer num : numbersList) {
                sum += num;
            }
        }
        double value  =  sum.doubleValue() / numbersList.size();
        System.out.printf("среднее арифметическое: %.2f", value);
            
    }
        
}
