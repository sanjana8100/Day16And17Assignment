package com.bridgelabz.DataStructurePrograms;

public class Queue<T> {
    LinkedList<T> linkedList = new LinkedList<>();

    public void enqueue(T data) {
        linkedList.add(data);
    }

    public void peek() {
        linkedList.show();
    }

    public T dequeue(){
        return linkedList.pop();
    }

    public int size(){
        return linkedList.size();
    }
    public boolean isEmpty(){
        return linkedList.isEmpty();
    }
}
