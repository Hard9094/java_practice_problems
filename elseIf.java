package com.company;
import java.util.Scanner;

public class elseIf {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();

        if( age>40){
            System.out.println("you are experienced");

        }
        else if(age>30)
        {
            System.out.println("you are semi-experienced");
        }
        else
        {
            System.out.println("you are not experienced");
        }
    }

}
