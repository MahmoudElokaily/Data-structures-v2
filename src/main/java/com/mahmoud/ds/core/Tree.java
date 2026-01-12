package main.java.com.mahmoud.ds.core;

public interface Tree<T extends Comparable<T>> {

    void insert(T value);

    boolean contains(T value);

    int size();

    boolean isEmpty();
}
