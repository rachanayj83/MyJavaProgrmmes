package com.yjr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Stack class.
 */
public class StackTest {

    Stack stack = new Stack(5);

    @Test
    public void CheckThatSizeIsFive() {
        // inserting 1,2,3,4 and 5 into the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertEquals(5, stack.size());
    }

    @Test
    public void CheckThatTopElementIs2() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.peek());
    }



    @Test
    public void CheckThatSizeIsFour() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();        // removing the top element (4)
        assertEquals(3, stack.size());
    }

    @Test
    public void CheckThatPoppedElementIsOne() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop());
    }


    @Test
    public void CheckIfStackIsEmpty() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty());


    }

}