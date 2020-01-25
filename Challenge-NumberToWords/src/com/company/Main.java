package com.company;

public class Main {

    public static void main(String[] args) {
        numberToWords(120000);
    }
    public static int getDigitCount(int number){
        if(number < 0)
            return -1;
        int count = 0;
        if(number == 0)
            return count+1;
        while(number > 0)
        {
            count++;
            number /= 10;
        }
        return count;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int numberRev = reverse(number);
        int digitCount = getDigitCount(number);
        String myWord = "";
        while (numberRev > 0) {
            digitCount--;
            int last = numberRev % 10;
            switch (last) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            numberRev /= 10;

        }
        for(int i = 0; i < digitCount; i++)
            System.out.println("Zero");
    }

    public static int reverse(int number) {
        int reverseNum = 0;
        while (number != 0) {
            reverseNum += number % 10;
            reverseNum *= 10;
            number /= 10;
        }
        return reverseNum/10;
    }
}
