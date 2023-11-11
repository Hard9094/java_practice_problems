package com.company;

public class Exception_practice2 {
    public static void main(String[]args)
    {
        try{
            int a = 45/0;
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("hehe");
        }
        catch(ArithmeticException e)
        {
            System.out.println("haha");
        }
    }
}
