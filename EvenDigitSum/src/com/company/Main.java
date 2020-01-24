package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum = " + getEvenDigitSum(123456789));
    }

    public static int getEvenDigitSum(int num) {
        if (num < 0)
            return -1;
        int lastDigit = 0;
        int sum = 0;
        while (num > 0) {
            lastDigit = (num % 10);
            num /= 10;
            if (lastDigit % 2 == 0) {
                System.out.println("even digit: "+ lastDigit);
                sum += lastDigit;
            }
        }
        return sum;
    }
}
