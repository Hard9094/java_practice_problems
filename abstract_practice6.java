package com.company;
interface tvremote{
    void voice();
    void watch();
}
interface Smarttv extends tvremote
{
    void youtube();
    void spotify();
}
class Tv implements tvremote
{
   public  void voice()
    {
        System.out.println("voiceee..");
    }
    public void watch()
    {
        System.out.println("watching");
    }
    void listen()
    {
        System.out.println("listening");
    }
}
public class abstract_practice6 {
    public static void main(String[]args)
    {
        Tv obj= new Tv();

        obj.watch();
        obj.voice();
        obj.listen();


    }
}
