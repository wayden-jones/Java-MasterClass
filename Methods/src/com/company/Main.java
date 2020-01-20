package com.company;

public class Main {

    public static void main(String[] args) {
//
//        int firstScore = calculateScore(true, 800, 100, 5);
//        System.out.println("Your final score was " + firstScore);
//        int secondScore = calculateScore(true, 10000, 200, 8);
//        System.out.println("Your final score was " + secondScore);

        displayHighScorePosition("Jack", 1500);
        displayHighScorePosition("Jacky", 900);
        displayHighScorePosition("Jackie", 400);
        displayHighScorePosition("Jackson", 50);

    }

    public static void displayHighScorePosition(String name, int score) {

        int position = calculateHighScorePosition(score);

        System.out.println(name + " managed to get into position " + position + " on the highScore table");

    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (1000 <= score) {
            position = 1;
        } else if (500 <= score) {
            position = 2;
        } else if (100 <= score) {
            position = 3;
        }
        return position;
    }

    public static int calculateScore(boolean isGameOver, int score, int bonus, int levelCompleted) {
        if (isGameOver) {
            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}