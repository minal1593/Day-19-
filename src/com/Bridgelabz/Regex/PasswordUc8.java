package com.Bridgelabz.Regex;

public  class PasswordUc8 {
    public static void main(String args[])
    {
        String name = "Mina15*";
        System.out.println((name.matches("[A-Z+a-z\\d[@$!%*?&]{1}]]{8,}")));
    }
}

