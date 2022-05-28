package com.Kamis83;

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
}
