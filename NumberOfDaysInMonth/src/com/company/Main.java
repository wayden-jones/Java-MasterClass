package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(11, 2001));
    }

    public static int getDaysInMonth(int month, int year) {
        LeapYear myLeapYear = new LeapYear();
        if (month < 1 || month > 12 || year < 1 || year > 9999)
            return -1;

        switch (month) {
            case 9: case 4: case 6: case 11:
                return 30;
            case 2:
                if(myLeapYear.isLeapYear(year))
                    return 29;
                else
                    return 28;
            default:
                return 31;
        }
    }
}
