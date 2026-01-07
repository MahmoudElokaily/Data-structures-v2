package test.java.com.mahmoud.ds.queue;

import main.java.com.mahmoud.ds.linear.queue.LinkedQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedQueueTest {

    private LinkedQueue<Integer> queue;

    @BeforeEach
    void setUp() {
        queue = new LinkedQueue<>();
    }

    @Test
    void enqueueAndDequeue_shouldWorkCorrectly() {
        queue.enqueue(10);
        queue.enqueue(20);

        assertEquals(10, queue.dequeue());
        assertEquals(20, queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test
    void peek_shouldReturnFirstElement() {
        queue.enqueue(7);
        queue.enqueue(8);

        assertEquals(7, queue.peek());
        assertEquals(2, queue.size());
    }
}
