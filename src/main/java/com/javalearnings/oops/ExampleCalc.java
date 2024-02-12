package com.javalearnings.oops;

public  class ExampleCalc implements CalcInterfaceJ1 {
    private final int a ;
    private final int b ;

    private int result;
    private String  operation;

   public ExampleCalc(int a,int b){
       this.a=a;
       this.b=b;
   }


    public int multiply () {
        this.operation="multiply";
        result=a*b;
        return result;


    }


    public int divide() {
        this.operation="divide";
        result=a/b;
        return result;

    }


    public int addition() {
        this.operation="addition";
        result=a+b;
        return result;
    }


    public int subtraction() {
        this.operation="subtraction";
        result=a-b;
        return result;
    }



    public  void display() {
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("operation:"+operation);
        System.out.println("result:"+result);
        System.out.println();

    }
    public static void main (String[] args){
       ExampleCalc ExampleCalc= new ExampleCalc(2,8);

        ExampleCalc.multiply();
        ExampleCalc.display();




    }


}
