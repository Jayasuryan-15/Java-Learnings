package com.javalearnings.oops;

public class CalcExample implements CalcInterface{
    private int a;
    private int b;
    private int  result;

    private String operation;

    public int multiply(int a, int b){
        setvalues (a,b,"multiply");
        result=a*b;
        return result;
    }

    public void setvalues (int a,int b,String operation){
        this.a=a;
        this.b=b;
        this.operation=operation;
    }
    public int divide(int a,int b){
        setvalues(a,b,"divide");
        result=a/b;
        return result;
    }
    public int subtraction(int a,int b){
        setvalues(a,b,"subtraction");
        result=a-b;
        return result;
    }
    public int addition(int a,int b){
        setvalues(a,b,"addition");
        result=a+b;
        return result;
    }
    public  void display() {
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("operation:" + operation);
        System.out.println("result:" + result);
        System.out.println();


    }
    public static void main (String[]args){
        CalcExample CalcExample=new CalcExample();

        CalcExample.multiply(2,3);
        CalcExample.display();

        CalcExample.divide(3,5);
        CalcExample.display();

        CalcExample.subtraction(5,6);
        CalcExample.display();

        CalcExample.addition(7,8);
        CalcExample.display();
    }
}




