package com.company;
 class Mythr extends Thread{
  public Mythr(String name)
  {
   super(name);
  }
  public void run()
  { int i=0;
   while(i<10)
   {
    System.out.println("I AM A THREAD");
    i++;
   }
  }
 }
public class thread_constructor {
  public static void main(String[]args)
  {
   Mythr t1 = new Mythr("diya");
   Mythr t2= new Mythr("vidhi");
   t1.start();
   t2.start();
   System.out.println("the id of thread is"+t1.getId());
   System.out.println("the name of thread is"+t1.getName());
   System.out.println(t2.getId());
   System.out.println(t2.getName());
  }
}
