package main.java.com.mahmoud.ds.linear.stack;

import main.java.com.mahmoud.ds.core.Stack;
import main.java.com.mahmoud.ds.linear.linkedList.DoublyLinkedList;

public class LinkedStack<T> implements Stack<T> {
    // Create linked list to use in stack
    private final DoublyLinkedList<T> list = new DoublyLinkedList<>();

    @Override
    public void push(T value) {
        list.pushBack(value);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return list.popBack();
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return list.get(list.size() - 1);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

}
