package com.company;
import java.util.Scanner;

public class Conditional_practice4 {
    public static void main(String[]args)
    {
        //write a java program to find out the day of the week given the number [ 1 for monday, 2 for tuesday... and so on]
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number from  1 to 7");
        int day = sc.nextInt();

        switch(day){
            case 1: System.out.println("monday");
            break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("does not exist");
        }
    }
}
