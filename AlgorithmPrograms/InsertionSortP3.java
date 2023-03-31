package com.bridgelabz.AlgorithmPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSortP3 {
    public static void insertionSort(List<String> list){
        int n= list.size();
        for (int j=1 ; j<n ; j++){
            String key= list.get(j);
            int i=j-1;
            while ((i>-1) && list.get(i).compareTo(key) > 0){
                String s1= list.get(i);
                list.set(i+1,s1);
                i--;
            }
            list.set(i+1,key);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> stringList= new ArrayList<>();

        System.out.println("Enter the number of words in the list:");
        int num = in.nextInt();

        System.out.println("Enter the word in the list:");
        for (int i=0 ; i<num ; i++)
            stringList.add(in.next());

        System.out.println("The List Before Sorting:");
        System.out.println(stringList);

        insertionSort(stringList);

        System.out.println("The List After Sorting:");
        System.out.println(stringList);
    }
}
