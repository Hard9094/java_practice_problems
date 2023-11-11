package com.company;
    class TommyVecetti
    {
        public void hit()
        {
            System.out.println("hitting...");
        }
        public void run()
        {
            System.out.println("running..");
        }
        public void fire()
        {
            System.out.println("firing..");
        }
    }
public class custom_classPractice5 {

        public static void main(String[]args)
        {
            TommyVecetti tv = new TommyVecetti();
            tv.run();
            tv.fire();
            tv.hit();
        }
}
