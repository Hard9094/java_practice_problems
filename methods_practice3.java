package com.company;

public class methods_practice3 {

    static int sumrect(int n)
    {
       if(n==1)
       {
           return 1;
       }
       else {
           return n +sumrect(n-1);
       }
    }
    public static void main(String[]args)
    {
      int ans=  sumrect(5);
        System.out.println(ans);
    }
}
