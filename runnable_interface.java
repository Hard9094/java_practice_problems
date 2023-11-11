package com.company;
class ThreadRunnable1 implements Runnable{
    @Override
    public void run(){
            int i=0;
        while(i<10) {
            System.out.println("poopayee");
            i++;
        }
    }
}
class ThreadRunnable2 implements Runnable
{
    @Override
    public void run()
    {
        int i =0;
        while(i<20)
        {
            System.out.println("holaaaaa");
            i++;
        }
    }
}

public class runnable_interface { public static void main(String[]args)
{
    ThreadRunnable1 bullet1= new ThreadRunnable1();
     Thread gun1= new Thread(bullet1);

    ThreadRunnable2 bullet2 = new ThreadRunnable2();
    Thread gun2= new Thread(bullet2);

    gun1.start();
    gun2.start();
}
}
