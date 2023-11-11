package com.company;
import java.util.Scanner;
class MyException extends Exception {
    @Override
    public String toString()
    {
       // return super.toString()+ "i am toString";
        return "i am toString";
    }
    @Override
    public String getMessage()
    {
        return   "i am getMessage";
    }
}
class maxAge extends Exception
{
    @Override
    public String toString()
    {
        return "age is not more than 100";
    }
    @Override
    public String getMessage()
    {
        return "make sure you enter correct age ";
    }
}

public class exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a < 9) {
            try {
      //          throw new MyException();
        //        throw new ArithmeticException("this is an exception");
                throw new maxAge();
            } catch (Exception e) {
                System.out.println(e.getMessage());
          //     System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();     // to know in which line error has occured
                System.out.println("finished");
            }
            System.out.println("end of the program");
        }
    }
}
