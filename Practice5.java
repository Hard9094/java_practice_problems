package com.company;
import java.util.Scanner;

public class Practice5 {
    public static void main(String[]args)
    {
        System.out.println("detect a number is int or not");
        Scanner num = new Scanner(System.in);
        System.out.println("enter a num");
        boolean b1 = num.hasNextInt();
        System.out.println(b1);

    }
}
