package com.company;
  class square   //class
  {
      int side;
      public int area()  //method
      {
          return side*side;
      }
      public int perimeter()
      {
          return 4*side;
      }
  }

public class custom_classPractice3 {
        public static void main(String[]args)
        {
            square sq = new square();
            sq.side=5;
            System.out.println(sq.area());
            System.out.println(sq.perimeter());
        }

}
