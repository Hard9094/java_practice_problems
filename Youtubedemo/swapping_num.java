package Youtubedemo;

public class swapping_num {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int temp;

        System.out.println("before swap:"+" a: "+a+"  b:"+b);
        //method 1
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swap:"+" a: "+a+"  b:"+b);

        //method2
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swap:"+" a: "+a+"  b:"+b);

        //using xor

    }
}
