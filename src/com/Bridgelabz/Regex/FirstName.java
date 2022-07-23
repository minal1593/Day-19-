package com.Bridgelabz.Regex;

public class FirstName {
    public static void main(String args[])
    {
        String name = "Minal";
        System.out.println((name.matches("[A-Z][a-z]{2,}")));
    }
}
