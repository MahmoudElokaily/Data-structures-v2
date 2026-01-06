package main.java.com.mahmoud.ds.linear.linkedList;

import main.java.com.mahmoud.ds.core.List;

public class SinglyLinkedList<T> implements List<T> {

    private Node<T> head;
    private int size = 0;


    /* ################################# Node ###################################### */
    private static class Node<T>  {
        /*
            My node divide 2 parts
                1 - first one is value of node
                2 - second part is pointer to next node
         */
        T value;
        Node<T> next;
        // Constructor
        Node(T value) {
            this.value = value;
        }
    }

    @Override
    public void push(T value) {
        // Create new node
        Node<T> newNode = new Node<>(value);

        // Add new
        if (head == null) {
            head = newNode;
        } else {
            // make instance form head
            Node<T> current = head;
            // Get last element in list
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        ++size;
    }

    @Override
    public T remove(int index) {
        // Check if index valid or not
        checkIndex(index);
        // if u choose to remove head (First element)
        if (index == 0){
            T value = head.value;
            head = head.next;
            --size;
            return value;
        }
        // Previous node
        Node<T> preNode = head;
        /* if i want to remove element of index => 4
            i get element number 3
            note i loop until index - 1
         */
        for (int i= 0;i < index - 1;++i) {
            preNode = preNode.next;
        }
        // Get value
        T value = preNode.next.value;
        // Remove element
        preNode.next = preNode.next.next;
        --size;
        return value;
    }

    @Override
    public T get(int index) {
        // Check if index valid or not
        checkIndex(index);
        Node<T> curr = head;
        for (int i=0;i < index;++i){
            curr = curr.next;
        }
        return curr.value;
    }

    @Override
    public int size() {
        return size;
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
}
