package Youtubedemo;

import java.util.*;
public class bit_manipulation_update {
    public static void main(String[] args) {
        System.out.println("enter no: ");
        Scanner sc= new Scanner (System.in);
        int no = sc.nextInt();

        System.out.println("enter position: ");
        int pos = sc.nextInt();


        System.out.println("enter operation 1 for setting the bit 0 for clearing the bit: ");
        int oper = sc.nextInt();
        //operation =1 : set
        //operation =0 : clear

        if(oper == 1 )
        {
            int bitmask = 1 << pos;
            int newno = bitmask | no;
            System.out.println("updated number is: "+newno);
        }
        else {
            int bitmask = 1<< pos;
            int newbitmask = ~bitmask;
            int newno=newbitmask  & no;
            System.out.println("updated number is: "+newno);
        }


    }
}
