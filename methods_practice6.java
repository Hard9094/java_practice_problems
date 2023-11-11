package com.company;

public class methods_practice6 {
    static int avg(int ...arr) {
        int n = arr.length;
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;


        }
        return sum/n;

    }



    public static void main(String[]args)
    {
        System.out.println(avg(10,20,30,40,50));
        System.out.println(avg(10,20));
    }
}
