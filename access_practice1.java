package com.company;

class cylinder
{
    private int radius;
    private
    int height;

    public void setRadius(int n)
    {
        radius=n;
    }
    public int getRadius()
    {
        return radius;
    }
    public void setHeight(int i)
    {
        height=i;
    }
    public int getHeight()
    {
        return height;
    }
    public double surfaceArea()
    {
        return 2*Math.PI * radius*radius + 2*Math.PI *radius*height;
    }
    public double volume()
    {
        return Math.PI *radius * radius * height;
    }
}

public class access_practice1 {
     public static void main(String[]args)
     {
         cylinder cd = new cylinder();
         cd.setHeight(3);
         cd.setRadius(4);
         System.out.println(cd.getRadius());
         System.out.println(cd.getHeight());
         System.out.println(cd.surfaceArea());
         System.out.println(cd.volume());
     }
}
