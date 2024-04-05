package collections.CollectionInterface;

import java.rmi.Remote;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class JavaList {
    public static void main(String[] args) {
        //ArrayList
//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars);
//        //Change an Item
//        cars.set(0,"VinFast");
//        //Remove
//        cars.remove(0);
//        cars.clear(); //remove all
//        //Access
//        System.out.println(cars.get(0));


//        //LinkedList
//        LinkedList<String> cars = new LinkedList<>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars);
//        //Add an element
//        cars.addLast("VinFast");
//        //Get item
//        System.out.println(cars.getFirst());

        //Vector is synchronized
        List<String> vector = new Vector<>();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                vector.add("A");
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                vector.add("B");
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(vector);
    }
}
