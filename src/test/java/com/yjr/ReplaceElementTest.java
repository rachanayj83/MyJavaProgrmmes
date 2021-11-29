package com.yjr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceElementTest {

    ReplaceElement re = new ReplaceElement();

    @Test
    public void checkStringReplaced() {

        assertEquals("NicNakNoe", re.replaceStringElement("TicTakToe", 'T', 'N'));
    }


}