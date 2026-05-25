package dev.marcos.edlist12.core;

public interface MyList<T> {

    void addLast(T element);

    void print();

    void addAscendingSorted(T element);

    void reverse();

    void removeNthFromEnd(int n);
}
