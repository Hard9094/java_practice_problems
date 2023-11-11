package com.company;
import java.util.Scanner;

public class loop_practice2 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0,sum=0;
        while(2*i<n)
        {
            sum= sum+ (2*i);
            i++;

        } System.out.println("total is"+sum);

    }
}
