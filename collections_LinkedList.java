package com.company;

import java.util.*;

public class collections_LinkedList {
    public static void main(String[]args)    /* the only difference is instead of arraylist you have to write linkedlist
    and linkedlist cannot have initialized capacity and all methods as same as arraylist only few of them are new in linkedlist*/

    {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
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
        l1.addFirst(789);
        l1.addLast(678);
        l1.remove(0);
        l1.add(1,6);
        // l1.addAll(3,l2);
        // l1.clear();
        System.out.println(l2.contains(21));
        System.out.println(l1.contains(45));
        System.out.println(l1.indexOf(2));
        System.out.println(l1.lastIndexOf(2));
        //l1.set(0,566);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l1.getFirst());
        System.out.println(l1.element());
        System.out.println(l1.offer(678));
       // System.out.println(l1.poll());
        System.out.println(l1.pop());
        l1.push(2);

    }
}
