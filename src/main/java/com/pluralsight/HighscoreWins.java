package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighscoreWins {

    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        //Scanner variable
        String userText;

        //Preset score text
        String fullGameScoreText = "Home:Visitor|";

        //Prompts for Home & Visitor scores
        int homeScore;
        System.out.println("Enter Home score: ");
        userText = userInput.nextLine();
        homeScore = Integer.parseInt(userText);

        int visitorScore;
        System.out.println("Enter Visitor score: ");
        userText = userInput.nextLine();
        visitorScore = Integer.parseInt(userText);

        //Combining
        fullGameScoreText = fullGameScoreText + homeScore + ":" + visitorScore;
        System.out.println(fullGameScoreText);
        String[] fullGameScoreTextSplit = fullGameScoreText.split(Pattern.quote("|"));
        String[] teamNames = fullGameScoreTextSplit[0].split(Pattern.quote(":"));
        String[] teamScores = fullGameScoreTextSplit[1].split(Pattern.quote(":"));
        homeScore = Integer.parseInt(teamScores[0]);
        visitorScore = Integer.parseInt(teamScores[1]);

        //Determining winner
        if (homeScore > visitorScore) {
            System.out.println("Winner: " + teamNames[0] + "\nScore: " + homeScore);
        } else if (visitorScore > homeScore) {
            System.out.println("Winner: " + teamNames[1] + "\nScore: " + visitorScore);
        } else {
            System.out.println("TIE");
        }


        //Scanner Close
        userInput.close();
    }

}
