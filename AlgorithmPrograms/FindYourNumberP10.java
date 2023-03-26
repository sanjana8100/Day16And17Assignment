package com.bridgelabz.AlgorithmPrograms;

import java.util.Scanner;

public class FindYourNumberP10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = in.nextInt();
        int low = 0, high = num - 1;
        int guess = 0, numGuesses = 0;

        System.out.println("Think of a number between 0 and "+(num - 1));
        while (low <= high) {
            guess = (low + high) / 2;
            System.out.print("Is your number between " + low + " and " + guess + "? ");
            System.out.println("\nYES: press 1\t NO: press 2");
            int choice= in.nextInt();
            numGuesses++;

            if (choice==1) {
                high = guess - 1;
            } else {
                low = guess + 1;
            }
        }
        System.out.println("Your number is " + guess + ".");
        System.out.println("Number of guesses: " + numGuesses);
    }
}
