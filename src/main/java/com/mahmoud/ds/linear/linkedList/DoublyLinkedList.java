package main.java.com.mahmoud.ds.linear.linkedList;

import main.java.com.mahmoud.ds.core.List;

public class DoublyLinkedList<T> implements List<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        T value;
        Node<T> next;
        Node<T> prev;

        Node(T value) {
            this.value = value;
        }
    }

    // ############################### Add methods ################################
    @Override
    public void push(T value) {
       pushBack(value);
    }

    public void pushFront(T value) {
        // Create new node
        Node<T> newNode = new Node<>(value);

        // check if list is empty to insert
        if (head == null) {
            head = tail = newNode;
        }
        // if Not empty
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        ++size;
    }

    public void pushBack(T value) {
        // Create new node
        Node<T> newNode = new Node<>(value);

        // check if list is empty to insert
        if (tail == null) {
            head = tail = newNode;
        }
        // if Not empty
        else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        ++size;
    }

    // Remove methods
    @Override
    public T remove(int index) {
        // Check if index valid or not
        checkIndex(index);

        if (index == 0) {
            return popFront();
        }
        if (index == size - 1) {
            return popBack();
        }

        Node<T> node = getNode(index);
        node.prev.next = node.next;
        node.next.prev = node.prev;

        T value = node.value;
        // Make GC remove them from memory
        node.next = node.prev = null;

        --size;
        return value;
    }

    @Override
    public T get(int index) {
        // Check if index valid or not
        checkIndex(index);
        return getNode(index).value;
    }

    @Override
    public int size() {
        return size;
    }


    // remove last element in list
    public T popBack() {
        // we can't remove element from empty list
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        T value = tail.value;
        // only one element in List
        if (head == tail) {
            head = tail = null;
        }
        else {
            tail = tail.prev;
            tail.next = null;
        }
        --size;
        return value;
    }

    // remove first element in list
    public T popFront() {
        // we can't remove element from empty list
        if (isEmpty()) {
            if (isEmpty()) {
                throw new IndexOutOfBoundsException("List is empty");
            }
        }

        T value = head.value;
        // only one element in List
        if (head == tail) {
            head = tail = null;
        }
        else {
            head = head.next;
            head.prev = null;
        }
        --size;
        return value;
    }


    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /* ############################# Helper ############################# */
    private void checkIndex(int index) {
        // check if user want to access element out of list bounds
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for size " + size);
        }
    }

    private Node<T> getNode(int index) {
        Node<T> curr;
        if (index < (size / 2)) {
            curr = head;
            for (int i = 0;i < index;++i){
                curr = curr.next;
            }
        }else {
            curr = tail;
            for (int i = size - 1;i > index;--i) {
                curr = curr.prev;
            }
        }
        return curr;
    }

}
