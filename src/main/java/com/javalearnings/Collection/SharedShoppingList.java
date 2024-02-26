package com.javalearnings.Collection;

import java.util.Vector;

public class SharedShoppingList{
   public static void main(String[] args) {
    Vector<String> sharedList = new Vector<>();


    sharedList.add("Apples");
    sharedList.add("Chicken");
    sharedList.add("Salad");


    System.out.println("Friend sees: " + sharedList);


    sharedList.remove("Chicken");


    System.out.println("You see: " + sharedList);
    System.out.println("Friend sees: " + sharedList);
}
}



