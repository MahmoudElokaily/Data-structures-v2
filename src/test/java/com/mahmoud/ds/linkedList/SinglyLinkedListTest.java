package test.java.com.mahmoud.ds.linkedList;

import main.java.com.mahmoud.ds.linear.linkedList.SinglyLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    private SinglyLinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new SinglyLinkedList<>();
    }

    @Test
    void newList_shouldBeEmpty() {
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    void push_shouldIncreaseSize() {
        list.push(10);
        list.push(20);

        assertEquals(2, list.size());
        assertFalse(list.isEmpty());
    }

    @Test
    void get_shouldReturnCorrectElement() {
        list.push(5);
        list.push(15);
        list.push(25);

        assertEquals(5, list.get(0));
        assertEquals(15, list.get(1));
        assertEquals(25, list.get(2));
    }

    @Test
    void get_invalidIndex_shouldThrowException() {
        list.push(1);

        assertThrows(IndexOutOfBoundsException.class,
                () -> list.get(5));
    }

    @Test
    void remove_firstElement_shouldUpdateHead() {
        list.push(1);
        list.push(2);
        list.push(3);

        int removed = list.remove(0);

        assertEquals(1, removed);
        assertEquals(2, list.size());
        assertEquals(2, list.get(0));
    }

    @Test
    void remove_middleElement_shouldLinkNodesCorrectly() {
        list.push(1);
        list.push(2);
        list.push(3);

        int removed = list.remove(1);

        assertEquals(2, removed);
        assertEquals(2, list.size());
        assertEquals(1, list.get(0));
        assertEquals(3, list.get(1));
    }

    @Test
    void remove_lastElement_shouldWork() {
        list.push(7);
        list.push(8);

        int removed = list.remove(1);

        assertEquals(8, removed);
        assertEquals(1, list.size());
        assertEquals(7, list.get(0));
    }

    @Test
    void remove_invalidIndex_shouldThrowException() {
        assertThrows(IndexOutOfBoundsException.class,
                () -> list.remove(0));
    }
}
