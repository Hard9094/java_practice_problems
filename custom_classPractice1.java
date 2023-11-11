package com.company;

class employee1
{
    int salary;
    String name;

    public int getSalary()
    {
      return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name =n;
    }




}

public class custom_classPractice1 {
    public static void main(String[]args)
    {
       employee1 vidhi= new employee1();
       employee1 abhi= new employee1();

       //setting the attributes
        vidhi.salary= 1200;
        vidhi.name= "vid";

        abhi.salary=1300;


        //printing the attributes
         int salary= abhi.getSalary();
        System.out.println(salary);
        abhi.setName("ABHHIII");
        System.out.println(abhi.getName());

        String name=vidhi.getName();
        System.out.println(name);
    }
}
