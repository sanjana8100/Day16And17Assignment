package com.bridgelabz.DataStructurePrograms;

public class Stack<T> {
    LinkedList<T> linkedList = new LinkedList<>();

    public void push(T data) {
        linkedList.push(data);
    }

    public void show() {
        linkedList.show();
    }

    public T pop() {
        return linkedList.pop();
    }

    public int size(){
        return linkedList.size();
    }
    public boolean isEmpty(){
        return linkedList.isEmpty();
    }
}
