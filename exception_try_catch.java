package com.company;

public class exception_try_catch {
    public static void main(String[]args)
    {
        int a= 1000;
        int b= 0;
        try{
            int c= a/b;
            System.out.println("the result is"+ c);
        }
        catch(Exception e)
        {
            System.out.println("we failed to divide.reason :");
            System.out.println(e);
        }
        System.out.println("end of the program");
    }
}
