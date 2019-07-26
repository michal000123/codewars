package kyu6.countingDuplicates;

import java.util.ArrayList;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        ArrayList<Character> countingArray = new ArrayList<>();
        text = text.toLowerCase();
        for(int i = 0 ; i < text.length() ; i++) {
            for(int j = i+1 ; j < text.length() ; j++){
                Character currentBase = text.charAt(i);
                if(currentBase.equals(text.charAt(j))){
                    if(!countingArray.contains(currentBase ))
                        countingArray.add(currentBase);
                }
            }
        }

        return countingArray.size();
    }
}