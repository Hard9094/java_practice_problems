package com.company;

public class Exception_finally_block {
    public static int greet() {
        try {
            int a = 55;
            int b = 10;
            int c;
            c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("okkk");
        } finally {
            System.out.println("alll donee");
        }
        return -1;

    }

    public static void main(String[] args) {
        int result = greet();
        System.out.println(result);

        int a = 60;
        int b = 9;
        while (true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("the value of b after every operation is" + b);
            }
            b--;
        }

        try {
            System.out.println(5 / 0);

        } finally {

            System.out.println("we can use finally instead of catch");
        }
    }
}