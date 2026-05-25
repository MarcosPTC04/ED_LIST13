package dev.marcos.edlist12;

import dev.marcos.edlist12.core.MyLinkedList;

public class MyLinkedListTests {

    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.print();

        list.reverse();

        list.print();
    }
}
