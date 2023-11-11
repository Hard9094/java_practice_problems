package com.company;
 class Mythr1 extends Thread{
     public Mythr1(String name)
     {
         super(name);
     }
     public void run()
     {
         int i =0;
         while(i<10)
         {
             System.out.println("thankyou"+ this.getName());
             System.out.println("poopaye");
             i++;
         }
     }
 }
public class thread_priorities {
    public static void main(String[]args)
    {
        // ready queue : T1 T2 T3 T4 T5
        Mythr1 t1 = new Mythr1("diya");
        Mythr1 t2 = new Mythr1("vidhi");
        Mythr1 t3 = new Mythr1("abhii");
        Mythr1 t4 = new Mythr1("sneha");
        Mythr1 t5 = new Mythr1("aayush");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
