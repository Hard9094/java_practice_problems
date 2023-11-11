package com.company;
class Thread1 extends Thread{
    @Override
    public void run()
    { int i =0;
        while (i<7) {


            System.out.println("my thread1 is running");
            System.out.println("i am happy");
            i++;
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run()
    {
          int i=0;
        while(i<5){
            System.out.println("thread2 s good");
            System.out.println("i am sad");
            i++;
        }
    }

}
public class threads1 {
    public static void main(String[]args)
    {
        Thread1 t1= new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
        System.out.println(t1.getId());
        System.out.println(t2.getId());
    }
}
