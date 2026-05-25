package dev.marcos.edlist12.exercises;

import dev.marcos.edlist12.core.MyLinkedList;
import dev.marcos.edlist12.core.Node;

public class Exercise2 {

    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        Node<Integer> n1 = new Node<>(20);
        Node<Integer> n2 = new Node<>(4);
        Node<Integer> n3 = new Node<>(15);
        Node<Integer> n4 = new Node<>(19);
        Node<Integer> n5 = new Node<>(47);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        list.head = n1;

        list.print();

        list.deleteNode(n3);

        list.print();
    }
}
