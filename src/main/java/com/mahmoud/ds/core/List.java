package main.java.com.mahmoud.ds.core;

public interface List<T> {
    // To Add New Element
    void add(T value);

    // To get specific item from List
    T get(int index);

    // To remove item from list
    T remove(int index);

    // To get size of List
    int size();

    // Check if list is empty or not
    boolean isEmpty();
}
