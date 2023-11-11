package com.company;
import java.util.Scanner;
public class Exception_practice3 {
    public static void main(String[]args)
    {
        boolean flag = true;
        int []marks = new int[3];
        marks[0]=12;
        marks[1]=10;
        marks[2]=30;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any index number");
        int i = 0;
        while(flag && i<5)
        {
            try{
                int ind = sc.nextInt();
                System.out.println("the array of marks[ind] is "+ marks[ind]);

            }catch(Exception e)
            {
                System.out.println("invalid index");
                i++;

            }
        }
        if(i==5)
        {
            System.out.println("error");
        }
    }
}
