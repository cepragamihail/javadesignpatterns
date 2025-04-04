package com.java.practical.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeConversation {

    public static void main(String[] args) throws IOException {
        timeConversion();
    }



    public static void timeConversion() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputTimeString = bufferedReader.readLine();
        String convertedTime = timeConverionAMPMTo24Format(inputTimeString);
        System.out.println(convertedTime);

        System.out.println(1/3);

    }

    public static String timeConverionAMPMTo24Format(String amPMTimeFormat) {

        String [] timeArray = amPMTimeFormat.split(":");
        if (amPMTimeFormat.endsWith("PM") && !timeArray[0].equals("12")) {
            timeArray[0] = String.valueOf(Integer.valueOf(timeArray[0]) + 12);
           }
        if (amPMTimeFormat.endsWith("AM") && timeArray[0].equals("12")) {
                timeArray[0] = "00";
           }

        return String.format("%s:%s:%s", timeArray[0], timeArray[1], timeArray[2].substring(0,2));
    }

}
