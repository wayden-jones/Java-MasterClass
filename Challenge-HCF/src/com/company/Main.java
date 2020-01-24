package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(20, 400));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }
        int hcf = 0, limit = 0;
        if(first > second)
            limit = second;
        else
            limit = first;
        for(int i = 1; i <= limit; i++)
        {
            System.out.println("looping: "+ i);
            if(first % i == 0 && 0 == second % i){
                hcf = i;
            }
        }
        return hcf;
    }
}
