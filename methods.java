package com.company;

public class methods{


    static int logic(int x, int y){
        int z;
        if(x<y){
            z= x+y;

        } else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[]args){

        int a=5;
        int b=7;
        int c;
        //method invocation using object creation
        //methods obj = new methods();
        c= logic(a,b);
        System.out.println(c);

        int a1=3;
        int a2=2;
        int c1;
        c1= logic(a1,a2);
        System.out.println(c1);

    }
}

