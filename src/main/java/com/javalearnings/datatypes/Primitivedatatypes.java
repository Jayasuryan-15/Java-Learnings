package com.javalearnings.datatypes;

import java.util.Arrays;

public class Primitivedatatypes {
         private char[] name;
         private int age ;
         private long phoneNumber;
         private boolean eligibility;

    public Primitivedatatypes(char[] name, int age, long contact, boolean eligibility) {

        this.name = name;
        this.age =  age;
        this.phoneNumber =  contact;
        this.eligibility = eligibility;
    }
        public static void main (String[] args) {
            char[] name = {'s', 'u', 'r', 'y', 'a'};
            int age = 20;
            long contact = 8248323975L;
            boolean eligibility = false;

            Primitivedatatypes primitivedatatypes = new Primitivedatatypes(name, age, contact, eligibility);
            primitivedatatypes.print();
        }


        private void print(){


             System.out.println("My Name"+ Arrays.toString(name));
             System.out.println("My age"+age);
             System.out.println("My contact"+phoneNumber);
             System.out.println(" eligibility"+eligibility);
         }



}