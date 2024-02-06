package com.javalearnings.datatypes;

import java.util.Arrays;

public class Primitivedatatypes {

    private char[] name;
    private int age;
    private long phoneNumber;
    private boolean eligibility;
    private byte number;
    private short salary;
    private double fraction;
    private float mark;



    public Primitivedatatypes(char[] name, int age, long contact, boolean eligibility, byte number, short salary, double fraction, float mark) {

        this.name = name;
        this.age = age;
        this.phoneNumber = contact;
        this.eligibility = eligibility;
        this.number = number;
        this.salary = salary;
        this.fraction = fraction;
        this.mark = mark;
    }


        public static void main (String[]args){
            char[] name = {'s', 'u', 'r', 'y', 'a'};
            int age = 20;
            long contact = 8248323975L;
            boolean eligibility = false;
            byte number = 127;
            short salary = 20000;
            double fraction = 99 / 4;
            float mark = 45f;

            Primitivedatatypes primitivedatatypes = new Primitivedatatypes(name, age, contact, eligibility, number, salary, fraction, mark);
            primitivedatatypes.print();
        }


        private void print () {


            System.out.println("My Name:" + Arrays.toString(name));
            System.out.println("My age:" + age);
            System.out.println("My contact:" + phoneNumber);
            System.out.println(" eligibility:" + eligibility);
            System.out.println(" My number:" + number);
            System.out.println(" My salary: " + salary);
            System.out.println(" fraction:" + fraction);
            System.out.println(" My mark:" + mark);
        }

    }

