package com.company.M9;

public class Main {
    public static void main(String[] args) throws Exception {
        //testArrayList();
        testLinkedList();
    }

    private static void testArrayList() {
        MyArrayList<String> arrayList = new MyArrayList<>();
        arrayList.add("Vaska");
        arrayList.add("Petka");
        arrayList.add("Sanka");
        arrayList.add("Mashka");
        System.out.println("Size: " + arrayList.size());
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
        linkedList.print();
        System.out.println();

        linkedList.remove(2);
        linkedList.print();
        System.out.println();

        System.out.println(linkedList.get(2));
        System.out.println();

        linkedList.clear();
        linkedList.print();
        linkedList.add("Vanka");
        linkedList.print();
    }
}