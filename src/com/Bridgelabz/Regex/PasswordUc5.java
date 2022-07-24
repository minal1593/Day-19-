package com.Bridgelabz.Regex;

public class PasswordUc5 {


    public static void main(String args[])
    {
        String name = "Minal15*";
        System.out.println((name.matches("[A-Za-z\\d@$!%*?&]{8,}$")));
    }
}


