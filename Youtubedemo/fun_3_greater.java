package Youtubedemo;

import java.util.Scanner;

public class fun_3_greater {

    public static int great(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int big=great(a,b);
        System.out.println("bigger number is : " + big);
    }
}
