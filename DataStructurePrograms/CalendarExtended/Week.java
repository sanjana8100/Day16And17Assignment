package com.bridgelabz.DataStructurePrograms.CalendarExtended;

import com.bridgelabz.DataStructurePrograms.LinkedList;

public class Week<T> {
    LinkedList<T> linkedList= new LinkedList<>();

    public void addDay(T day){
        linkedList.add(day);
    }

    public void printWeek(){
        linkedList.show();
    }
}
