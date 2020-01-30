package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;

        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("SUM = " + sum + " AVG = " + Math.round((double)sum/(double)count));
                break;
            }
            count++;
            sum += scanner.nextInt();

        }
    }

}
