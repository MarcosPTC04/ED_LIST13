package dev.marcos.edlist12.core;

public class Node<T> {

    public T element;
    public Node<T> next;

    public Node(T element) {
        this.element = element;
        this.next = null;
    }
}