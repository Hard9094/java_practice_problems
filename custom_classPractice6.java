package com.company;
import java.math.MathContext;



class circle
{
    double a;
    public double area()
{
    return Math.PI*a*a;

}
 public double perimeter()
 {
     return 2*Math.PI*a;
 }
}

public class custom_classPractice6 {
    public static void main(String[]args)
    {
        circle cr= new circle();
        cr.a=2;
        System.out.println(cr.area());
        System.out.println(cr.perimeter());
    }
}
