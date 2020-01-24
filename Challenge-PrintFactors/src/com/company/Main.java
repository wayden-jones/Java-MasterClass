package com.company;

public class Main {

    public static void main(String[] args) {
        printFactors(200);
    }

    public static void printFactors(int number) {
        String factors = "";
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                //System.out.println("Factor: " + i);
                factors = (factors + i + " ");
            }
        }
        System.out.println(factors);
    }
}
