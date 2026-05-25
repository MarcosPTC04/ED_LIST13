package dev.marcos.edlist12.core;

public class MyLinkedList<T extends Comparable<T>> implements MyList<T> {

    public Node<T> head;
    public Node<T> tail;

    public void addLast(T element) {

        Node<T> newNode = new Node<>(element);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void print() {

        Node<T> current = head;

        while (current != null) {
            System.out.print(current.element + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public void addAscendingSorted(T element) {

        Node<T> newNode = new Node<>(element);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        if (head.element.compareTo(element) > 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node<T> current = head;

        while (current.next != null &&
                current.next.element.compareTo(element) < 0) {

            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void deleteNode(Node<T> p) {

        if (p == null || p.next == null) {
            return;
        }

        p.element = p.next.element;
        p.next = p.next.next;
    }

    @Override
    public void reverse() {

        Node<T> previous = null;
        Node<T> current = head;
        Node<T> next;

        tail = head;

        while (current != null) {

            next = current.next;

            current.next = previous;

            previous = current;
            current = next;
        }

        head = previous;
    }

    public static MyLinkedList<Integer> merge(
            MyLinkedList<Integer> l1,
            MyLinkedList<Integer> l2) {

        MyLinkedList<Integer> result = new MyLinkedList<>();

        Node<Integer> p1 = l1.head;
        Node<Integer> p2 = l2.head;

        while (p1 != null && p2 != null) {

            if (p1.element < p2.element) {

                result.addLast(p1.element);
                p1 = p1.next;

            } else {

                result.addLast(p2.element);
                p2 = p2.next;
            }
        }

        while (p1 != null) {
            result.addLast(p1.element);
            p1 = p1.next;
        }

        while (p2 != null) {
            result.addLast(p2.element);
            p2 = p2.next;
        }

        return result;
    }

    public void removeNthFromEnd(int n) {

        Node<T> fast = head;
        Node<T> slow = head;

        for (int i = 0; i < n; i++) {

            if (fast == null) {
                return;
            }

            fast = fast.next;
        }

        if (fast == null) {
            head = head.next;

            if (head == null) {
                tail = null;
            }

            return;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        if (slow.next == null) {
            tail = slow;
        }
    }
}