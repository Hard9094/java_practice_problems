package com.company;
class MynewThr1 extends Thread{
    public void run()
    {
        int i =0;
        while(i<5666)
        {
            System.out.println("poopayeeee");

            try{
                Thread.sleep(2000);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }i++;
    }
}
class MynewThr2 extends Thread{
    public void run()
    {
        int i =0;
        while(i<3000)
        {
            System.out.println("holaaa");
            i++;
        }
    }
}

public class thread_methods {
    public static void main(String[]args)
    {
        MynewThr1 t1 = new MynewThr1();
        MynewThr2 t2= new MynewThr2();
        t1.start();
       /* try{
            t1.join();
        }catch(Exception e)
        {
            System.out.println(e);
        }*/
        t2.start();
    }
}
