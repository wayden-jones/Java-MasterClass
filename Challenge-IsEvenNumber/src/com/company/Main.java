package com.company;

public class Main {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while (number <= finishNumber){
            number++;
            if (!isEven(number)){
                continue; // doesn't execute anymore code in the block. Skips to the next iteration of the loop.
            }
            count++;
            System.out.println("Even number " + number);
            if(count >= 5)
                break;
        }
        System.out.println("Total Even numbers = " + count);

    }
    public static boolean isEven(int n){
        if(n%2==0 && n>0)
            return true;
        return false;
    }
}
