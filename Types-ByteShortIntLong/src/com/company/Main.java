package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
        int myVal = 10000;
        int myMaxIntVal = Integer.MAX_VALUE;
        int myMinIntVal = Integer.MIN_VALUE;
        System.out.println("integer max value = " + myMaxIntVal);
        System.out.println("integer min value = " + myMinIntVal);
        System.out.println("Busted max value = " + (myMaxIntVal + 1));
        System.out.println("Busted min value = " + (myMinIntVal - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("min value of byte = " + myMinByteValue);
        System.out.println("max value of byte = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("min value of short = " + myMinShortValue);
        System.out.println("max value of short = " + myMaxShortValue);
        
        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("min value of Long = " + myMinLongValue);
        System.out.println("max value of Long = " + myMaxLongValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntVal/2);

        byte myNewByteValue = (byte) (myMaxByteValue/2);

        short myNewShortValue = (short) (myMinShortValue/2);

        
     }
}
