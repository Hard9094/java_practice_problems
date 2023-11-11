package com.company;
import java.util.Scanner;

public class Percentage_cal{
    public static void main(String[]args){

        System.out.println("cal percentage of 5 subjects");
        Scanner sd = new Scanner(System.in);
        System.out.println("enter marks 1");
        int a = sd.nextInt();
        System.out.println("enter marks 2");
        int b = sd.nextInt();
        System.out.println("enter marks 3");
        int c = sd.nextInt();
        System.out.println("enter marks 4");
        int d = sd.nextInt();
        System.out.println("enter marks 5");
        int e = sd.nextInt();
        float percentage = ((a + b + c + d + e)*500)/100;
        System.out.println("the answer is" + percentage);
    }
}