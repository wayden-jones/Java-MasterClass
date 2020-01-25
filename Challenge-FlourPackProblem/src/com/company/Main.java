package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(4, 18, 19));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int limit = bigCount;
        int newBigCount = goal / 5;
        if (newBigCount < bigCount) {
            limit = newBigCount;
        }

        for (int i = 1; i <= limit; i++) {
            goal -= 5;
            System.out.println(goal);
            if (goal == 0)
                return true;
            if (goal < 0)
                return false;
        }
        for (int j = 1; j <= smallCount; j++) {
            goal -= 1;
            System.out.println(goal);
            if (goal == 0)
                return true;
        }
        return false;
    }
}
