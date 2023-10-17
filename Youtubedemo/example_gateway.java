package Youtubedemo;

public class example_gateway
{
    public static String upper1(String s) {
        String[] s1 = s.split(" ");
        int i;
        String s2 = "";
        for (i = 0; s1.length> i; i++) {
            s1[i] = s1[i].substring(0, 1).toUpperCase() + s1[i].substring(1);
            s2 += s1[i] + " ";
        }
        return s2;
    }
    public static void main(String[] args) {
        String s = "hello world how are you";
        System.out.println(upper1(s));
    }
}
