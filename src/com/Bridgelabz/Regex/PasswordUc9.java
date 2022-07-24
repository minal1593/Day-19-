package com.Bridgelabz.Regex;

public class PasswordUc9 {

    public static void main(String args[])
    {
        String name = "Minal15*";
        System.out.println((name.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$")));
    }
}
