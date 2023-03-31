package com.bridgelabz.AlgorithmPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSortP5 {
    public static void merge(List<String> list, int start, int mid, int end){
        int n1= mid-start+1;
        int n2= end-mid;

        List<String> leftList = new ArrayList<>();
        List<String> rightList = new ArrayList<>();

        for (int i=0 ; i<n1 ; i++)
            leftList.add(list.get(start+i));

        for (int j=0 ; j<n2 ; j++)
            rightList.add(list.get(mid+1+j));

        int i=0, j=0, k=start;

        while (i<leftList.size() && j<rightList.size()){
            if (leftList.get(i).compareTo(rightList.get(j))<=0){
                list.set(k,leftList.get(i));
                i++;
            } else {
                list.set(k, rightList.get(j));
                j++;
            }
            k++;
        }

        while (i<n1){
            list.set(k,leftList.get(i));
            i++; k++;
        }

        while (j<n2){
            list.set(k,rightList.get(j));
            j++; k++;
        }
    }
    public static void mergeSort(List<String> list, int start, int end){
        if (start < end){
            int mid= (start + end)/2;
            mergeSort(list,start,mid);
            mergeSort(list,mid+1,end);
            merge(list,start,mid,end);
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

        mergeSort(stringList,0,num-1);

        System.out.println("The List After Sorting:");
        System.out.println(stringList);
    }
}
