package com.bridgelabz.DataStructurePrograms.NumberOfBinarySearchTree;

import java.util.Scanner;

public class NumberOfBinarySearchTreeP7 {
    public static int factorial(int num) {
        int fact = 1;
        if(num == 0)
            return 1;
        else {
            while(num > 1) {
                fact = fact * num;
                num--;
            }
            return fact;
        }
    }

    public static long countBST(int key) {
        return factorial(2 * key) / (long) factorial(key + 1) / factorial(key);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Test Cases:");
        int T= in.nextInt();

        int[] array = new int[T];
        System.out.println("Enter the values of N (Number of Nodes) for "+T+" Test Cases:");
        for(int i=0;i<T;i++)
            array[i]= in.nextInt();

        for(int i=0;i<T;i++) {
            long count= countBST(array[i]);
            System.out.println("Count of Binary Search Trees with "+array[i]+ " nodes is "+count);
        }
    }
}

