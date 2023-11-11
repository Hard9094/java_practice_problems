package com.company;

public class methods_practice1 {
    static void mul(int n) {
        for (int i=1; i <= 10; i++) {
            System.out.format("%d  X  %d = %d\n", n, i, n * i);
        }

    }
    public static void main(String[]args)
    {
        mul(5);
    }
}

