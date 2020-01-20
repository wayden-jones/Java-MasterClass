package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void convert()
    {
        double ratio = 0.45359237;
        double pounds = 200d;
        double result = ratio*pounds;
        System.out.println("Result = " + result + " kg");
    }

    public static void main(String[] args) {

        convert();

//        float myMinFloatValue = Float.MIN_VALUE;
//        float myMaxFloatValue = Float.MAX_VALUE;
//        System.out.println("Float Max value = " + myMaxFloatValue);
//        System.out.println("Float Min value = " + myMinFloatValue);
//
//        double myMinDoubleValue = Double.MIN_VALUE;
//        double myMaxDoubleValue = Double.MAX_VALUE;
//        System.out.println("Double Max value = " + myMaxDoubleValue);
//        System.out.println("Double Min value = " + myMinDoubleValue);
//
//        int myIntVal = 5/3;
//        float myFloatVal = 5f /3f;
//        double myDoubleVal = 5.0 / 3.0;
//        System.out.println("MyIntValues = " + myIntVal);
//        System.out.println("My Float Value = " + myFloatVal);
//        System.out.println(("MyDoubleValue = " + myDoubleVal));
//
    }
}
