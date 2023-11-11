package com.company;

class A{
    public int diya(){
        return 4;
    }
    public void meth()
    {
        System.out.println("i am method of class A" );
    }
}
class B extends A{
    @Override
    public void meth()
    {
        System.out.println("i am method of class B");
    }
    public void meth2()
    {
        System.out.println("i am method 2 of class B");
    }
}

public class method_overriding {
    public static void main(String[]args)
    {
        A a= new A();
        a.meth();

        B b= new B();
        b.meth();
    }
}
