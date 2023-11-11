package com.company;

public class loop_practice9 {
    public static void main(String[]args)
    {
        int n=8,mul,sum=0;
        for(int i=1;i<=10;i++)
        {
            mul=n*i;
            sum=sum+mul;
        }
        System.out.println("the sum is"+sum);
    }
}
