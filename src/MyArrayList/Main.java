package MyArrayList;

import java.util.*;

//   add(Object value) додає елемент в кінець
//   remove(int index) видаляє елемент із вказаним індексом
//   clear() очищає колекцію
//   size() повертає розмір колекції
//   get(int index) повертає елемент за індексом
public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList(10);

        System.out.println("myArrayList.size() = " + myArrayList.size());
        myArrayList.add(3);
        System.out.println("myArrayList.toString() = " + myArrayList.toString());
        myArrayList.add(4);
        System.out.println("myArrayList.toString() = " + myArrayList.toString());
        System.out.println("myArrayList.size() = " + myArrayList.size());
        myArrayList.clear();
        System.out.println("myArrayList.toString() = " + myArrayList.toString());
        System.out.println("myArrayList.size() = " + myArrayList.size());
        myArrayList.add(3);
        myArrayList.add(44);
        myArrayList.add(4);
        System.out.println("myArrayList.toString() = " + myArrayList.toString());
        System.out.println("myArrayList.size() = " + myArrayList.size());
        System.out.println("myArrayList.get(1) = " + myArrayList.get(1));
        System.out.println("Objects.checkIndex(0, 0) = " + Objects.checkIndex(0, 1));
        myArrayList.remove(1);
        System.out.println("myArrayList.toString() = " + myArrayList.toString());
        System.out.println("myArrayList.size() = " + myArrayList.size());
        myArrayList.remove(0);
        System.out.println("myArrayList.toString() = " + myArrayList.toString());
        System.out.println("myArrayList.size() = " + myArrayList.size());
        myArrayList.remove(0);
        System.out.println("myArrayList.toString() = " + myArrayList.toString());
        myArrayList.add(44);
        myArrayList.add(4);
        System.out.println("myArrayList.toString() = " + myArrayList.toString());
        System.out.println("myArrayList.size() = " + myArrayList.size());
        System.out.println("myArrayList.get(1) = " + myArrayList.get(0));
        myArrayList.clear();
        System.out.println("myArrayList.toString() = " + myArrayList.toString());
        System.out.println("myArrayList.size() = " + myArrayList.size());
    }
}