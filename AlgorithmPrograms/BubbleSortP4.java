package com.bridgelabz.AlgorithmPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSortP4 {
    public static void bubbleSort(List<Integer> list){
        int n= list.size();
        for (int i=0 ; i<n ; i++){
            for (int j=i+1 ; j<n ; j++){
                if(list.get(i).compareTo(list.get(j))>0){
                    int temp= list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();

        System.out.println("Enter the number of Integers in the List:");
        int num = in.nextInt();

        System.out.println("Enter the Integers in the List:");
        while (num>0){
            integerList.add(in.nextInt());
            num--;
        }

        System.out.println("The List Before Sorting:");
        System.out.println(integerList);

        bubbleSort(integerList);

        System.out.println("The List After Sorting:");
        System.out.println(integerList);
    }
}
