package main.java.com.mahmoud.ds.core;

public interface Stack<T> {

    void push(T value);

    T pop();

    // top element on stack
    T peek();

    int size();

    boolean isEmpty();
}
