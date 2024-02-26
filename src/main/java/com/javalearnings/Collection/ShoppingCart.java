package com.javalearnings.Collection;
import java.util.ArrayList;

import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();


        shoppingList.add("Milk");
        shoppingList.add("Bread");
        shoppingList.add("Eggs");


        if (shoppingList.size() > 1) {
            System.out.println("Item at position 1: " + shoppingList.get(1));
        } else {
            System.out.println("The shopping list is empty or does not have an item at position 1.");
        }


        if (shoppingList.contains("Bread")) {
            shoppingList.remove("Bread");
            System.out.println("Item 'Bread' removed from the shopping list.");
        } else {
            System.out.println("Item 'Bread' not found in the shopping list.");
        }

        shoppingList.add("cake");
        System.out.println("Updated Shopping List: " + shoppingList);

    }
}

