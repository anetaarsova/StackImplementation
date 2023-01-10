package org.example;

import java.util.Stack;

public class FixedStack<T> extends Stack<T> {
    private int maxSize;

    public FixedStack(int size) {
        super();
        this.maxSize = size;
    }

    @Override
    public T push(T object) {
        if (isFull()) {
            resize();
        }
        return super.push(object);
    }

    @Override
    public synchronized T peek() {
        return super.peek();
    }

    @Override
    public synchronized T pop() {
        return super.pop();
    }

    @Override
    public synchronized boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public synchronized int size() {
        return super.size();
    }

    public boolean isFull() {
        return (this.size() == maxSize);
    }

    public int resize(){
        return maxSize*2;
    }
}
