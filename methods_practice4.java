package com.company;

public class methods_practice4 {
    static void star1(int n)
    {
        for(int i=n;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[]args)
    {
        star1(4);
    }
}
