package com.bridgelabz.DataStructurePrograms;

public class Deque<T> {
    LinkedList<T> linkedList = new LinkedList<>();

    public void addFront(T data) {
        linkedList.push(data);
    }

    public void addRear(T data){
        linkedList.add(data);
    }

    public void peek() {
        linkedList.show();
    }

    public T removeFront(){
        return linkedList.pop();
    }

    public T removeRear(){
        return linkedList.popLast();
    }

    public int size(){
        return linkedList.size();
    }
    public boolean isEmpty(){
        return linkedList.isEmpty();
    }
}
