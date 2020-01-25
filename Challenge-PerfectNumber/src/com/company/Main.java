package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
    }

    public static boolean isPerfectNumber(int x) {
        if (x < 1)
            return false;
        int factorSum = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                System.out.println("Factor: " + i);
                factorSum += i;
            }
        }
        System.out.println("factorSum: " + factorSum);
        return factorSum == x;
    }
}
