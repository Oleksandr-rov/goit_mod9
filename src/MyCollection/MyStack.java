package MyCollection;

public interface MyStack<E> extends MyQueue<E> {
    void push(E e);
    E pop();

}