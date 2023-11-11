package com.company;

 public class method_overloading {

     static void foo() {
         System.out.println("good morning dude");
     }

     static void foo(int a) {
         System.out.println("good morning" + a + "dude");
     }

     static void foo(int a, int b) {
         System.out.println("good morning" + a + "dude");
         System.out.println("good morning" + b + "dude");
     }


     static void change2(int[] arr) {
         arr[0] = 2;
     }

     static void change(int a) {
         a = 98;
     }

     static void telljoke() {
         System.out.println("i invented a new word\n" + "plagiarism");
     }

     public static void main(String[] args) {
         //telljoke();
         //case 1: changing the integer
         // int x=45;
         //change(x);
         // System.out.println("the value of x after running change is"+x);

         //case2: changing in array
         // int [] marks={52,40,98,45};
         //change2(marks);
         //System.out.println(marks[0]);


         //method overloading
         foo();
         foo(300);
         foo(30, 40);

     }
 }
