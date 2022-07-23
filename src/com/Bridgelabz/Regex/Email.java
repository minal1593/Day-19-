package com.Bridgelabz.Regex;

public class Email
{
    public static void main(String args[])
    {
        String name = "abc.xyz@bl.co.in";
        System.out.println((name.matches("[a-z]+[./+_]*[a-z]*[@][a-z]+[.][a-z]{2,4}[.][a-z]{2}?")));
    }

}

