package com.company.M9;

public class Main {
    public static void main(String[] args) throws Exception {
        //testArrayList();
        //testLinkedList();
        //testQueue();
    }

    private static void testQueue() {
        Cat cat1 = new Cat("Ab", 2);
        Cat cat2 = new Cat("Bc", 3);
        Cat cat3 = new Cat("Cd", 4);
        Cat cat4 = new Cat("De", 5);

        MyQueue<Cat> cats = new MyQueue<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        System.out.println(cats);
        System.out.println();

        System.out.println(cats.peek());
        System.out.println();

        cats.poll();
        System.out.println(cats);
        System.out.println();

        System.out.println(cats.size());
    }

    private static void testArrayList() {
        MyArrayList<String> arrayList = new MyArrayList<>();
        arrayList.add("Vaska");
        arrayList.add("Petka");
        arrayList.add("Sanka");
        arrayList.add("Mashka");
        System.out.println(arrayList);
        System.out.println();

        arrayList.remove(2);
        System.out.println(arrayList);
        System.out.println();

        System.out.println(arrayList.get(1));
        System.out.println();

        arrayList.clear();
        System.out.println(arrayList);
        arrayList.add("Vanka");
        System.out.println(arrayList);
    }

    private static void testLinkedList(){
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("Vaska");
        linkedList.add("Petka");
        linkedList.add("Sanka");
        linkedList.add("Mashka");
        System.out.println(linkedList.size());
        System.out.println(linkedList);
        System.out.println();

        linkedList.remove(1);
        System.out.println(linkedList);
        System.out.println();

        System.out.println(linkedList.get(2));
        System.out.println();

        linkedList.clear();
        System.out.println(linkedList);
        linkedList.add("Vanka");
        System.out.println(linkedList);
    }
}