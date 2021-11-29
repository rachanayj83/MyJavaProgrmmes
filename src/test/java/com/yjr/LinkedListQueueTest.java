package com.yjr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListQueueTest {

    LinkedListQueue llq = new LinkedListQueue();

    @Test
    public void CheckThatSizeIsFive() {
        // inserting 1,2,3,4 and 5 into the queue
        llq.insertLast(1);
        llq.insertLast(2);
        llq.insertLast(3);
        llq.insertLast(4);
        llq.insertLast(5);
        assertEquals(5, llq.size());
    }

    @Test
    public void CheckThatSizeIsThree() {
        llq.insertLast(1);
        llq.insertLast(2);
        llq.insertLast(3);
        llq.insertLast(4);
        llq.insertLast(5);
        // deleting  1,2,3,from queue
        llq.removeFirst();
        llq.removeFirst();
        llq.removeFirst();
        assertEquals(2, llq.size());
    }
}
