package dev.marcos.edlist12.exercises;

import dev.marcos.edlist12.core.MyLinkedList;

public class Exercise1 {

    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addAscendingSorted(10);
        list.addAscendingSorted(5);
        list.addAscendingSorted(20);
        list.addAscendingSorted(15);

        list.print();
    }
}