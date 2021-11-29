package com.yjr;

public class CountCharacter {

    //Using simple approach
    public int countOccurances(String str, char searchedChar){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == searchedChar){
                count++;
                System.out.println("count" + count);
            }
        }
        return count;
    }

    //Using Recursion
    public int countOccurances_1(String someString, char searchedChar, int index) {
        if (index >= someString.length()) {
            return 0;
        }

        int count = someString.charAt(index) == searchedChar ? 1 : 0;
        return count + countOccurances_1(someString, searchedChar, index + 1);

    }


}


