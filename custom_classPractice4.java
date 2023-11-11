package com.company;

class rectangle
{
    int a;
    int b;
    public int area()
    {
        return a*b;
    }
    public int perimeter()
    {
        return 2*(a+b);
    }
}

public class custom_classPractice4 {

    public static void main(String[]args)
    {
        rectangle rc = new rectangle();
        rc.a=4;
        rc.b=5;
        System.out.println(rc.area());
        System.out.println(rc.perimeter());
    }
}
