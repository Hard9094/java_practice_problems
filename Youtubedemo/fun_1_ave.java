package Youtubedemo;

import java.util.Scanner;

public class fun_1_ave {

    public static float average(int a, int b, int c) {
        float ave = (a + b + c) / 3;
        return ave;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avee = average(a, b, c);
        System.out.println("average is : " + avee);
    }
}