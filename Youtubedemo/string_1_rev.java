package Youtubedemo;//write a program to reverse the string.
public class string_1_rev {
    public static void main(String[] args) {
        StringBuilder s= new StringBuilder("HELLOhowAREyou");
        String s1="hellohowareyou";
        for(int i=0;i<s.length()/2;i++)
        {
            int front=i;
            int back=s.length()-1-i;
            char   frontch= s.charAt(front);
            char   backch= s.charAt(back);

            System.out.print(frontch);
            System.out.println(backch);

            s.setCharAt(front,backch);
            s.setCharAt(back,frontch);
        }
        System.out.println(s);
    }
}
