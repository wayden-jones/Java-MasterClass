package com.company;

public class Main {
    public static boolean isLeapYear(int year) {
        if (year > 9999 || year < 1)
            return false;
        if(!(year % 4 == 0))
            return false;
        if(!(year % 100 == 0))
            return true;
        if(!(year % 400 == 0))
            return false;
        return true;
    }

    public static void main(String[] args) {
        
    }
}
