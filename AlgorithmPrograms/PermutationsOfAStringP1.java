package com.bridgelabz.AlgorithmPrograms;

import java.util.Scanner;

public class PermutationsOfAStringP1 {
    public static void printPermutations(String string, String answer){
        if(string.length() == 0){
            System.out.println(answer+" ");
            return;
        }
        for(int i=0;i<string.length();i++){
            char ch=string.charAt(i);
            String remaining= string.substring(0,i)+string.substring(i+1);
            printPermutations(remaining,answer+ch);
        }
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a String:");
        String s= in.next();

        System.out.println("All Permutations of Given String:");
        printPermutations(s," ");
    }
}
