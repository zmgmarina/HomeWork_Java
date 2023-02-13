package seminar4;

import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый 
// элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

public class task {
    public static void main(String[] args) {
        LinkedList <Integer>  list = new LinkedList<>();
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(8);
        System.out.println(list);
        System.out.println();

        enqueue(list, 1);
        System.out.println("Поместили элемент в конец очереди\n" + list);
        System.out.println();

        System.out.println("Извлекли первый элемент и удалили\n" +dequeue(list));
        System.out.println(list);
        System.out.println();

        System.out.println("Извлекли первый элемент без удаления\n" + first(list));
        System.out.println(list);
    }

    private static int enqueue ( LinkedList <Integer>  list, int item) {
        list.addLast(item);
        
        return item;
    }

    private static int dequeue (LinkedList <Integer>  list) {
        int item = list.removeFirst();
              
        return item;
    }

    private static int first (LinkedList <Integer>  list) {
        int item = list.getFirst();

        return item;
    }
    
    
}
