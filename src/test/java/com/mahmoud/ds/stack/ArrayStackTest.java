package test.java.com.mahmoud.ds.stack;

import main.java.com.mahmoud.ds.core.Stack;
import main.java.com.mahmoud.ds.linear.stack.ArrayStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStackTest {

    private Stack<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = new ArrayStack<>();
    }

    @Test
    void newStack_shouldBeEmpty() {
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }

    @Test
    void push_shouldAddElements() {
        stack.push(10);
        stack.push(20);

        assertEquals(2, stack.size());
        assertEquals(20, stack.peek());
    }

    @Test
    void pop_shouldRemoveTopElement() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int value = stack.pop();

        assertEquals(3, value);
        assertEquals(2, stack.size());
        assertEquals(2, stack.peek());
    }

    @Test
    void peek_shouldNotRemoveElement() {
        stack.push(5);
        stack.push(6);

        int value = stack.peek();

        assertEquals(6, value);
        assertEquals(2, stack.size());
    }

    @Test
    void pop_onEmptyStack_shouldThrowException() {
        assertThrows(IndexOutOfBoundsException.class,
                () -> stack.pop());
    }

    @Test
    void peek_onEmptyStack_shouldThrowException() {
        assertThrows(IndexOutOfBoundsException.class,
                () -> stack.peek());
    }

    @Test
    void stack_shouldFollowLifoOrder() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    void pushManyElements_shouldWorkCorrectly() {
        for (int i = 0; i < 100; i++) {
            stack.push(i);
        }

        assertEquals(100, stack.size());
        assertEquals(99, stack.peek());
    }
}
