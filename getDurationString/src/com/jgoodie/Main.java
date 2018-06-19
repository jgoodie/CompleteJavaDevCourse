package com.jgoodie;

public class Main {
    // Constant to use for the invalid value return value
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }
    private static String getDurationString(long minutes, long seconds){
        if ((seconds < 0) || (seconds > 59) || (minutes < 0)){
            return INVALID_VALUE_MESSAGE;
        }
        else {
            long remainderMins = minutes%60;
            long hours = (minutes - remainderMins)/60;
            return hours + "h " + remainderMins + "m " + seconds + "s";
        }
    }
    private static String getDurationString(long seconds){
        if (seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        else {
            long remainderSecs = seconds%60;
            long minutes = (seconds - remainderSecs)/60;
            return getDurationString(minutes, remainderSecs);
        }
    }
}
