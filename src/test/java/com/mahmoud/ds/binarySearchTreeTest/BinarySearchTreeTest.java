package test.java.com.mahmoud.ds.binarySearchTreeTest;

import main.java.com.mahmoud.ds.core.Tree;
import main.java.com.mahmoud.ds.tree.BinarySearchTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    private Tree<Integer> tree;

    @BeforeEach
    void setUp() {
        tree = new BinarySearchTree<>();
    }

    @Test
    void newTree_shouldBeEmpty() {
        assertTrue(tree.isEmpty());
        assertEquals(0, tree.size());
    }

    @Test
    void insert_shouldAddElements() {
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);

        assertEquals(3, tree.size());
        assertFalse(tree.isEmpty());
    }

    @Test
    void contains_shouldReturnTrueIfElementExists() {
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);

        assertTrue(tree.contains(10));
        assertTrue(tree.contains(5));
        assertTrue(tree.contains(15));
    }

    @Test
    void contains_shouldReturnFalseIfElementDoesNotExist() {
        tree.insert(10);
        tree.insert(5);

        assertFalse(tree.contains(20));
        assertFalse(tree.contains(0));
    }

    @Test
    void insert_duplicateValues_shouldNotIncreaseSize() {
        tree.insert(10);
        tree.insert(10);
        tree.insert(10);

        assertEquals(1, tree.size());
        assertTrue(tree.contains(10));
    }

    @Test
    void tree_shouldHandleLeftSkewedInsertion() {
        tree.insert(10);
        tree.insert(9);
        tree.insert(8);
        tree.insert(7);

        assertEquals(4, tree.size());
        assertTrue(tree.contains(7));
    }

    @Test
    void tree_shouldHandleRightSkewedInsertion() {
        tree.insert(10);
        tree.insert(11);
        tree.insert(12);
        tree.insert(13);

        assertEquals(4, tree.size());
        assertTrue(tree.contains(13));
    }

    @Test
    void multipleOperations_shouldWorkCorrectly() {
        tree.insert(8);
        tree.insert(3);
        tree.insert(10);
        tree.insert(1);
        tree.insert(6);
        tree.insert(14);

        assertTrue(tree.contains(6));
        assertTrue(tree.contains(14));
        assertFalse(tree.contains(7));
        assertEquals(6, tree.size());
    }
}