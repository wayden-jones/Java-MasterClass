package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 32));
    }
    public static boolean hasSharedDigit(int x, int y)
    {
        if(x > 99 || x < 10 || y > 99 || y < 10)
            return false;
        int firstX, secondX, firstY, secondY = 0;
        secondX = x%10;
        secondY = y%10;
        firstX = x/10;
        firstY = y/10;
        if(firstX == firstY || firstX == secondY || secondX == firstY || secondX == secondY)
            return true;
        else
            return false;
    }
}
