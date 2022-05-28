package com.Kamis83;

import java.util.Scanner;

public class OptionSelect extends Games {
    public OptionSelect(String welcome) {
        super(welcome);
    }

    void numberOfTries() {
        ListOfThingsCanDo listOfThingsCanDo = new ListOfThingsCanDo();
        listOfThingsCanDo.showThingsCanDo();

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Firstly choose how many games you want to play");
        int numberOfTries = scanner.nextInt();
        System.out.println("Secoundly choose which off the game listed before are you interested in. Press from 1 to 3" + "");

        for (int i = 0; i < numberOfTries; i++) {
            optionSelect();
        }
    }


    void optionSelect() {
        Scanner scannerChoice = new Scanner(System.in);
        int choice = scannerChoice.nextInt();
        Games games = new Games(super.welcome);
        switch (choice) {
            case 1:
                games.countLengthOfSentence();
                break;
            case 2:
                games.countNumberOfWords();
                break;
            case 3:
                games.showSeparateLetters();
                break;
        }
    }
}
