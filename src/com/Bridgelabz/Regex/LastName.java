package com.Bridgelabz.Regex;

public class LastName {
    public static void main(String args[])
    {
        String name = "Salunkhe";
        System.out.println((name.matches("[A-Z][a-z]{2,}")));
    }
}
