package com.Kamis83;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("---------------------------------");
        System.out.println("***** This is a app for fun *****");
        System.out.println("---------------------------------");
        System.out.println(" Please think about the sentence ");
        System.out.println("  and write down to the console  ");
        System.out.println("");
        // Ustawienie zdania
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        Welcome welcome = new Welcome(sentence);
        System.out.println("");
        System.out.println("You wrote this sentence: " + welcome.getWelcome());

        // Część wykonująca opcje
        OptionSelect optionSelect = new OptionSelect(sentence);
        optionSelect.numberOfTries();


    }
}