package com.company;
 abstract class Parent2{
     public Parent2(){//constructor
         System.out.println("i am parent2 constructor");
     }
     public void sayHello()
     {
         System.out.println("hello");
     }
     abstract  public void greet();
     abstract public void greet2();
 }
 class Child2 extends Parent2 {   //concrete class
     @Override
     public void greet()
     {
         System.out.println("good morning");
     }
     public void greet2()
     {
         System.out.println("hellooo..");
     }

 }
  abstract  class child3 extends Parent2{
     public void th()
     {
         System.out.println("heyyy..");
     }


   }
public class abstract_class {
     public static void main(String[]args)
     {
         Child2 c= new Child2();
         c.greet();
         c.greet2();
        //Parent2 p = new Parent2();  --error because abstract class does not have object
      // child3 c1= new child3();
     }
}
