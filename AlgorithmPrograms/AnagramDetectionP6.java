package com.bridgelabz.AlgorithmPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetectionP6 {

    public static boolean isAnagram(String string1, String string2) {
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        if (string1.length() == string2.length()) {

            
            char[] array1 = string1.toCharArray();
            char[] array2 = string2.toCharArray();
            /*  char[] array1 = new char[string1.length()];
                char[] array2 = new char[string2.length()];
                for(int i=0;i<string1.length();i++)
                    array1[i]= string1.charAt(i);
                for(int i=0;i<string2.length();i++)
                    array2[i]=string2.charAt(i);
            ALTERNATE METHOD */

            Arrays.sort(array1);
            Arrays.sort(array2);

            return Arrays.equals(array1, array2);

        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Two Strings to check if they are ANAGRAM:");
        String str1= in.next();
        String str2= in.next();

        boolean result= isAnagram(str1,str2);

        if(result)
            System.out.println(str1 + " and " + str2 + " are anagram.");
        else
            System.out.println(str1 + " and " + str2 + " are not anagram.");

    }
}
