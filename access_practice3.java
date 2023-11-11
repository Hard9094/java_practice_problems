package com.company;

class cylinder1{
    int radius;
    int height;

    public cylinder1(int r, int h){
         radius= r;
         height=h;
    }
    public int getRadius()
    {
        return radius;
    }
    public int getHeight()
    {
        return height;
    }
    public double surfacearea()
    {
        return 2*Math.PI *radius *height + 2*Math.PI *radius;
    }
    public double volume()
    {
        return Math.PI * radius * radius* height;
    }
}

public class access_practice3 {
    public static void main(String[]args)
    {
        cylinder1 cd= new cylinder1(2,3);

        System.out.println(cd.surfacearea());
        System.out.println(cd.volume());
    }
}
