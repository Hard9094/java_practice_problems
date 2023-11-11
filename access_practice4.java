package com.company;

class rectangle1{
    int length;
    int breadth;

    public rectangle1()
    {
        length = 5;
        breadth= 4;
    }
    public rectangle1(int l , int b)
    {
        length = l;
        breadth= b;
    }
    public int getlength()
    {
        return length;
    }
    public int getbreadth()
    {
        return breadth;
    }

}

public class access_practice4 {
    public static void main(String[]args)
    {
        rectangle1 rg= new rectangle1(3,4);
        System.out.println(rg.getlength());
        System.out.println(rg.getbreadth());

    }
}
