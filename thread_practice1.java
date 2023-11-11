package com.company;

import java.sql.SQLOutput;

class thread11 extends Thread{
    @Override
    public void run()
    {
        int i =0;
        while(i<56666) {
            System.out.println("good morning");
            i++;
        }
    }
}
class thread22 extends Thread{
    @Override
    public void run()
    {int i=0;
        while(i<66666) {
           /* try {
                Thread.sleep(200);
            }
            catch(Exception e) {
                System.out.println(e);
            }*/
            System.out.println("welcome");
            i++;
            }
        }
    }

public class thread_practice1 {
    public static void main(String[]args)
    {
        thread11 t1 = new thread11();
        thread22 t2 = new thread22();
        t1.setPriority(6);
        t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t1.getState());
        System.out.println(t2.getState());
       // t1.start();
        t2.start();
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
