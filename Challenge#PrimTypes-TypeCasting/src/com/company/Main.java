package com.company;

public class Main {

    public static void main(String[] args) {

        byte myByte = 127;
        short myShort = 32000;
        int myInt = 23402321;
        long myLong = 50000L + (10L * (myByte + myShort + myInt));
        System.out.println(myLong);
        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));
        System.out.println(shortTotal);
    }
}
