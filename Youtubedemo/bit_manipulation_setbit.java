package Youtubedemo;

public class bit_manipulation_setbit {
    public static void main(String[] args) {
        int no=5;
        int pos=1;
        int bitmask=1<<pos;

        int newno = bitmask |no;
        System.out.println(newno);
    }
}
