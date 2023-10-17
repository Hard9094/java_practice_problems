package Youtubedemo;

public class bit_manipulation_clearbit {
    public static void main(String[] args) {

        int no=5;
        int pos=2;
        int bitmask=1<<pos;
        int newbitmask = ~bitmask;
        int newno= newbitmask & no;
        System.out.println("0101 to 0001 as clearing 3rd position(1 to 0) "+"\n"+"number will be :" + newno);
    }
}
