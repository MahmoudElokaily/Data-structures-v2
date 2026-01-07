package main.java.com.mahmoud.ds.linear.queue;

import main.java.com.mahmoud.ds.core.Queue;
import main.java.com.mahmoud.ds.linear.array.DynamicArray;

public class ArrayQueue<T> implements Queue<T> {
    // Create New Dynaic array
    private final DynamicArray<T> array = new DynamicArray<>();
    int front = 0;


    @Override
    public void enqueue(T value) {
        array.push(value);
    }

    @Override
    public T dequeue() {
        if (isEmpty()){
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        T value = array.get(front);
        // we don't remove element actually we just ignore it 1 --> 2
        front++;
        return value;
    }

    @Override
    public T peek() {
        if (isEmpty()){
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        return array.get(front);
    }

    @Override
    public int size() {
        return array.size() - front;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
}
