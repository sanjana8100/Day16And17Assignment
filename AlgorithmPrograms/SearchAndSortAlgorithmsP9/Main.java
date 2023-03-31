package com.bridgelabz.AlgorithmPrograms.SearchAndSortAlgorithmsP9;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SearchAndSort<String> integerList = new SearchAndSort<>();

        System.out.println("Enter the number of Words in the List:");
        int num = in.nextInt();
        System.out.println("Enter the Words in the List:");
        while (num>0){
            integerList.add(in.next());
            num--;
        }

        System.out.println("The Original List:");
        integerList.displayList();
        System.out.println();

        List<String> originalList = integerList.list;

        System.out.println("Enter a word:");
        String word= in.next();
        integerList.binarySearch(originalList,word);
        System.out.println();

        System.out.println("The Original List:");
        integerList.displayList();
        System.out.println();

        System.out.println("The List after Insertion Sort: ");
        integerList.insertionSort(originalList);
        System.out.println(originalList);
        System.out.println("***************************************************************");
        System.out.println();

        System.out.println("The Original List:");
        originalList = integerList.list;
        System.out.println(originalList);
        System.out.println();


        System.out.println("The List after Bubble Sort: ");
        integerList.bubbleSort(originalList);
        System.out.println(originalList);
        System.out.println("***************************************************************");
        System.out.println();

        System.out.println("The Original List:");
        originalList = integerList.list;
        System.out.println(originalList);
        System.out.println();

        System.out.println("The List after Merge Sort: ");
        integerList.mergeSort(originalList,0,num-1);
        System.out.println(originalList);
        System.out.println("***************************************************************");
        System.out.println();
    }
}
