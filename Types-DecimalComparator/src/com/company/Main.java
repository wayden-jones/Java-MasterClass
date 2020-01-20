package com.company;


public class Main {

        public static boolean areEqualByThreeDecimalPlaces(double X, double Y)
        {
            int valOne = (int) (X*1000);
            int valTwo = (int) (Y*1000);
            System.out.println(valOne + " " + valTwo);
            if(valOne == valTwo)
                return true;
            return false;
        }

    public static void main(String[] args) {
        // write your code here
        System.out.println(areEqualByThreeDecimalPlaces(3.453, 3.4532));
    }
}
