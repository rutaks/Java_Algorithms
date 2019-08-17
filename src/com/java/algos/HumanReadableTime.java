package com.java.algos;

//A function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)
public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secs = seconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, secs);
    }
}
