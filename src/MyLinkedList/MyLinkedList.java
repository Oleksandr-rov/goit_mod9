package MyLinkedList;

import java.util.LinkedList;
import java.util.StringJoiner;

public class MyLinkedList<E> {
    int size = 0;
    Node<E> first;
    Node<E> last;
    public static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;
        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public void add(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    public int size() {
        return size;
    }
    public E remove(int index) {
         if (!(index >= 0 && index < size)) {
             throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
         }
        return unlink(node(index));
    }
    E unlink(Node<E> x) {
        final E element = x.item;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        return element;
    }
    public E get(int index) {
        if (!(index >= 0 && index < size)) {
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        }
        return node(index).item;
    }
    Node<E> node(int index) {
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
    }
    public void clear() {
        for (Node<E> x = first; x != null; ) {
            Node<E> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }
        first = last = null;
        size = 0;
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (Node<E> x = first; x != null; x = x.next)
            result.add(x.item.toString());
        return "[" + result + "]";
    }
}
