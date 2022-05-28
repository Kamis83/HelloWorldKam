package com.Kamis83;
import java.util.*;

public class ListOfThingsCanDo {
    Map <Integer,String> showThingsCanDo() {
        Map<Integer, String> thingsCanDo = new HashMap<>();
        thingsCanDo.put(1, "If you want to check the length of the sentence.");
        thingsCanDo.put(2, "If you want to check number of words in a sentence.");
        thingsCanDo.put(3, "if you want to know what kind of separate letters are in your sentence.");

        System.out.println("Below you'll see the gamelist");
        System.out.println(" ");
        Set<Map.Entry<Integer, String>> entries = thingsCanDo.entrySet();
        Iterator<Map.Entry<Integer, String>> thingsCanDoIterator = entries.iterator();

        while (thingsCanDoIterator.hasNext()) {
            Map.Entry<Integer, String> entry = thingsCanDoIterator.next();
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
        return thingsCanDo;

    }


}






