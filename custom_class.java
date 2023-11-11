package com.company;

       class employee{
           int id;
           int salary;
           String name;

           public void printDetails() //method
           {
               System.out.println("my id is " + id);
               System.out.println("my name is "+ name);
           }
           public int getSalary()
           {
               return salary;
           }
       }

public class custom_class {
    public static void main(String[]args)
    {
      System.out.println("this is our custom class");
      employee diya= new employee();//instantiating a new employee object
        employee harry= new employee();
         //setting attributes for diya
        diya.id=12;
        diya.salary=340;
        diya.name="codewithharry";

        //setting attributes for harry
        harry.id=13;
        harry.salary= 350;
        harry.name= "HARRY";

        //printing the attributes

           diya.printDetails();
           harry.printDetails();
           int salary= harry.getSalary();
        System.out.println(salary);
       // System.out.println(diya.id);
        //System.out.println(diya.name);
    }
}
