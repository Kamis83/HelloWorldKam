package com.Kamis83;

import static org.junit.jupiter.api.Assertions.*;

class OptionSelectTest {

    @org.junit.jupiter.api.Test
    void numberOfTries() {

        //given
        int expected;
        int numberOfTries = 4;

        for (int i = 0; i < numberOfTries; i++) {
        }
        assertEquals(4,numberOfTries);

    }

    @org.junit.jupiter.api.Test
    void optionSelect() {
        //given
        int choice = 2;
        int result = 0;
        //when
        switch (choice) {
            case 1:
               result = 2 ;
                break;
            case 2:
                 result = 4;
                break;
            case 3:
                result = 7;
                break;
        }
        //then
        assertEquals(4,result);

    }
}