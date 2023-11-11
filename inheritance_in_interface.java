//package com.company;

interface Sampleinterface
{
    void meth1();
    void meth2();
}
interface childSampleinterface extends Sampleinterface
{
    void meth3();
    void meth4();
}
class MySampleclass implements childSampleinterface
{
    public void meth3()
    {
        System.out.println("heyy");
    }
    public void meth4()
    {
        System.out.println("hii");
    }
    public void meth1()
    {
        System.out.println("holaa");
    }

    @Override
    public void meth2() {
        System.out.println("heyyyy");
    }


}

public class inheritance_in_interface {
    public static void main(String[]args)
    {
        MySampleclass obj= new MySampleclass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
