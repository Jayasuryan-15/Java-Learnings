package com.javalearnings.oops;

public class Volume {
    public static void main(String[] args) {
         Box b=new Box(6,6,7);
         System.out.println(b.volume);

    }

}
class Box{
    public int volume;
    Box (int length,int height,int width){
        this.volume=length*height*width;
    }
}
