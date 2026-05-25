package dev.marcos.edlist12.exercises;

import dev.marcos.edlist12.core.MyLinkedList;

public class Exercise5 {

    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        System.out.println("Original:");
        list.print();

        list.removeNthFromEnd(2);

        System.out.println("Após remover:");
        list.print();
    }
}
