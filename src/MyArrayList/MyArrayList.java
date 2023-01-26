package MyArrayList;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

public class MyArrayList<E> {
    private Object[] elementData;
    private static final Object[] EMPTY_ELEMENTDATA = {};
    private int size;

    public MyArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+ initialCapacity);
        }
    }

    public MyArrayList() {
        this.elementData = EMPTY_ELEMENTDATA;
    }

    public void add(E e) {
        if (size == elementData.length)
            elementData = grow(elementData.length * 2);
        elementData[size] = e;
        size++;
    }
    private Object[] grow(int newCapacity) {
        return elementData = Arrays.copyOf(elementData, newCapacity);
    }
    public void remove(int index) {
        Objects.checkIndex(index, size);
        final int newSize = size - 1;
        Object[] es;
        if ((newSize) > 0) {
            es = new Object[newSize];
            System.arraycopy(elementData, index + 1, elementData, index, size - index);
            elementData[size] = null;
            size = newSize;
        }
        if ((newSize) == 0) {
            elementData[size] = null;
            size = newSize;
        }
    }
    public E get(int index) {              // з List
        Objects.checkIndex(index, size);
        return (E) elementData[index];
    }
    public int size() {
        return size;
    }

    public void clear() {
        for (int to = size, i = size = 0; i < to; i++)
            elementData[i] = null;
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < size; i++) {
            result.add(elementData[i].toString());
        }
        return "[" + result + "]";
    }

}
