package com.Bridgelabz.Regex;

public class PasswordUc7 {
    public static void main(String args[])
    {
        String name = "Minal5*";
        System.out.println((name.matches("[A-Za-z\\d{1,}@$!%*?&]{8,}")));
    }
}
