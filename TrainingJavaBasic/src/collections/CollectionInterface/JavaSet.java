package collections.CollectionInterface;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class JavaSet {
    public static void main(String[] args) {
        //HashSet
//        HashSet<String> hashSet = new HashSet<>();
//        hashSet.add("Volvo");
//        hashSet.add("BMW");
//        hashSet.add("Ford");
//        hashSet.add("Mazda");
//        //Elements is not sorted
//        System.out.println(hashSet);
//        // Ford won't be added
//        hashSet.add("Ford");
//        for (String s : hashSet) {
//            System.out.println(s);
//        }
//
//        //LinkedHashSet
//        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
//        linkedHashSet.add("Volvo");
//        linkedHashSet.add("BMW");
//        linkedHashSet.add("Ford");
//        linkedHashSet.add("Mazda");
//        //Elements is sorted in a order
//        System.out.println(linkedHashSet);

        //TreeSet
        //Custom the order in TreeSet
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });
        treeSet.add("Volvo");
        treeSet.add("BMW");
        treeSet.add("Ford");
        treeSet.add("Mazda");
        //Elements is sorted
        System.out.println(treeSet);
    }
}
