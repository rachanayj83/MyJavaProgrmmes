package com.yjr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCountTest {

    WordCount wc = new WordCount();

    @Test
    public void testWordcount() {
        assertEquals(6,wc.wordcount("This is a sample test case"));
    }

    public void testWordcount1() {
        assertEquals(2,"Hello World!");
    }

    public void testWordcount2() {
        assertEquals(7,"Testing number of words in a sentence");
    }
}