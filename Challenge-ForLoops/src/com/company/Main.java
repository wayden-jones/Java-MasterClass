package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i < 999999999; i++) {
            if (count > 3)
                break;
            if (isPrime(i)) {
//                count++;
                System.out.println(i+ " is a Prime Number");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num == 1)
            return false;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
