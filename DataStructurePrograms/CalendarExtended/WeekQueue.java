package com.bridgelabz.DataStructurePrograms.CalendarExtended;

import com.bridgelabz.DataStructurePrograms.LinkedList;

public class WeekQueue<T> {
    LinkedList<T> linkedList= new LinkedList<>();

    public void addWeek(T week){
        linkedList.add(week);
    }

    public void printCalendar(){
        linkedList.show();
    }
}
