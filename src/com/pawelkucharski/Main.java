package com.pawelkucharski;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String word = "kajak";
        System.out.println(couldBePallindrome(word));
    }

    public static char[] StringToCharArray(String word){
        char[] wordCharArray = word.toCharArray();
        return wordCharArray;
    }

    public static boolean couldBePallindrome(String word){
        char[] wordCharArray = StringToCharArray(word);

        boolean isPalindrome = true;
        int counter = 0;
        for(int i = 0; i < wordCharArray.length; i++) {
            char temp = wordCharArray[i];
            int counterSameChar = 0;
            for(int j = 0; j < wordCharArray.length; j++){
                if(temp == wordCharArray[j]){
                    counterSameChar++;
                }
            }
            if(!isEvenNumber(counterSameChar)){
                counter++;
            }
        }

        if(counter > 1){
            isPalindrome = false;
        }
        return isPalindrome;
    }

    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }

}
