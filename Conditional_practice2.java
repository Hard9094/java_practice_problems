package com.company;
import java.util.Scanner;

public class Conditional_practice2 {
    public static void main(String[]args)
    {
        //write a program to find out whether a student is pass or fail; if it requires total 40% and atleast 33% in each subject to pass. assume 3 subjects and take marks as an input from the user
        Scanner marks = new Scanner(System.in);
        System.out.println("enter marks1");
        int marks1= marks.nextInt();
        System.out.println("enter marks2");
        int marks2 = marks.nextInt();
        System.out.println("enter marks3");
        int marks3 = marks.nextInt();
        float avg = (marks1+ marks2 + marks3)/3.0f;
        System.out.println("your overall percentage is"+ avg);
        if(avg>=40 && marks1>=33 && marks2>=33 && marks3>=33)
        {
            System.out.println("you have been promoted");
        }
        else{
            System.out.println("you have not been promted");
        }


    }
}
