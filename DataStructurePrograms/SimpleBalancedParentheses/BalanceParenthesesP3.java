package com.bridgelabz.DataStructurePrograms.SimpleBalancedParentheses;

import com.bridgelabz.DataStructurePrograms.Stack;

import java.util.Scanner;

public class BalanceParenthesesP3 {
    public static void main(String[] args) {
        Stack<String> queue = new Stack<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Arithmetic Expression:");
        System.out.println("Example: (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)");
        String expression= in.next();

        char[] array = expression.toCharArray();
        for (char c : array) {
            switch (c) {
                case '(':
                    queue.push("(");
                    break;
                case ')':
                    String s = queue.pop();
                    if (s == null)
                        queue.push("(");
                    break;
                default:
                    break;
            }
        }
        if(queue.isEmpty())
            System.out.println("True!!! The Expression is Balanced!");
        else
            System.out.println("False!!! The Expression is NOT Balanced!");
    }
}
