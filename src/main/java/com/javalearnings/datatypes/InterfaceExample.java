package com.javalearnings.datatypes;

interface CalcInterface{
    void multiply();
    void divide();
    void addition();
    void Subtraction();
}
 public class InterfaceExample implements CalcInterface{
    int a =2;
    int b=3;
    int c;
    int d;


    public void multiply (){
         int c=a*b;
        System.out.println("Multiplication of numbers is :"+c);
    }
    public void divide(){
        int c =a/b;
        System.out.println("Division of Number is:"+c);
    }
    public void addition(){
        int c=a+b;
        System.out.println("Addition of Number is : "+c);
     }


     public void Subtraction() {
        int c =a-b;
        System.out.println("Addition of Number is :"+c);

     }


    public static void main(String[]args){
        InterfaceExample obj=new InterfaceExample();
        obj.multiply();
        obj.divide();
        obj.addition();
        obj.Subtraction();
    }
}
