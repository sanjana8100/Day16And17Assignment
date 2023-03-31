package com.bridgelabz.AlgorithmPrograms.SearchAndSortAlgorithmsP9;

import java.util.ArrayList;
import java.util.List;

public class SearchAndSort<T extends Comparable<T>> {
    List<T> list = new ArrayList<>();

    public void add(T data){
        list.add(data);
    }

    public void binarySearch(List<T> list, T searchData){
        int size= list.size();
        boolean status= false;
        for (int i=0 ; i<size ; i++){
            if (list.get(i).equals(searchData)) {
                status= true;
                break;
            }
        }

        System.out.println("**************************************************************");
        if(status)
            System.out.println("The given data '"+searchData+"' is FOUND in the file.");
        else
            System.out.println("The given data '"+searchData+"' is NOT FOUND in the file.");
        System.out.println("***************************************************************");
    }

    public void insertionSort(List<T> list){
        int n= list.size();
        for (int j=1 ; j<n ; j++){
            T key= list.get(j);
            int i=j-1;
            while ((i>-1) && list.get(i).compareTo(key)> 0){
                T s1= list.get(i);
                list.set(i+1,s1);
                i--;
            }
            list.set(i+1,key);
        }
    }

    public void bubbleSort(List<T> list){
        int n= list.size();
        for (int i=0 ; i<n ; i++){
            for (int j=i+1 ; j<n ; j++){
                if(list.get(i).compareTo(list.get(j))>0){
                    T temp= list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }

    public void merge(List<T> list, int start, int mid, int end){
        int n1= mid-start+1;
        int n2= end-mid;

        List<T> leftList = new ArrayList<>();
        List<T> rightList = new ArrayList<>();

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

    public void mergeSort(List<T> list, int start, int end){
        if (start < end){
            int mid= (start + end)/2;
            mergeSort(list,start,mid);
            mergeSort(list,mid+1,end);
            merge(list,start,mid,end);
        }
    }

    public void displayList(){
        System.out.println(list);
    }
}
