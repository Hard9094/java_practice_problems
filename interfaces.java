package com.company;

 interface bicycle{
     int a=4;
     void applybrake(int decrement);
     void speedup(int increment);

}
interface horncycle
{
    void blowhornk3g();
    void blowhornmhn();
}
class avoncycle implements bicycle , horncycle{

     void horn()
     {
         System.out.println("pee pee poo poo");
     }
     public void applybrake(int decrement)
     {
         System.out.println("applying break");
     }
     public void speedup(int increment)
     {
         System.out.println("speeding up");
     }
     public void blowhornk3g()
     {
         System.out.println("kabhi khushi kabhi gum");
     }
     public void blowhornmhn()
     {
         System.out.println("main hoo na");
     }
}

public class interfaces {
     public static void main(String[]args)
     {
         avoncycle ac= new avoncycle();
         ac.applybrake(3);
         //you can create properties in interfaces
         System.out.println(ac.a);
         //you cannot modify the properties in interfaces as they are final
        // ac.a=45;
        // System.out.println(ac.a);
         ac.blowhornmhn();
         ac.blowhornk3g();
     }
 }
