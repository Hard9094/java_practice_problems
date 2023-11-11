//package com.company;

class Base
{
    int x;
    public int getX()
    {
        return x;
    }
     public void setX(int n)
     {
         System.out.println("i am in base and i am setting x now");
         x=n;
     }
     public Base()
     {
         System.out.println("i am a constructor of base");
     }
}
class derived extends Base{
    int y;
    public derived() {
        System.out.println("i am a constructor of derived");
    }
    public int gety()
    {
        return y;
    }
    public void sety(int i)
    {
        y=i;
    }
}


public class inheritance {
    public static void main(String[]args)
    {   //creating an object for base class
        Base b= new Base();
        b.setX(3);
        System.out.println(b.getX());

        //creating an obj for derived class
        derived d= new derived();
        d.setX(5);
        System.out.println(d.getX());
        d.sety(34);
        System.out.println(d.gety());
    }
}
