package MyLinkedList;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove(1);
        System.out.println("list = " + list);
        MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
        //System.out.println("myList.toString() = " + myList.toString());
        System.out.println("myList.size = " + myList.size);
        myList.add(1);
        //System.out.println("myList.toString() = " + myList.toString());
        System.out.println("myList.size = " + myList.size);
        myList.add(2);
        //System.out.println("myList.toString() = " + myList.toString());
        System.out.println("myList.size = " + myList.size);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        System.out.println("myList.toString() = " + myList);
        System.out.println("myList.size = " + myList.size);
        System.out.println("myList.remove(1) = " + myList.remove(5));
        System.out.println("myList.toString() = " + myList);
        System.out.println("myList.size = " + myList.size);
        System.out.println("myList.node(1) = " + myList.get(4));
        myList.clear();
        System.out.println("myList = " + myList);
        System.out.println("myList.size = " + myList.size);

    }
}
