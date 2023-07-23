package com.company.M9;

public class MyArrayList<T> {
    public static final int START_SIZE = 2;
    private T[] elements;
    private int size;

    public MyArrayList() {
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

    public void remove(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Index out of bounds of size of list");
        }

        System.arraycopy(elements, index + 1, elements, index, size - 1 - index);
        elements[size - 1] = null;
        size--;
    }

    public void clear() {
        T[] newArrayOfElements = (T[]) new Object[START_SIZE];
        elements = newArrayOfElements;
        size = 0;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Index out of bounds of size of list");
        }

        return elements[index];
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
