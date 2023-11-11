package com.company;

class NegativeException extends Exception
{
    public String toString()
    {
        return "negative number occured";
    }

    public String getMessage()
    {
        return "enter non negative number";
    }
}

public class exception_throw_throws {
      public static double area(int r) throws NegativeException
      {
          if(r<0)
          {
              throw new NegativeException();
          }
          double result = Math.PI * r * r;
          return result;
      }





    public static int divide(int a, int b) throws ArithmeticException
    //made by harry
    {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        //shivam = uses divide function created by harry
        try {
     //      int c =  divide(5, 0);
            double ar = area(-2);
            System.out.println(ar);

        } catch (Exception e) {
            System.out.println("exception occured");
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
