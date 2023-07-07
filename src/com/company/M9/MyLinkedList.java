package com.company.M9;

public class MyLinkedList<T> {
    public Node headNode;
    public Node tailNode;
    private int size;

    public void add(T newValue) {
        if (size == 0) {
            Node newNode = new Node(newValue, null, null);
            headNode = newNode;
            tailNode = headNode;
        } else {
            Node newNode = new Node(newValue, tailNode, null);
            tailNode.nextNode = newNode;
            tailNode = newNode;
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Index out of bounds of size of list");
        }

        if (index == 0) {
            headNode = headNode.nextNode;
            headNode.preNode = null;
            size--;
            return;
        }

        if (index == size - 1) {
            tailNode = tailNode.preNode;
            tailNode.nextNode = null;
            size--;
            return;
        }

        size--;
        Node tmpNode = headNode;
        for (int i = 0; i < index ; i++) {
            tmpNode = tmpNode.nextNode;
        }

        Node prevTempNode = tmpNode.preNode;
        Node nextTempNode = tmpNode.nextNode;

        prevTempNode.nextNode = nextTempNode;
        nextTempNode.preNode = prevTempNode;
    }

    public void clear() {
        size = 0;
        headNode = null;
        tailNode = null;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Index out of bounds of size of list");
        }

        Node tmpNode = headNode;
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                return tmpNode.value;
            }
            tmpNode = tmpNode.nextNode;
        }
        return null;
    }

//TODO for -> while
    @Override
    public String toString() {
        String result = "[";
        Node tmpNode = headNode;
        for (int i = 0; i < size; i++) {
            result += "{" + tmpNode.value + "}, ";
            tmpNode = tmpNode.nextNode;
        }
        result += "] \nSize: " + size;
        return result;
    }

    private class Node {
        private T value;
        private Node preNode;
        private Node nextNode;

        private Node(T value, Node preNode, Node nextNode) {
            this.value = value;
            this.preNode = preNode;
            this.nextNode = nextNode;
        }
    }
}
