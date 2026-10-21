package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HighscoreWins {

    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        String userText;

        String fullGameScoreText = "Home:Visitor|";

        int homeScore;
        System.out.println("Enter Home score: ");
        userText = userInput.nextLine();
        homeScore = Integer.parseInt(userText);

        int visitorScore;
        System.out.println("Enter Visitor score: ");
        userText = userInput.nextLine();
        visitorScore = Integer.parseInt(userText);

        fullGameScoreText = fullGameScoreText + homeScore + ":" + visitorScore;
        System.out.println(fullGameScoreText);

        //LocalDate day = LocalDate.parse(userText);
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("");

    }


}
