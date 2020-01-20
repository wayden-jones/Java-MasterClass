package com.company;

public class Main {

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0)
            return -1;
       long result = Math.round(kilometersPerHour*0.6213);
       return result;
    }

    public static void printConversion(double kilometersPerHour)
    {
        long myResult = toMilesPerHour(kilometersPerHour);
        if (myResult < 0)
            System.out.println("Invalid Value");
        else
            {
            System.out.println(kilometersPerHour +
                    " km/h = " +
                    myResult +
                    " mi/h"
            );
        }
    }
    public static void main(String[] args) {
	    printConversion(95.75);
    }
}
