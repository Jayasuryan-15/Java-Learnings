package com.javalearnings.oops;

public class Student {
    private final String name;
    private final long id;
    private final String address;
    private final float mark;


    public Student(String name, long id, String address, float mark) {
        this.name=name;
        this.id=id;
        this.address=address;
        this.mark=mark;


    }



    public static void main(String[]args){
        String name ="Jayasuryan";
        long id=20614111;
        String address= "Pallavaram chennai ";
        float mark=98;

        Student Student=new Student(name,id,address,mark);
        Student .print();

    }
    private void print(){
        System.out.println("Student name:"+name);
        System.out.println("Student id:"+id);
        System.out.println("Student address:"+address);
        System.out.println("Student mark:"+mark);
    }

}

