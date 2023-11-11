package com.company;

public class String_practice3 {
    public static void main(String[]args)
    {
        String letter = "Dear <|name|> , thanks a lot!";
        System.out.println(letter);
        String greet = letter.replace("<|name|>", "vidhi");
        System.out.println(greet);
    }
}
