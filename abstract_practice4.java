package com.company;

 abstract class telephone
{
   abstract void ring();
    abstract void lift();
     abstract void disconnect();

}
class SmartTelephone extends telephone{
     @Override
      void ring()
      {
          System.out.println("ringing");
      }
      @Override
      void lift()
      {
          System.out.println("lifting");
      }
      @Override
      void disconnect()
      {
          System.out.println("disconnecting");
      }
}
public class abstract_practice4 {
     public static void main(String[]args)
     {
         telephone tele = new SmartTelephone();
         tele.ring();
         tele.lift();
         tele.disconnect();
     }
}
