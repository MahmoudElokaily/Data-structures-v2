package test.java.com.mahmoud.ds.linkedList;

import main.java.com.mahmoud.ds.linear.linkedList.DoublyLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    private DoublyLinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new DoublyLinkedList<>();
    }

    @Test
    void newList_shouldBeEmpty() {
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    void pushBack_shouldAddElements() {
        list.pushBack(1);
        list.pushBack(2);

        assertEquals(2, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
    }

    @Test
    void pushFront_shouldAddElementsAtBeginning() {
        list.pushFront(1);
        list.pushFront(2);

        assertEquals(2, list.size());
        assertEquals(2, list.get(0));
        assertEquals(1, list.get(1));
    }

    @Test
    void popFront_shouldRemoveFirstElement() {
        list.pushBack(1);
        list.pushBack(2);

        int value = list.popFront();

        assertEquals(1, value);
        assertEquals(1, list.size());
        assertEquals(2, list.get(0));
    }

    @Test
    void popBack_shouldRemoveLastElement() {
        list.pushBack(1);
        list.pushBack(2);

        int value = list.popBack();

        assertEquals(2, value);
        assertEquals(1, list.size());
        assertEquals(1, list.get(0));
    }

    @Test
    void remove_middleElement_shouldWork() {
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);

        int value = list.remove(1);

        assertEquals(2, value);
        assertEquals(2, list.size());
        assertEquals(1, list.get(0));
        assertEquals(3, list.get(1));
    }

    @Test
    void remove_firstElement_shouldDelegateToPopFront() {
        list.pushBack(1);
        list.pushBack(2);

        int value = list.remove(0);

        assertEquals(1, value);
        assertEquals(1, list.size());
        assertEquals(2, list.get(0));
    }

    @Test
    void remove_lastElement_shouldDelegateToPopBack() {
        list.pushBack(1);
        list.pushBack(2);

        int value = list.remove(1);

        assertEquals(2, value);
        assertEquals(1, list.size());
        assertEquals(1, list.get(0));
    }

    @Test
    void get_invalidIndex_shouldThrowException() {
        list.pushBack(1);

        assertThrows(IndexOutOfBoundsException.class,
                () -> list.get(5));
    }

    @Test
    void popFromEmptyList_shouldThrowException() {
        assertThrows(IndexOutOfBoundsException.class,
                () -> list.popFront());
    }
}
