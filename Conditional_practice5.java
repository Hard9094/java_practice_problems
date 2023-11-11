package com.company;
import java.util.Scanner;

public class Conditional_practice5 {
    public static void main(String[]args)
    {
        //write a java program to find whether a year entered by the user is a leap year or not
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year");
        int year = sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if (year % 400 == 0) {
                    System.out.println("this is a leap year");

                }
            }

        }
        else{
            System.out.println("this is not a leap year");
        }

    }
}
