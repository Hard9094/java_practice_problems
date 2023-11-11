package com.company;
class Base1
{
     public Base1(){
         System.out.println("i am a constructor");
     }
     Base1(int x)
     {
         System.out.println("i an a constructor with th value:" + x);
     }
    public int x;

    public int getX()
    {
        return x;
    }
    public void setX(int n)
    {
        x=n;
    }
}
class derived1 extends Base1
{
    derived1()
    {

        System.out.println("i am aderived class constructor");
    }
    derived1(int x, int y)
    {
        super(x);
        System.out.println("i am overloaded constructor with the value:" + y);
    }
    public int y;

    public int getY()
    {
        return y;
    }
    public void setY(int i)
    {
        y=i;
    }
}
class child extends derived1{
    child()
    {
        System.out.println("i am a child of derived constructor");
    }
    child(int x, int y, int z)
    {
        super(x,y);
        System.out.println("the overloaded constructor of derived with value z :"+z);
    }
}

public class constructors_in_inheritance {
    public static void main(String[]args)
    {
      //  Base1 b= new Base1();
       // derived1 d= new derived1();
        child c= new child(40,50,60);
    }
}
