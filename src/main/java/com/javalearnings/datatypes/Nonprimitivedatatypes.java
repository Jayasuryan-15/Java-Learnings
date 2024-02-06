package com.javalearnings.datatypes;

import java.util.Arrays;

public class Nonprimitivedatatypes {


    private String[] name;
    private int[] marks ;

    public Nonprimitivedatatypes(String[] name, int[] marks){
        this.name= name;
        this.marks= marks;
    }

    public static void main(String[]args){
        String[] name= {"Jayasuryan"};
        int[] marks={80,90,95,98,100};

        Nonprimitivedatatypes Nonprimitivedatatypes= new Nonprimitivedatatypes(name,marks );
        Nonprimitivedatatypes. print();


    }

    private void print (){
        System.out .println("my name"+Arrays.toString (name));
        System.out.println("marks"+Arrays.toString(marks));

    }


}
