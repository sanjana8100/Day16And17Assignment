package com.bridgelabz.DataStructurePrograms.UnOrderedList;

import com.bridgelabz.DataStructurePrograms.LinkedList;
import com.bridgelabz.DataStructurePrograms.Node;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class UnOrderedLinkedListP1 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\INS 5570\\IdeaProjects\\Day16And17DataStructureAndAlgorithmProblems\\src\\com\\bridgelabz\\DataStructurePrograms\\UnOrderedList\\File");
        Scanner fs= new Scanner(file);

        LinkedList<String> unOrderedList = new LinkedList<>();

        while(fs.hasNext())
            unOrderedList.add(fs.next());

        System.out.println("LIST:");
        unOrderedList.show();

        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter a word:");
        String word= in.next();
        Node<String> searchedData= unOrderedList.search(word);
        if(searchedData == null) {
            unOrderedList.add(word);
            System.out.println("The given word is not found in the file! Thus, adding it to the list.");
        } else {
            unOrderedList.remove(word);
            System.out.println("The given word is found in the file! Thus, deleting it from the list.");
        }
        System.out.println("LIST: ");
        unOrderedList.show();
    }
}
