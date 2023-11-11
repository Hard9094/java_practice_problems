package com.company;

public class Logical {
    public static void main(String[]args)
    {
        boolean a = true;
        boolean b= false;
        boolean c = true;
        if(a && b && c){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("NOT(a) is"+ !a );
    }
}
