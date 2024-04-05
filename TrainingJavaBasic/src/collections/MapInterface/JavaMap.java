package collections.MapInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaMap {
    public static void main(String[] args) {
        //HashMap can contain null key and null value
//        Map<String, Integer> scores = new HashMap<>();
//        scores.put("Alice", 95);
//        scores.put("Bob", 80);
//        scores.put("Charlie", 75);
//
//        System.out.println(scores.get("Alice"));
//        System.out.println(scores.containsKey("Anh"));
//        System.out.println(scores);

        //LinkedHashMap
//        Map<String, Integer> scores = new LinkedHashMap<>();
//        scores.put("Alice", 95);
//        scores.put("Bob", 80);
//        scores.put("Charlie", 75);
//        System.out.println(scores);

        //TreeMap are not allowed to contain null key
        Map<String, Integer> scores = new TreeMap<>();
        scores.put("Bob", 80);
        scores.put("Alice", 95);
        scores.put("Charlie", 75);
        System.out.println(scores);
    }
}
