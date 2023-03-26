package com.bridgelabz.AlgorithmPrograms;

import java.util.Scanner;

public class CustomiseMessageP12 {
    static String str ="Hello <<name>>,\n\nWe have your Full Name as <<full name>> in our system and your Contact Number is stored as 91-xxxxxxxxxx.\nPlease,let us know in case of any clarification.\n \nThank you,\n BridgeLabz\n day/month/2016.";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String name= in.nextLine();

        System.out.print("Enter your Full Name:");
        String fullName= in.nextLine();

        System.out.print("Enter Contact Number:");
        String phoneNumber= in.next();

        System.out.print("Enter Date:");
        String date= in.next();

        System.out.print("Enter Month:");
        String month= in.next();

        System.out.print("Enter Year:");
        String year = in.next();

        System.out.println();
        str=str.replaceAll(("<<name>>"),name);
        str=str.replaceAll(("<<full name>>"),fullName);
        str=str.replaceAll(("91-xxxxxxxxxx"),phoneNumber);
        str=str.replaceAll(("day"),date);
        str=str.replaceAll(("month"),month);
        str=str.replaceAll(("2016"),year);


        System.out.println(str);
    }
}
