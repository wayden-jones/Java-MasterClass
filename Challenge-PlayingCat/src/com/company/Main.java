package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if(temperature > 45 || temperature < 25)
            return false;
        if(summer)
            return true;
        if(temperature > 35)
            return false;
        return true;
    }

}
