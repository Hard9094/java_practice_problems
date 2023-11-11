package com.company;

class phone{
    public void on()
    {
        System.out.println("turning on phone");
    }
    public void call()
    {
        System.out.println("call on my phone");
    }
}
class smartphone extends phone
{
    public void on()
    {
        System.out.println("turn on my smartphone");
    }
    public void music()
    {
        System.out.println("music is playedd..!!");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[]args)
    {
        phone obj = new smartphone();
        obj.on();
        obj.call();
        //obj.music();

    }
}
