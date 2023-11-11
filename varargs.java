package com.company;

public class varargs {
  /*  static int sum(int a,int b)
    {
        return a+b;
    }
     static int sum(int a, int b , int c)
     {
         return a+b+c;
     }
     static int sum(int a, int b , int c, int d)
     {
         return a+b+c+d;
     }*/
    public static int sum( int x,int...arr)
    {
        //available as int[] arr;
        int result= x;
        for(int a: arr){
            result+= a;
        }
         return result;
    }
    public static void main(String[]args)

    {
        int b;
        System.out.println("the sum of 4 and 5 is:"+ sum(4,5));
        System.out.println("the sum of 2,3 and 4 is:"+sum(2,3,4));
        System.out.println("the sum of 1,2,3 and 4 is:"+ sum(1,2,3,4));
        System.out.println("the sum of 1 is"+ sum(1));
    }
}
