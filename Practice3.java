package com.company;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[]args)
    {
        System.out.println("What is your name?");
        Scanner name= new Scanner(System.in);
        String str = name.nextLine();
        System.out.println("hello\t"+ str + "\tHave a good day");

    }
}
