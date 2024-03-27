package Problems;

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Grapes");
        arrayList.add("Orange");
        System.out.println("ArrayList (Dynamic resizing list): " + arrayList);


        List<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Blue");
        System.out.println("LinkedList (Doubly linked list): " + linkedList);


        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        System.out.println("HashSet (Unordered set of unique elements): " + hashSet);


        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Dog");
        treeSet.add("Cat");
        treeSet.add("Bird");
        System.out.println("TreeSet (Ordered set of unique elements): " + treeSet);


        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        System.out.println("HashMap (Key-value pairs): " + hashMap);


        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("A", "Apple");
        treeMap.put("B", "Grapes");
        treeMap.put("C", "Cat");
        System.out.println("TreeMap (Ordered key-value pairs): " + treeMap);
    }
}

