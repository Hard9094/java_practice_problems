package Youtubedemo;

public class backtrackting_1 {

    // print 5 to 1
//    public static void printnum(int n){
//        if(n==0){
//            return;
//        }
//        System.out.println(n);
//        printnum(n-1);
//    }
//

    //print sum of n natural numbers
    public static void printsum(int i, int n, int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum +=i;
        printsum(i+1,n,sum);
    }

    // factorial
    public static int fact(int n){
        if(n==1){
            return 1;

        }
        if(n==0){
            return 1;
        }
        int factn1=fact(n-1);
        int factn= n*factn1;
        return factn;
    }


    //fibbonaci
    public static void fibbo(int a, int b ,int n){

        if(n ==0){
            return;
        }
        int next=a+b;
        System.out.print (","+next);
        fibbo(b,next,n-1);

    }
    public static void main(String[] args) {
        //printnum(5);
        //printsum(1,5,0);
        //int factans=fact(5);
        //System.out.println(factans);
        int n=10;
        int a=0,b=1;
        System.out.print(a +",");
        System.out.print(b);
        int newn=n-2;
        fibbo(a,b,newn);
    }
}
