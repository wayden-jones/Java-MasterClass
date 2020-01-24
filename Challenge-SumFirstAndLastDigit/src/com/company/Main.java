package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5452));
    }
    public static int sumFirstAndLastDigit(int num)
    {
        if(num < 0)
            return -1;
        int lastDigit = num % 10;
        int myNum = num;
        int firstDigit = 0;
        while(num > 0)
        {
            if(myNum/10 == 0) {
                firstDigit = myNum;
                break;
            }
            myNum /= 10;
        }
        System.out.println("first: " + firstDigit + " last: " + lastDigit);
        return (firstDigit + lastDigit);
    }
}
