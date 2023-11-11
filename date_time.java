package com.company;

public class date_time {
    public static void main(String[]args)
    {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        System.out.println("number of mins passed"+System.currentTimeMillis()/1000/60);
        System.out.println("number of hours passed"+ System.currentTimeMillis()/1000/3600);
        System.out.println("number of days passed"+ System.currentTimeMillis()/1000/3600/24);
    }
}
