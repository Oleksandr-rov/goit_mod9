package MyCollection;
public class TestMyCollection {
    public static void main(String[] args) {
        /*****************************************  ArrayList  *****************************************/
        MyList<Integer> myArrayList = new MyArrayList<Integer>(10);

        System.out.println("myArrayList.size() = " + myArrayList.size());
        myArrayList.add(3);
        System.out.println("myArrayList.toString() = " + myArrayList.toString());
        myArrayList.add(4);
        System.out.println("myArrayList.toString() = " + myArrayList.toString());
        System.out.println("myArrayList.size() = " + myArrayList.size());
        myArrayList.clear();
        System.out.println("myArrayList.toString() = " + myArrayList.toString());
        System.out.println("myArrayList.size() = " + myArrayList.size());
        /*****************************************  LinkedList  *****************************************/
        MyList<Integer> myList = new MyLinkedList<Integer>();
        System.out.println("myList.toString() = " + myList.toString());
        System.out.println("myList.size = " + myList.size());
        myList.add(1);
        System.out.println("myList.toString() = " + myList.toString());
        System.out.println("myList.size = " + myList.size());
        myList.add(2);
        myList.add(3);
        System.out.println("myList.toString() = " + myList.toString());
        System.out.println("myList.size = " + myList.size());
        System.out.println("myList.get(1) = " + myList.get(1));
        /*****************************************  Queue  *****************************************/
        MyStack<String> myQueue = new MyLinkedList<String>();
        myQueue.add("Alex");
        myQueue.add("Oleksandr");
        System.out.println("myQueue = " + myQueue);
        System.out.println("myQueue.size = " + myQueue.size());
        myQueue.clear();
        System.out.println("myQueue = " + myQueue);
        myQueue.add("Mykola");
        myQueue.add("Vasya");
        System.out.println("myQueue = " + myQueue);
        System.out.println("myQueue.peek() = " + myQueue.peek());
        System.out.println("myQueue = " + myQueue);
        System.out.println("myQueue.size() = " + myQueue.size());
        /*****************************************  Stack  *****************************************/
        MyStack<String> myStack = new MyLinkedList<String>();
        myStack.add("Ann");
        myStack.push("Arina");
        System.out.println("myStack = " + myStack);
        System.out.println("myStack.size() = " + myStack.size());
    }
}