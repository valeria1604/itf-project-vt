package com.company.M9;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyHashMap<K, V> {
    private class Element<K, V> {
        private K key;
        private V value;

        private Element(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "Element{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    private ArrayList<LinkedList<Element<K, V>>> buckets;
    private int numBuckets;
    private int size;

    public MyHashMap() {
        numBuckets = 10;
        size = 0;
        buckets = new ArrayList<>(numBuckets);

        for (int i = 0; i < numBuckets; i++) {
            buckets.add(new LinkedList<>());
        }
    }

    private int getHash(K key){
        int hash = key.hashCode();
        return hash % numBuckets;
    }

    public void put(K key, V value) {
        int hash = getHash(key);
        LinkedList<Element<K, V>> bucket = buckets.get(hash);

        for (Element<K, V> element : bucket) {
            if (element.getKey().equals(key)) {
                element.value = value;
                return;
            }
        }
        size++;
        bucket.add(new Element<>(key, value));
    }

    public V get(K key) {
        int hash = getHash(key);
        LinkedList<Element<K, V>> bucket = buckets.get(hash);
        for (Element<K, V> element : bucket) {
            if (element.getKey().equals(key)) {
                return element.getValue();
            }
        }
        return null;
    }

    public void remove(K key) {
        int hash = getHash(key);
        LinkedList<Element<K, V>> bucket = buckets.get(hash);
        for (Element<K, V> element : bucket) {
            if (element.getKey().equals(key)) {
                bucket.remove(element);
                size--;
            }
            break;
        }
         throw new IndexOutOfBoundsException("There is no element with that key");
    }

    public void clear() {
        numBuckets = 10;
        size = 0;
        buckets = new ArrayList<>(numBuckets);

        for (int i = 0; i < numBuckets; i++) {
            buckets.add(new LinkedList<>());
        }
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashMap{" +
                "buckets=" + buckets +
                ", numBuckets=" + numBuckets +
                ", size=" + size +
                '}';
    }
}
