package com.company;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[]args)
    {
        System.out.println("Taking input from the user");
        Scanner sd= new Scanner(System.in);
        System.out.println("enter num 1");
        int a = sd.nextInt();
        System.out.println("enter num 2");
        int b = sd.nextInt();
        System.out.println("the sum of a and b is");
        int sum=  a +  b;
        System.out.println(sum);

    }
}
