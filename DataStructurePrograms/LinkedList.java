package com.bridgelabz.DataStructurePrograms;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    public void add(T data){
        Node<T> newNode = new Node<>(data);
        if (head == null){
            head=newNode;
        }
        else {
            tail.next=newNode;
        }
        tail=newNode;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public boolean insertAfter(T searchData, T insertData) {
        Node<T> newNode = new Node<>(insertData);
        Node<T> searchedNode = search(searchData);
        if (searchedNode != null) {
            newNode.next = searchedNode.next;
            searchedNode.next = newNode;
            return true;
        }
        return false;
    }

    public T pop() {
        if(head == null)
            return null;
        T popData = head.data;
        head = head.next;
        return popData;
    }

    public T popLast(){
        if(head == null)
            return null;
        T popData = tail.data;
        if(head == tail){
            head= null;
            return popData;
        }
        Node<T> temp= head;
        while(temp.next != tail)
            temp= temp.next;
        temp.next=null;
        tail= temp;
        return popData;
    }

    public void remove(T data) {
        Node<T> searchedNode = search(data);

        if(searchedNode!=null){
            Node<T> temp = head;
            if(searchedNode == head){
                head= searchedNode.next;
            }else{
                while(temp.next != searchedNode)
                    temp= temp.next;
                temp.next= searchedNode.next;
            }
            searchedNode.next= null;
        }
    }

    public int size() {
        Node<T> temp = head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public Node<T> search(T searchData) {
        Node<T> temp= head;
        while(temp!=null){
            if((temp.data).equals(searchData))
                return temp;
            temp= temp.next;
        }
        return null;
    }

    public void show() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
