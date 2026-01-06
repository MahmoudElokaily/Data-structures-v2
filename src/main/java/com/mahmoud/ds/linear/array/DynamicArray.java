package main.java.com.mahmoud.ds.linear.array;

import main.java.com.mahmoud.ds.core.List;

public class DynamicArray<T> implements List<T> {
    private static final int DEFAULT_CAPACITY = 2;
    private T[] data;
    private int size;

    // Constructor
    @SuppressWarnings("unchecked")
    public DynamicArray() {
        data = (T[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return data[index];
    }

    @Override
    public void push(T value) {
        checkCapacity();
        data[size++] = value;
    }

    @Override
    public T remove(int index) {
        checkIndex(index);
        // element want to remove
        T element = data[index];
        // remove element and shift elements
        for (int i = index;i < size - 1;++i){
            data[i] = data[i + 1];
        }
        // empty space in list & to avoid memory leak
        data[--size] = null;
        return element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    /* ####################################### Helpers #####################*/
    private void checkCapacity() {
        if (data.length == size) {
            resize();
        }
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        // New size of list => old length * 2 (double)
        int newCapacity = data.length * 2;
        // Create new array with new size (double) & copy elements
        T[] newData = (T[]) new Object[newCapacity];
        for (int i = 0;i < size;++i){
            newData[i] = data[i];
        }
        // Assign new array to data
        data = newData;
    }

    private void checkIndex(int index) {
        // check if user want to access element out of list bounds
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for size " + size);
        }
    }
}
