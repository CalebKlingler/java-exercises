package org.launchcode.java.demos.java4python;

import java.util.ArrayList;
import java.util.Arrays;

public class FiveLetters {
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<>(Arrays.asList("crazy", "apple", "cat","dog","paint", "classes"));
        int five_letter_words = fiveLetterWords(words);
        System.out.println("There are " + five_letter_words + " five letter words in the list");

    }
    public static int fiveLetterWords(ArrayList<String> list){
        int count = 0;
        for (String word : list ){
            if (word.length()==5){
                System.out.println(word);
                count ++;
            }

        }
        return count;

    }
}
