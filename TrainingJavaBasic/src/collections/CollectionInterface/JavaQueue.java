package collections.CollectionInterface;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
    public static void main(String[] args) {
        //FIFO
        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("Volvo");
        stringQueue.add("BMW");
        stringQueue.add("Ford");
        stringQueue.add("Mazda");

        //remove the first element
        stringQueue.remove();
        //get the first element then delete it from queue
        System.out.println(stringQueue.poll());
        //get the first element
        System.out.println(stringQueue.peek());
    }
}
