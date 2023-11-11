package com.company;
  class MyMainemployee
  {
      private int id;
       private String name;

       public MyMainemployee()
       {
           id=45;
           name="diya";
       }
      public MyMainemployee(int i,String n)
      {
          id=i;
          name=n;
      }


      public int getid()
      {
          return id;
      }

      public void setid(int n)
      {
          id=n;
      }
       public String getName()
       {
           return name;
       }
       public void setName(String i)
       {
           name= i;
       }
  }

public class constructors {
      public static void main(String[]args)
      {
         MyMainemployee ed = new MyMainemployee();
        // ed.setid(12);
          System.out.println(ed.getid());
          System.out.println(ed.getName());

      }
}
