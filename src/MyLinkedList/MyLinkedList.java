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

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +
                    ", next=" + next +
                    ", prev=" + prev +
                    '}';
        }
    }
//    private void linkFirst(E element) {
//        final Node<E> f = first;
//        final Node<E> newNode = new Node<>(null, element, f);
//        first = newNode;
//        if (f == null)
//            last = newNode;
//        else
//            f.prev = newNode;
//        size++;
//        //modCount++;
//    }
    void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        //modCount++;
    }

    /*---------------------------------------------------------------------------*/
    public void add(E e) {
        //if (size == 0)
        //    linkFirst(e);
        //else
            linkLast(e);
        //nextIndex++;
        //expectedModCount++;
    }
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (Node<E> x = first; x != null; x = x.next)
            result.add(x.item.toString());
        return "[" + result + "]";
    }
}
