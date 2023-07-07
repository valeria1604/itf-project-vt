package com.company.M9;

public class MyHashMap<T> {

    public MyHashMap.Node currentLastNode;
    private int size;

    public void put(int key, T newValue) {

        MyHashMap.Node currentCheckNode = currentLastNode;
        for (int i = 0; i < size; i++) {
            if (key == currentCheckNode.key) {
                throw new IndexOutOfBoundsException("Key was already used");
            }
            currentCheckNode = currentCheckNode.preNode;

        }
        if (size == 0) {
            MyHashMap.Node newNode = new MyHashMap.Node(key, newValue, null);
            currentLastNode = newNode;
        } else {
            MyHashMap.Node newNode = new MyHashMap.Node(key, newValue, currentLastNode);
            currentLastNode = newNode;
        }

        size++;
    }

    public void remove(int key) {

        MyHashMap.Node currentCheckNode = currentLastNode;

        if (currentCheckNode.key == key) {
            currentLastNode = currentCheckNode.preNode;
        } else {
            for (int i = 0; i < size; i++) {

                if (key == currentCheckNode.preNode.key) {
                    currentCheckNode.setPreNode(currentCheckNode.preNode.preNode);
                    size--;
                    return;
                }
                currentCheckNode = currentCheckNode.preNode;
            }

            throw new IndexOutOfBoundsException("There is no element with that key");
        }
    }

    public void clear() {
        size = 0;
        currentLastNode = null;
    }

    public int size() {
        return size;
    }

    public T get(int key) {

        MyHashMap.Node currentCheckNode = currentLastNode;
        for (int i = 0; i < size; i++) {
            if (key == currentCheckNode.key) {
                return (T) currentCheckNode.value;
            }
            currentCheckNode = currentCheckNode.preNode;
        }

        return null;
    }

    @Override
    public String toString() {
        if(size == 0){
            return "Empty list";
        }else{
            String result = "[";
            MyHashMap.Node tmpNode = currentLastNode;
            result += "{" + tmpNode.value + "}, ";

            while (tmpNode.preNode != null){
                tmpNode = tmpNode.preNode;
                result += "{" + tmpNode.value + "}, ";
            }
            result += "] \nSize: " + size;
            return result;
        }
    }

    private class Node {
        private T value;
        private int key;
        private MyHashMap.Node preNode;

        private Node(int key, T value, MyHashMap.Node preNode) {
            this.value = value;
            this.key = key;
            this.preNode = preNode;
        }

        public void setPreNode(Node preNode) {
            this.preNode = preNode;
        }
    }
}
