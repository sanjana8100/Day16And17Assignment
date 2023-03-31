package com.bridgelabz.AlgorithmPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinarySearchWordP2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\INS 5570\\IdeaProjects\\Day16And17DataStructureAndAlgorithmProblems\\src\\com\\bridgelabz\\AlgorithmPrograms\\WordFile");
        Scanner fs = new Scanner(file);

        String[] array = new String[50];
        int count= 0;
        while (fs.hasNextLine()){
            array[count]= fs.next();
            count++;
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word= in.next();

        boolean status= false;
        for (int i=0 ; i<count ; i++){
            if (array[i].equals(word)) {
                status= true;
                break;
            }
        }

        System.out.println("The words in the File are:");
        for (int i=0 ; i<count ; i++)
            System.out.println(array[i]);

        System.out.println("**************************************************************");

        if(status)
            System.out.println("The given word '"+word+"' is FOUND in the file.");
        else
            System.out.println("The given word '"+word+"' is NOT FOUND in the file.");

        System.out.println("***************************************************************");
    }
}
