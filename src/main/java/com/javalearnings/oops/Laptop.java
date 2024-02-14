package com.javalearnings.oops;

abstract class Laptop {
    public abstract void start();

    public abstract void shutdown();
}
class Dellaptop extends Laptop{
    public void start(){
        System.out.println("Starting dell Laptop");
    }
    public void shutdown(){
        System.out.println("Shutting down dell Laptop");
    }
}
 class HPlaptop extends Laptop{
    public void start(){
        System.out.println("Starting HP Laptop");
    }
    public void shutdown(){
        System.out.println("Shutting down HP Laptop");
    }
}
class demoLaptop{
    public static void main(String[]args) {
       // Laptop dell = new Dellaptop();
       // dell.start();
        //dell.shutdown();

        Laptop HP = new HPlaptop();
        HP.start();
        HP.shutdown();
    }


}

