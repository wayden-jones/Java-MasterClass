package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (count < 10) {
            System.out.println("Enter number #" + (count + 1));
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                scanner.nextLine();
                count++;
            } else {
                System.out.println("Enter valid Integer!");
                scanner.nextLine();
            }

        }
        System.out.println("Sum of retrieved numbers: " + sum);
        scanner.close();
    }
}
