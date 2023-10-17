package Youtubedemo;

public class patterns {
    public static void main(String[] args) {

//        for(int i=0;i<5;i++)
//        {
//            for (int j=0;j<5;j++)
//             {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//        for (int i=0;i<5;i++){
//            for(int j=0;j<5;j++){
//                if(i==0 || i==4 || j==4 || j==0)
//                {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.print("\n");

        int row=4;
        int totalnum =0;
        for(int k=0;k<=row;k++){
            totalnum=totalnum +k;
        }
//        System.out.println(totalnum);


            for(int i=1;i<=row;i++){

//                for (int j=1;j<=i;j++){
//                    System.out.print(totalnum + " ");
//                    totalnum -= 1;
//                }

                for (int j=i;j<=i;j++){
                    System.out.print(totalnum + " ");

                }
                System.out.print("\n");
            }




//        for(int i=5;i>0;i--)
//        {
//            for (int j=0;j<i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//        for(int i=1;i<5;i++)
//        {
//            for (int j=0;j<5-i;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int j=0;j<i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }


//        for(int i=1;i<=5;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        int k=1;
//        for(int i=1;i<=5;i++){
//            for (int j=1;j<=i;j++)
//            {
//                System.out.print(k);
//                k=k+1;
//            }
//            System.out.println();
//        }
    }
}
