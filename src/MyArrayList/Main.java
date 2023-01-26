package MyArrayList;

import java.util.*;

//   add(Object value) додає елемент в кінець
//   remove(int index) видаляє елемент із вказаним індексом
//   clear() очищає колекцію
//   size() повертає розмір колекції
//   get(int index) повертає елемент за індексом
public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(10);
        myList.add(10);
        myList.add(110);
        myList.clear();
        myList.add(110);
        myList.add(110);
        myList.add(110);
        myList.add(120);
        myList.remove(0);
        System.out.println("myList.getClass() = " + myList.getClass());
        System.out.println("myList.toString() = " + myList.toString());
        System.out.println("myList.size() = " + myList.size());

        System.out.println("-----------------------------------------------------------------");
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
        int[] mas = new int[] {1,2,3,4,5,6,7,8,9};
        int[] mas2 = new int[] {12,32,45,67,987,9};
        System.out.println("Arrays.toString(mas) = " + Arrays.toString(mas));
        System.out.println("Arrays.toString(mas2) = " + Arrays.toString(mas2));
        System.arraycopy(mas, 1,mas2,3, 3);
        System.out.println("Arrays.toString(mas) = " + Arrays.toString(mas));
        System.out.println("Arrays.toString(mas2) = " + Arrays.toString(mas2));

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