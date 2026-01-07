package main.java.com.mahmoud.ds.linear.stack;

import main.java.com.mahmoud.ds.core.Stack;
import main.java.com.mahmoud.ds.linear.array.DynamicArray;

public class ArrayStack<T> implements Stack<T> {
    // Make new Dynamic array
    private final DynamicArray<T> array = new DynamicArray<>();

    @Override
    public void push(T value) {
        array.push(value);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return array.remove(array.size() - 1);
    }

    // Get Top element in stack
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return array.get(array.size() - 1);
    }

    @Override
    public int size() {
        return array.size();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }
}
