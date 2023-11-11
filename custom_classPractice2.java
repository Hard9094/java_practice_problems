package com.company;

class cellphone
{
    public void ring()
    {
        System.out.println("ringing..");
    }
    public void vibrate()
    {
        System.out.println("vibrating...");
    }
    public void callFriend()
    {
        System.out.println("calling vid...");
    }
}
public class custom_classPractice2 {

    public static void main(String[]args)
    {
        cellphone asus= new cellphone();
        asus.callFriend();
        asus.ring();
        asus.vibrate();

    }
}
