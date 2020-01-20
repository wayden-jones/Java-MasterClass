package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println(" 1 + 2 = " + result);
        int prevResult = result;
        System.out.println("PrevResult = " + prevResult);
        result = result - 1;
        System.out.println(" 3 - 1 = " + result);
        System.out.println("prevResult = " + prevResult);

        result = result * 10; //2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; //20 * 5 = 24
        System.out.println("20 / 5 = " + result);

        result = result % 3; //4 % 3 = 1
        System.out.println("4 % 3 = " + result);


        // result = result + 1;
        result++; // result + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // result - 1 = 1
        System.out.println("2 - 1 = " + result);

        result+= 2; // result + 2 = 3
        System.out.println("1 + 2 = " + result);

        result*= 10; // result * 10 = 30
        System.out.println("3 * 10 = " + result);

        result/= 3; // result / 3 = 10
        System.out.println("30 / 3 = " + result);

        result-= 2; // result - 2 = 8
        System.out.println("10 - 2 = " + result);


        boolean isAlien = false;
        if(isAlien == false || true) {
            System.out.println("It is not an alien!");
        }

        double myDouble = 20.00d;
        double myOtherDub = 80.00d;
        double myResult = (myDouble + myOtherDub)*100.00d;
        System.out.println("My total result = " + myResult);
        double myRemainder = myResult % 40.00d;
        System.out.println("my remainder = " + myRemainder);
        boolean isNoRemainder = myRemainder == 0;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if(!isNoRemainder)
            System.out.println("Got some remainder");

    }
}
