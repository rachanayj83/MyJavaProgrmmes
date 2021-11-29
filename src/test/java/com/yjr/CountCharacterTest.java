package com.yjr;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountCharacterTest {


    CountCharacter cc = new CountCharacter();
    @Test
    public void CheckCharacterOccuranceCount(){
        assertEquals(1,cc.countOccurances("Testing",'e'));

    }

    public void CheckCharacterOccuranceCount1(){
        assertEquals(2,cc.countOccurances_1("Java",'a',0));

    }

    public void CheckCharacterOccuranceCount2(){
        assertEquals(0,cc.countOccurances("Testing",'z'));

    }

}