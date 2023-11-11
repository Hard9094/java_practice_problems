//package com.company;

public class Arrays {
    public static void main(String[]args){
        /* classroom of 500 students- you have to store marks of 500 students
        you have 2 options:
        1. Create 500 variables
        2. use arrays
         */
        int []marks= new int[5];
        marks[0]=100;
        marks[1]=50;
        marks[2]=40;
        marks[3]=60;
        marks[4]=90;

        for (int i=4; i>=0;i--)
        {
            System.out.println(marks[i]);
        }
        float [] mark= {95.5f,55.5f};
        System.out.println(mark[0]);
    }
}
