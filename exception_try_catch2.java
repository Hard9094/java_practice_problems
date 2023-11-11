package com.company;
import java.util.Scanner;

public class exception_try_catch2 {
    public static void main(String[]args)
    {
        int []marks= new int[3];
        marks[0]=5;
        marks[1]=45;
        marks[2]=56;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array index");
        int ind= sc.nextInt();

        System.out.println("enter the number you want to divide");
        int num= sc.nextInt();

        try{
            System.out.println("the array index is"+ marks[ind]);
            System.out.println("the reault is"+ marks[ind]/num);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic exception occured");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bound occured");
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println("some other exception occured");
            System.out.println(e);
        }
    }
}
