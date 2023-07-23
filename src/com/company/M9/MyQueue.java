package com.company.M9;

public class MyQueue<T> {
    public static final int START_SIZE = 2;
    private int size;
    private T[] elements;

    public MyQueue() {
        elements = (T[]) new Object[START_SIZE];
    }

    public void add(T newValue) {
        resize();
        elements[size] = newValue;
        size++;
    }

    private void resize() {
        if (size == elements.length) {
            int newSize = (int) (size * 1.5);
            T[] newArrayOfElements = (T[]) new Object[newSize];
            System.arraycopy(elements, 0, newArrayOfElements, 0, size);
            elements = newArrayOfElements;
        }
    }

    public int size() {
        return size;
    }

    public T peek(){
        return elements[0];
    }

    public void poll(){
        if (size == 0) {
            throw new IndexOutOfBoundsException("Empty queue");
        }
        System.arraycopy(elements,  1, elements, 0, size - 1);
        size--;
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < size; i++) {
            result += "{"+ elements[i] + "}, ";
        }
        result += "] \nSize: " + size;
        return result;
    }
}
