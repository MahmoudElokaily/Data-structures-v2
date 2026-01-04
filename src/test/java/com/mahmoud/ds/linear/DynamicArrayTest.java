package test.java.com.mahmoud.ds.linear;

import main.java.com.mahmoud.ds.linear.array.DynamicArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DynamicArrayTest {

    private DynamicArray<Integer> array;

    @BeforeEach
    void setUp() {
        array = new DynamicArray<>();
    }

    @Test
    void newArray_shouldBeEmpty() {
        assertTrue(array.isEmpty());
        assertEquals(0, array.size());
    }

    @Test
    void add_shouldIncreaseSize() {
        array.add(10);
        array.add(20);

        assertEquals(2, array.size());
        assertFalse(array.isEmpty());
    }

    @Test
    void get_shouldReturnCorrectElement() {
        array.add(5);
        array.add(15);

        assertEquals(5, array.get(0));
        assertEquals(15, array.get(1));
    }

    @Test
    void get_invalidIndex_shouldThrowException() {
        array.add(1);

        assertThrows(IndexOutOfBoundsException.class,
                () -> array.get(5));
    }

    @Test
    void remove_shouldShiftElementsLeft() {
        array.add(1);
        array.add(2);
        array.add(3);

        int removed = array.remove(1);

        assertEquals(2, removed);
        assertEquals(2, array.size());
        assertEquals(1, array.get(0));
        assertEquals(3, array.get(1));
    }

    @Test
    void remove_lastElement_shouldWork() {
        array.add(7);
        array.add(8);

        int removed = array.remove(1);

        assertEquals(8, removed);
        assertEquals(1, array.size());
    }

    @Test
    void remove_invalidIndex_shouldThrowException() {
        assertThrows(IndexOutOfBoundsException.class,
                () -> array.remove(0));
    }

    @Test
    void shouldResizeAutomatically() {
        for (int i = 0; i < 20; i++) {
            array.add(i);
        }

        assertEquals(20, array.size());
        assertEquals(19, array.get(19));
    }
}
