package main.java.com.mahmoud.ds.tree;

import main.java.com.mahmoud.ds.core.Tree;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    private Node root;
    private int size;

    private class Node {
        T value;
        Node left;
        Node right;

        Node(T value) {
            this.value = value;
        }
    }

    @Override
    public void insert(T value) {
        root = insert(root, value);
    }

    private Node insert(Node node, T value) {
        if (node == null) {
            size++;
            return new Node(value);
        }

        int cmp = value.compareTo(node.value);

        if (cmp < 0) {
            node.left = insert(node.left, value);
        } else if (cmp > 0) {
            node.right = insert(node.right, value);
        }

        return node;
    }

    @Override
    public boolean contains(T value) {
        return contains(root, value);
    }

    private boolean contains(Node node, T value) {
        if (node == null) return false;

        int cmp = value.compareTo(node.value);

        if (cmp < 0) return contains(node.left, value);
        if (cmp > 0) return contains(node.right, value);
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
