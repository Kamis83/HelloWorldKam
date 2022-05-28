package com.Kamis83;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GamesTest {

    @Test
    void countLengthOfSentence() {

        //given
        String sentence = "Ania chodzi do domu";
        int length;

        // when
        length = sentence.length();

        //then
        assertEquals(19,length);
    }

    @Test
    void countNumberOfWords() {
        //given
        String sentence = "Ania chodzi do domu";
        int numberOfWords;

        // when
        String[] words = sentence.split("\\s+");
                numberOfWords = words.length;

        //then
        assertEquals(4,numberOfWords);
    }

    @Test
    void showSeparateLetters() {

        //given
        String sentence = "Ania ";
        char[]letters;


        // when
        letters = sentence.toCharArray();
        for (int i = 0; i < sentence.length() ; i++) {
            System.out.println( letters[i]);
        }


        //then
        assertEquals('A',letters[0]);
    }
}