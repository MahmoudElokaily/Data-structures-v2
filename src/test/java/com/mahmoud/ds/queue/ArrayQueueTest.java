package test.java.com.mahmoud.ds.queue;

import main.java.com.mahmoud.ds.linear.queue.ArrayQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayQueueTest {

    private ArrayQueue<Integer> queue;

    @BeforeEach
    void setUp() {
        queue = new ArrayQueue<>();
    }

    @Test
    void enqueueAndDequeue_shouldWorkCorrectly() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test
    void size_shouldReflectNumberOfElements() {
        queue.enqueue(1);
        queue.enqueue(2);

        assertEquals(2, queue.size());
        queue.dequeue();
        assertEquals(1, queue.size());
    }

    @Test
    void peek_shouldReturnFrontElement() {
        queue.enqueue(5);
        queue.enqueue(6);

        assertEquals(5, queue.peek());
        assertEquals(2, queue.size());
    }
}
