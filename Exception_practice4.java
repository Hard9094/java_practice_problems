package com.company;

import java.util.Scanner;

class maxRetries extends Exception{
    @Override
    public String getMessage()
    {
        return "error";
    }
}

public class Exception_practice4 {
    public static void main(String[] args) {
        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 12;
        marks[1] = 10;
        marks[2] = 30;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any index number");
        int i = 0;
        while (flag) {
            if(i<5)
            try {
                int ind = sc.nextInt();
                System.out.println("the result of marks[ind] is" + marks[ind]);

            } catch(Exception e)
            {
                System.out.println("other exception");
                i++;
            }
            else
            {
                try {
                    throw new maxRetries();
                }catch(maxRetries e)
                {
                    System.out.println(e.getMessage());
                    break;
                }
            }
        }

    }
}
