package com.javalearnings.Map;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {

        Map<String, Integer> studentGrades = new HashMap<>();


        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 90);
        studentGrades.put("Charlie", 75);
        studentGrades.put("David", 80);
        studentGrades.put("warner", 95);


        String studentName = "Bob";
        System.out.println(studentName + "'s grade: " + studentGrades.get(studentName));


        System.out.println("Student Grades:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        String searchName = "Charlie";
        if (studentGrades.containsKey(searchName)) {
            System.out.println(searchName + " is present in the map.");
        } else {
            System.out.println(searchName + " is not present in the map.");
        }


        String removeName = "David";
        if (studentGrades.containsKey(removeName)) {
            studentGrades.remove(removeName);
            System.out.println(removeName + " has been removed from the map.");
        } else {
            System.out.println(removeName + " is not present in the map.");
        }


        System.out.println("Size of the map: " + studentGrades.size());
    }
}
