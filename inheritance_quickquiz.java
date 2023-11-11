//package com.company;

class animal
{
    String name;

    public void setName(String n)
    {
        System.out.println("enter name of animal");
        name=n;
    }
    public String getName()
    {
        return name;
    }

}
class dog extends animal{
    int d;
    public void setno(int i)
    {
        d=i;
    }
    public int getno()
    {
        return d;
    }
}
public class inheritance_quickquiz {
    public static void main(String[]args)
    {
        animal a= new animal();
        a.setName("cat");
        System.out.println(a.getName());

        dog b = new dog();
        b.setno(3);
        b.setName("dog");
        System.out.println(b.getno());
        System.out.println(b.getName());
    }
}
