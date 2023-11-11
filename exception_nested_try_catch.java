package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class exception_nested_try_catch {
    public static void main(String[]args)
    {
        int []marks = new int[3];
        marks[0] = 4;
        marks[1] = 45;
        marks[2] = 456;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("enter the array index");
            int ind = sc.nextInt();


            try {
                System.out.println("welcome");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e);
                    System.out.println("exception occured at level 2");
                }
            } catch (Exception e) {
                System.out.println("exception occured at level 1");
            }

        }
        System.out.println("end of the program");
    }
}
