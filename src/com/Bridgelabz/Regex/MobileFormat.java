package com.Bridgelabz.Regex;

public class MobileFormat {
    public static void main(String args[])
    {
        String name = "91 9919819801";
        System.out.println((name.matches("\\d{2,3}\\s\\d{10}")));
    }
}
