package thread;

import java.util.concurrent.*;

public class ThreadSafeColections {
    public static void main(String[] args) throws InterruptedException {
        //ConcurrentHashMap thread-safe
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        //ConcurrentLinkedQueue
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.offer(1);
        System.out.println(queue.poll());
        //CopyOnWriteArrayList
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        System.out.println(list.get(0));
        //BlockingQueue
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);
        blockingQueue.put(1);
        System.out.println(blockingQueue.take());
    }
}
