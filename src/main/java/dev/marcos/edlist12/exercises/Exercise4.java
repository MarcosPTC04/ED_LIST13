package dev.marcos.edlist12.exercises;

import dev.marcos.edlist12.core.MyLinkedList;

public class Exercise4 {

    public static void main(String[] args) {

        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        MyLinkedList<Integer> list2 = new MyLinkedList<>();

        list1.addLast(1);
        list1.addLast(3);
        list1.addLast(5);

        list2.addLast(2);
        list2.addLast(4);
        list2.addLast(6);

        MyLinkedList<Integer> result =
                MyLinkedList.merge(list1, list2);

        result.print();
    }
}