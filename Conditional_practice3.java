package com.company;
import java.util.Scanner;

public class Conditional_practice3 {
    public static void main(String[]args)
    {
        // calculate income tax paid by an employee to the government as per the slabs mentioned below
         float tax=0;
         Scanner sc= new Scanner(System.in);
         System.out.println("enter the income");
         float income = sc.nextFloat();

         if(income<2.5f)
         {
             tax= tax + 0;
         }
         else if(income>2.5f && income<5.0f)
         {
             tax = tax + 0.05f*(income- 2.5f);
         }
         else if(income>5f && income<10.0f)
         {
             tax = tax + 0.05f*(5.0f - 2.5f);
             tax = tax + 0.2f*(income - 5.0f);
         }
         else if(income>10.0f)
         {
             tax = tax + 0.05f*(5.0f - 2.5f);
             tax = tax + 0.2f*(10.0f - 5.0f);
             tax = tax + 0.3f*(income - 10.0f);
         }
         System.out.println("the total tax paid by the employee"+ tax);
    }
}
