package com.company;

interface BasicAnimal
{
     void sleep();
     void eat();
}
class Monkey
{
    public void jump()
    {
        System.out.println("monkey is jumping");
    }
    public void bite()
    {
        System.out.println("bitingggg");
    }

}
class Human extends Monkey implements BasicAnimal{
    public void speak()
    {
        System.out.println("hellooo");
    }
    @Override
    public void sleep()
    {
        System.out.println("sleeping...");
    }
    @Override
public void eat()
{
    System.out.println("eatingg...");
}
}
public class abstract_practice3 {
    public static void main(String[]args)
    {
        Human h = new Human();
        h.eat();
        h.sleep();
        h.speak();
        h.jump();

        BasicAnimal ba= new Human();
        ba.sleep();
        ba.eat();
        // ba.speak();   here refernce is basic animal so the methods which are present in that only that considered

    }
}
