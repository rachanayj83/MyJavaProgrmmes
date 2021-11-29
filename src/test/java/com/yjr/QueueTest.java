package com.yjr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueTest {

    Queue q = new Queue(5);

    @Test
    public void CheckThatSizeIsFive() {
        // inserting 1,2,3,4 and 5 into the queue
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        assertEquals(5, q.size());
    }

    @Test
    public void CheckThatSizeIsThree() {
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        // deleting  1,2,3,from queue
        q.dequeue();
        q.dequeue();
        q.dequeue();
        assertEquals(2, q.size());
    }

}
