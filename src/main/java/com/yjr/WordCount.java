package com.yjr;

import java.util.StringTokenizer;

public class WordCount {

    // Word count in a sentence using StringTokenizer
    public int wordcount(String str) {
        StringTokenizer token1 = new StringTokenizer(str);
        return token1.countTokens();
    }

    // Word count in a sentence using split() method
    public int wordcount1(String str) {
        return str.split("\\s+").length;
    }

    // Word count in a sentence using loop
    public int wordcount2(String str) {
        int count = 0;
        String flag = "Space";

        for(int i =0; i < str.length(); i++){
            if(Character.isLetter(str.charAt(i)) && flag.equals("Space")){
                flag = "word";
                count++;
            } else if (Character.isSpaceChar(str.charAt(i))) flag = "Space";

        }
        return count;
    }


}
