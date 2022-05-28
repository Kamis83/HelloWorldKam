package com.Kamis83;

import java.util.Locale;
import java.util.Scanner;

public class Games extends Welcome {
    public Games(String welcome) {
        super(welcome);
    }

    int countLengthOfSentence() {
        int length = getWelcome().length();
        System.out.println("The length of the sentese is : " + length);
        return length;
    }

    int countNumberOfWords() {
        String[] words = getWelcome().split("\\s+");
        System.out.println("Number of words is: " + words.length);
        return words.length;
    }

    void showSeparateLetters() {
        char[] letters = getWelcome().strip().toCharArray();
        System.out.println("The sentence has got these letters:");
        for (char letter : letters) {
            System.out.print(letter + " ");
        }
    }

    void numberOfSomeLetter() {
        System.out.println(" Enter the letter for the number of  ");
        System.out.println(" appearances you want to know :");

        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();
        char example = letter.toLowerCase().charAt(0);
        String sentence = getWelcome();
        int numberOfLetter = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == example)
                numberOfLetter++;
        }
        System.out.println(" Letter " + "\"" + example + "\"" + " appears " + numberOfLetter + " times in the sentence");
    }
}








