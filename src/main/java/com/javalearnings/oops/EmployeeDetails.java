package com.javalearnings.oops;

import java.util.Arrays;

public class EmployeeDetails {

    private String [] name;
    private int age;
    private long phoneNumber;

    private short salary;





    public EmployeeDetails(String [] name, int age, long contact, short salary) {

        this.name = name;
        this.age = age;
        this.phoneNumber = contact;
        this.salary = salary;


    }


    public static void main (String[]args){
        String[] name = {"Jayasuryan S"};
        int age = 20;
        long contact = 8248323975L;
        short salary = 30000;



        EmployeeDetails EmployeeDetails = new EmployeeDetails(name, age, contact, salary);
        EmployeeDetails.print();

    }


    private void print () {


        System.out.println(" Name:" + Arrays.toString(name));
        System.out.println(" age:" + age);
        System.out.println(" contact:" + phoneNumber);
        System.out.println("  salary: " + salary);

    }

}

