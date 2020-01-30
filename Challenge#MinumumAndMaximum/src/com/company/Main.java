package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0, max = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter number: ");
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (first) {
                    max = min = num;
                    first = false;
                }
                if (num < min)
                    min = num;
                if (num > max)
                    max = num;

            } else {
                System.out.println("Invalid Number");
                scanner.nextLine();
                break;
            }
        }
        System.out.println("Max: " + max + " ______ Min: " + min);
        scanner.close();
    }
}
