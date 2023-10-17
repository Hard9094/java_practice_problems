package Youtubedemo;

import java.util.Scanner;

public class fun_2_sumofodd {
    public static int sumofodd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("enter the value of n: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
       int sum1= sumofodd(n);
        System.out.println("sum is: "+sum1);
    }
}
