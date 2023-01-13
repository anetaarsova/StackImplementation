package org.example;

public interface StackInterface<T> {
    T push(T value);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
    int search(Object o);

    public boolean isFull();

    public int resize();
}
