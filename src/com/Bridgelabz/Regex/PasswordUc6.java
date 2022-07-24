package com.Bridgelabz.Regex;

public class PasswordUc6 {
    public static void main(String args[])
    {
        String name = "Mina15*";
        System.out.println((name.matches("[A-Z+a-z\\d@$!%*?&]{8,}")));
    }
}

