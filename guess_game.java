package com.company;
import java.util.Random;
import java.util.Scanner;

class game {
    public int number;
    public int userinput;
    public int noofguesses= 0;

    public int getNoofguesses()
    {
        return noofguesses;
    }
    public void setNoofguesses(int noofguesses)
    {
        this.noofguesses=noofguesses;
    }

     game() {
        Random random = new Random();
         this.number = random.nextInt(100);
    }

     void takinguserinput() {
         System.out.println("guess the number");
        Scanner sc = new Scanner(System.in);
        userinput = sc.nextInt();


    }

    boolean iscorrectno() {
        noofguesses++;
        if (userinput==number) {
            return true;
        } else if (userinput<number) {
            System.out.println("too low...");
        } else if ( userinput>number) {
            System.out.println("too high..");
        }
        return false;

    }



}

public class guess_game {
    public static void main(String[]args)
    {
       game g = new game();
        boolean b= false;
        while(!b) {
            g.takinguserinput();
            b = g.iscorrectno();
        }

    }
}
