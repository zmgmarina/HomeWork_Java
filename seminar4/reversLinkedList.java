package seminar4;

import java.util.Arrays;
import java.util.LinkedList;


//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

public class reversLinkedList {
    // public static int[] array; 
    public static void main(String[] args) {
                              
        LinkedList <Integer>  linList = new LinkedList<>();
        linList.add(5);
        linList.add(1);
        linList.add(3);
        linList.add(8);
        System.out.println(linList);

        System.out.println(reversLinkedList(linList));

            
        
    }
   
    private static LinkedList <Integer> reversLinkedList (LinkedList <Integer>  linList) {
        LinkedList<Integer> reversLink = new LinkedList<Integer>();
       
        while (!linList.isEmpty()) {
            reversLink.add(linList.removeLast()); 
            
        }
        return reversLink;
    }
}

