package com.company.M9;

import java.util.Arrays;

public class MyArrayList<Type> {
    private Type[] arrayOfElements;
    private int size;

    public MyArrayList() {
        arrayOfElements = (Type[]) new Object[0];
        size = 0;
    }

    public void add(Object newValue) {
        Type newElement = (Type) newValue;
        Type[] newArrayOfElements = (Type[]) new Object[size + 1];
        for (int i = 0; i < size; i++) {
            newArrayOfElements[i] = arrayOfElements[i];
        }
        newArrayOfElements[size] = newElement;
        arrayOfElements = newArrayOfElements;
        size = size + 1;
    }

    public void remove(int index) {
        if (index < 0 || index > size - 1){
            throw new IndexOutOfBoundsException("Index out of bounds of size of list");
        }

        Type[] newArrayOfElements = (Type[]) new Object[size - 1];
        for (int i = 0; i < size - 1; i++) {
            if (i < index) {
                newArrayOfElements[i] = arrayOfElements[i];
            } else {
                newArrayOfElements[i] = arrayOfElements[i + 1];
            }
        }
        arrayOfElements = newArrayOfElements;
        size = size - 1;
    }

    public void clear() {
        Type[] newArrayOfElements = (Type[]) new Object[0];
        arrayOfElements = newArrayOfElements;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Type get(int index) {
        if (index < 0 || index > size - 1){
            throw new IndexOutOfBoundsException("Index out of bounds of size of list");
        }

        return arrayOfElements[index];
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "arrayOfElements=" + Arrays.toString(arrayOfElements) +
                ", sizeArray=" + size +
                '}';
    }
}
