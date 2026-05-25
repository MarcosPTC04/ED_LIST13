package dev.marcos.edlist12.exercises;

import dev.marcos.edlist12.core.MyLinkedList;

public class Exercise3 {

    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        System.out.println("Original:");
        list.print();

        list.reverse();

        System.out.println("Invertida:");
        list.print();
    }
}
