package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));

    }

    private static String getDurationString(long minutes, long seconds){
        if(minutes < 0 || seconds < 0 || seconds > 59)
            return INVALID_VALUE_MESSAGE;
        long remainingMins = minutes % 60;
        long hours = minutes/ 60;
        String hoursString = hours + "h";
        if(hours < 10)
            hoursString = "0" + hoursString;

        String minsString = remainingMins + "m";
        if(remainingMins < 10)
            minsString = "0" + minsString;

        String secondsString = seconds + "s";
        if(seconds < 10)
            secondsString = "0" + secondsString;

        return (hoursString+minsString+secondsString);
    }

    private static String getDurationString(long seconds){
        if(seconds <= 0)
            return INVALID_VALUE_MESSAGE;
        long remainingSecs = seconds % 60;
        long minutes = seconds/ 60;
        return getDurationString(minutes, remainingSecs);
    }
}
