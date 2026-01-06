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
    void add_shouldIncreaseSize() {
        list.add(10);
        list.add(20);

        assertEquals(2, list.size());
        assertFalse(list.isEmpty());
    }

    @Test
    void get_shouldReturnCorrectElement() {
        list.add(5);
        list.add(15);
        list.add(25);

        assertEquals(5, list.get(0));
        assertEquals(15, list.get(1));
        assertEquals(25, list.get(2));
    }

    @Test
    void get_invalidIndex_shouldThrowException() {
        list.add(1);

        assertThrows(IndexOutOfBoundsException.class,
                () -> list.get(5));
    }

    @Test
    void remove_firstElement_shouldUpdateHead() {
        list.add(1);
        list.add(2);
        list.add(3);

        int removed = list.remove(0);

        assertEquals(1, removed);
        assertEquals(2, list.size());
        assertEquals(2, list.get(0));
    }

    @Test
    void remove_middleElement_shouldLinkNodesCorrectly() {
        list.add(1);
        list.add(2);
        list.add(3);

        int removed = list.remove(1);

        assertEquals(2, removed);
        assertEquals(2, list.size());
        assertEquals(1, list.get(0));
        assertEquals(3, list.get(1));
    }

    @Test
    void remove_lastElement_shouldWork() {
        list.add(7);
        list.add(8);

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
