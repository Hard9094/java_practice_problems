package com.company;
abstract class Pen
{
    abstract void write();
    abstract void refill();
}
class fountainPen extends Pen
{
    public void ChangeNib()
    {
        System.out.println("change the nib");
    }
    public void write()
    {
        System.out.println("write with the fountain pen");
    }
    public void refill()
    {
        System.out.println("refilll it");
    }
}

public class abstract_practice1 {
    public static void main(String[]args)
    {
        fountainPen fp = new fountainPen();
        fp.ChangeNib();
        fp.write();
        fp.refill();
    }
}
