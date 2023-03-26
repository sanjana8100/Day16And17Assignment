package com.bridgelabz.DataStructurePrograms.PalindromeChecker;

import com.bridgelabz.DataStructurePrograms.Deque;

import java.util.Scanner;

public class PalindromeCheckerP5 {
    public static void main(String[] args) {
        Deque<Character> stringDeque= new Deque<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String to Check if it is Palindrome:");
        String string= in.next();
        string= string.toLowerCase();

        for(int i=0 ; i<string.length() ; i++){
            Character c= string.charAt(i);
            stringDeque.addRear(c);
        }

        boolean flag = true;

        while(stringDeque.size()>1){
            Character c1= stringDeque.removeFront();
            Character c2= stringDeque.removeRear();
            if(c1!=c2){
                flag=false;
                break;
            }
        }
        if(flag)
            System.out.println("True! "+string+" is PALINDROME.");
        else
            System.out.println("False! "+string+" is NOT PALINDROME.");
    }
}
