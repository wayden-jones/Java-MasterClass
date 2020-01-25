package com.company;

public class Main {

    public static void main(String[] args) {
        //System.out.println(isPrime(49));
        System.out.println(getLargestPrime(45));
    }
    // Start at the number below the given number then do a search down for factors
    // check the found factors for primeness
    // return the first (largest) factor that is prime

    public static int getLargestPrime(int num) {
        for (int i = num; i > 1; i--) {
            if (num % i == 0) {
                boolean isPrime = true;
                for (int j = i - 1; j > 1; j--) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime)
                    return i;
            }
        }
        return -1;
    }
}
