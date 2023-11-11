package com.company;
import java.util.Scanner;

public class Conditional_practice6 {
    public static void main(String[]args)
    {
        // write a program to find out the type of website from the url
        Scanner sc= new Scanner(System.in);
        System.out.println("ends with ");
        String website= sc.next();
        if(website.endsWith(".org"))
        {
            System.out.println("this is an organizational website");

        }
        else if(website.endsWith(".com"))
        {
            System.out.println("this is a commercial website");
        }
        else if(website.endsWith(".in"))
        {
            System.out.println("this is an indian website");
        }
    }
}
