package Youtubedemo;

import java.util.Scanner;

public class bit_manipulation_getbit {

    public static int setbits(int n)
    {
        int count=0;
        while(n>0)
        {
            //checking doing logical and with 1(0001) that last bit is one or not
            if ((n & 1) > 0) {
                count += 1;
            }
            n >>= 1;
        }
        return count;
    }
    public static void main(String[] args)
    {
//        int no=1;
//        int pos=0;
//        int bitmask=1<<pos;
//
//        if ((bitmask & no) == 0){
//            System.out.println("bit zero");
//        }
//        else{
//            System.out.println("bit one");
//        }


        // count the number of set bits
        System.out.println("enter any number: ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int total=setbits(n);
        System.out.println("total number of set bits are: " + total);
    }
}
