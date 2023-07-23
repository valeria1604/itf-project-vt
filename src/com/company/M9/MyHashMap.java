package com.company.M9;


public class MyHashMap<K, V> {
    private class Node<K, V> {
        private K key;
        private V value;

        private Node(K key, V value) {
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

    private Node<K, V>[] buckets;
    private int size;

    public MyHashMap() {
        size = 0;
        buckets = (Node<K, V>[]) new Node[10];
    }

    private int getHash(K key) {
        int hash = key.hashCode();
        return Math.abs(hash) % buckets.length;
    }

    public void put(K key, V value) {
        int hash = getHash(key);
        while (buckets[hash] != null) {
            if(buckets[hash].getKey().equals(key)){
                buckets[hash].value = value;
                return;
            }
            hash = (hash + 1) % buckets.length;
        }

        buckets[hash] = new Node<>(key, value);
        size++;

        if ((1.0 * size) / buckets.length >= 0.7) {
            resizeArray(buckets.length * 2);
        }
    }

    public V get(K key) {
        int hash = getHash(key);

        while (buckets[hash] != null) {
            if(buckets[hash].getKey().equals(key)){
                return buckets[hash].getValue();
            }
            hash = (hash + 1) % buckets.length;
        }

        return null;
    }

    public V remove(K key) {
        int hash = getHash(key);

        while (buckets[hash] != null) {
            if(buckets[hash].getKey().equals(key)){
                V value =  buckets[hash].getValue();
                buckets[hash] = null;
                size--;

                if ((1.0 * size) / buckets.length >= 0.7) {
                    resizeArray(buckets.length * 2);
                }

                return value;
            }
            hash = (hash + 1) % buckets.length;
        }
        return null;

    }

    public void clear() {
        size = 0;
        buckets = (Node<K, V>[]) new Node[10];
    }

    public int size() {
        return size;
    }

    private void resizeArray(int newSize) {
        Node<K, V>[] newBuckets = (Node<K, V>[]) new Node[newSize];

        for (Node<K, V> node : buckets) {
            if (node != null) {
                int hash = getHash(node.getKey());
                while (newBuckets[hash] != null) {
                    hash = (hash + 1) % newBuckets.length;
                }
                newBuckets[hash] = node;
            }
        }
        buckets = newBuckets;
    }

    @Override
    public String toString() {
        return "MyHashMap{" +
                "buckets=" + buckets.toString() +
                ", size=" + size +
                '}';
    }
}
