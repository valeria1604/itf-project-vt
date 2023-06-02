package com.company.M9;

public class MyLinkedList<Type> {
    public Node headNode;
    public Node tailNode;
    private int size;

    class Node {
        public Type value;
        public Node preNode;
        public Node nextNode;

        public Node() {
        }

        public Node(Type value, Node preNode, Node nextNode) {
            this.value = value;
            this.preNode = preNode;
            this.nextNode = nextNode;
        }
    }

    public MyLinkedList() {
        size = 0;

        headNode = new Node();
        headNode.value = null;
        headNode.preNode = null;
        headNode.nextNode = null;

        tailNode = headNode;
    }

    public void add(Object newValue) {
        if (size == 0) {
            Node newNode = new Node((Type) newValue, null, null);
            headNode = newNode;
            tailNode = newNode;
        } else {
            Node newNode = new Node((Type) newValue, tailNode, null);
            tailNode.nextNode = newNode;
            tailNode = newNode;
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Index out of bounds of size of list");
        }

        Node tmpNode = headNode.nextNode;
        for (int i = 0; i < index - 1; i++) {
            tmpNode = tmpNode.nextNode;
        }

        Node prevTempNode = tmpNode.preNode;
        Node nextTempNode = tmpNode.nextNode;

        if (prevTempNode != null) {
            prevTempNode.nextNode = nextTempNode;
        } else {
            headNode = nextTempNode;
        }

        if (nextTempNode != null) {
            nextTempNode.preNode = prevTempNode;
        }
        if (tmpNode == tailNode) {
            tailNode = prevTempNode;
        }
        size--;
    }

    public void clear() {
        size = 0;
        headNode = null;
        tailNode = null;
    }

    public int size() {
        return size;
    }

    public Type get(int index) {
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

    public void print() {
        Node tmpNode = headNode;
        for (int i = 0; i < size; i++) {
            System.out.println(tmpNode.value);
            tmpNode = tmpNode.nextNode;
        }
    }
}
