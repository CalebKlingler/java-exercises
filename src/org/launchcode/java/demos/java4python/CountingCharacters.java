package org.launchcode.java.demos.java4python;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class CountingCharacters {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String my_string = in.nextLine();
        HashMap<Character, Integer> final_hash = countCharacters(my_string);
        for (Map.Entry<Character,Integer> character : final_hash.entrySet()){
            System.out.println(character.getKey() + "(" + character.getValue() + ")");
        }

    }
    public static HashMap<Character, Integer> countCharacters(String myString){
        char[] charactersInString = myString.toCharArray();
        HashMap<Character, Integer> chars = new HashMap<>();
        for (Character current_char : charactersInString){
            if (!Character.isAlphabetic(current_char)){
                continue;
            }
            Character cased_char = Character.toLowerCase(current_char);
            if (!chars.containsKey(cased_char)){
                chars.put(cased_char,1);
                continue;
            }
            else{
                Integer count = chars.get(cased_char);
                count ++;
                chars.put(cased_char,count);
            }
        }
        return chars;


    }
}
