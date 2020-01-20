package com.company;

public class Main {

    public static void main(String[] args) {
//        int newScore = calculateScore("Tim", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);
//        calculateScore();

        double centimeters = calcFeetAndInchesToCentimeters(-157);
        if(centimeters < 0.0){
            System.out.println("Invalid data entered");
            return;
        }
        System.out.println( centimeters + " cm");


    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
        if(feet < 0 || inches < 0 || inches > 12)
            return -1;
        double result = (feet * 12 * 2.54) + (inches * 2.54) ;
        System.out.println(feet + " feet, " + inches +" inches = " + result + " cm");
        return result;
    }

    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        if(inches < 0)
            return -1;
        double remainingInches = inches % 12;
        double feet = (inches - remainingInches)/12;
        System.out.println(inches + " inches = " + feet +" feet, " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }



















    public static int calculateScore(String playerName, int score)
    {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score)
    {
        System.out.println("Unnamed player " + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore()
    {
        System.out.println("No player name, no player score");
        return 0;
    }

}
