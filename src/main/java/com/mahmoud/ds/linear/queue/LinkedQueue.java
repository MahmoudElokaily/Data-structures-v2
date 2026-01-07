package main.java.com.mahmoud.ds.linear.queue;

import main.java.com.mahmoud.ds.core.Queue;
import main.java.com.mahmoud.ds.linear.linkedList.DoublyLinkedList;


public class LinkedQueue<T> implements Queue<T> {
    // Create New linked list
    private final DoublyLinkedList<T> list = new DoublyLinkedList<>();

    @Override
    public void enqueue(T value) {
        list.pushBack(value);
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        return list.popFront();
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        return list.get(0);
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
