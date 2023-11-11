package com.company;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[]args)
    {
        System.out.println("convert km to miles");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter km");
        double a = sc.nextDouble();
        double ans = a * 0.62137;
        System.out.println("the ans is" + ans + "miles");



    }
}
