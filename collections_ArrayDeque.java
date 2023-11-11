package com.company;
import java.util.*;
public class collections_ArrayDeque {
    public static void main(String[]args)
    {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(5);
        ad1.addFirst(23);
        ad1.addLast(45);
        ad1.offer(377);
        ad1.offerFirst(3222);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println(ad1);
        System.out.println(ad1.removeLastOccurrence(45));
        System.out.println(ad1);
        System.out.println(ad1.removeLastOccurrence(45));
    }
}
