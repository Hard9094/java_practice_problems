package com.company;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class collections_Arraylist {
    public static void main(String[]args)
    {
       ArrayList<Integer> l1 = new ArrayList<>();
       ArrayList<Integer> l2 = new ArrayList<>(5);
       l2.add(16);
       l2.add(17);
       l2.add(18);
       l2.add(19);
       l2.add(20);
       l2.add(21);


       l1.add(2);
       l1.add(3);
       l1.add(4);
       l1.add(2);
       l1.add(1,6);
      // l1.addAll(3,l2);
      // l1.clear();
        System.out.println(l2.contains(21));
        System.out.println(l1.contains(45));
        System.out.println(l1.indexOf(2));
        System.out.println(l1.lastIndexOf(2));
        l1.set(0,566);


      for(int i = 0; i< l1.size(); i++)
       {
          // System.out.print(l1.get(i));
        //   System.out.print(",");
       }
        System.out.println("array list "+ l1);
        l1.remove(4);
        System.out.println("array list after removing "+ l1);
      /*  for(int i = 0; i< l2.size(); i++)
        {
            System.out.println(l2.get(i));
        }*/
    }
}
