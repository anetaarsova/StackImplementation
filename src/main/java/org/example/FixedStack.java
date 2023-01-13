package org.example;

public class FixedStack<T> implements StackInterface{
    private FixedStack<T> previous;
    private T value;
    private int maxSize;

       FixedStack() {
    }

    public FixedStack(T value) {
        this.value = value;
    }
        FixedStack(FixedStack<T> previous, T value, int size) {
        this.previous = previous;
        this.value = value;
        this.maxSize = size;
    }

    @Override
    public Object push(Object value) {
        if (isFull()) {
            resize();
        }
                if (this.value == null)
            this.value = (T) value;
        else {
            this.previous = new FixedStack<T>(this.previous, this.value, this.maxSize);
            this.value = (T) value;
        }

        return this.value;
    }

    @Override
    public Object pop() {
                if (this.isEmpty())
            throw new IllegalArgumentException("Stack is empty");

        T top = this.value;
        this.value = this.previous.value;
        this.previous = this.previous.previous;

        return top;
    }

    @Override
    public Object peek() {
        return this.value;
    }

    @Override
    public boolean isEmpty() {
        return this.previous == null;
    }

    @Override
    public int size() {
        return this.isEmpty() ? 0 : 1 + this.previous.size();
    }

    @Override
    public int search(Object o) {
                int count = 1;

        for (FixedStack<T> stack = this; !stack.isEmpty(); stack = stack.previous) {
            if (stack.value.equals(o))
                return count;
            count++;
        }

        return -1;
    }

    @Override
    public boolean isFull() {
        return (this.size() == maxSize);
    }
    @Override
    public int resize(){
        return maxSize*2;
    }
    @Override
    public String toString() {
        if (!this.isEmpty())
            return this.previous + " <- " + this.value;
        return this.value != null ? String.valueOf(this.value) : "";
    }
}
