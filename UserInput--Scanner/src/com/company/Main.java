package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your DOB: ");

        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int YOB = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2020 - YOB;
            if (age >= 0 && age <= 100)
                System.out.println("Your name is " + name + " and you are " + age + " years old.");
            else
                System.out.println("Invalid year of birth");
        } else {
            System.out.println("Unable to parse year of birth");
        }
        scanner.close();
    }
}
