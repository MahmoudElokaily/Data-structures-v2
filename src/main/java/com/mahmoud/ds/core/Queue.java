package main.java.com.mahmoud.ds.core;

public interface Queue<T> {

    void enqueue(T value);

    T dequeue();

    T peek();

    int size();

    boolean isEmpty();
}
