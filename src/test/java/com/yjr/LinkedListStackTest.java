package com.yjr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LinkedListStackTest {

    LinkedListStack linkedListStack = new LinkedListStack();

    @Test

    public void CheckThatSizeIsFive() {
        // inserting 1,2,3,4 and 5 into the stack
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        linkedListStack.push(4);
        linkedListStack.push(5);
        assertEquals(5,linkedListStack.length());

    }

    @Test
    public void CheckThatTopElementIs2() {
        linkedListStack.push(1);
        linkedListStack.push(2);
        assertEquals(2, linkedListStack.peek());
    }


    @Test
    public void CheckThatSizeIsFour() {
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        linkedListStack.push(4);
        linkedListStack.pop();        // removing the top element (4)
        assertEquals(3, linkedListStack.length());
    }

    @Test
    public void CheckThatPoppedElementIsThree() {
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        assertEquals(3, linkedListStack.pop());
    }


    @Test
    public void CheckIfStackIsEmpty() {
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        linkedListStack.pop();
        linkedListStack.pop();
        linkedListStack.pop();
        assertTrue(linkedListStack.isEmpty());
    }
}
