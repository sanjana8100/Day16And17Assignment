package com.bridgelabz.DataStructurePrograms.Calendar;

import java.util.Scanner;

public class CalendarP12 {

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static int getFirstDayOfWeek(int month, int year) {
        // Zeller's Congruence formula
        int q = 1;
        if (month < 3) {
            month += 12;
            year--;
        }
        int k= year%100;
        int j= year/100;

        int h= q+ 13*(month+1)/5+k+k/4+j/4+5*j;
        h=h%7;
        if(h==0)
            h=6;
        else
            h--;
        return h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month in numbers:");
        int month = sc.nextInt();
        System.out.println("Enter year");
        int year = sc.nextInt();

        int daysInMonth = getDaysInMonth(month, year);
        int firstDayOfWeek = getFirstDayOfWeek(month, year);


        int[][] calendar = new int[6][7];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                calendar[i][j] = 0;
            }
        }

        int dayOfMonth = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 && j < firstDayOfWeek) {
                    continue;
                }
                if (dayOfMonth > daysInMonth) {
                    break;
                }
                calendar[i][j] = dayOfMonth++;
            }
        }

        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (calendar[i][j] == 0) {
                    System.out.print("     ");
                } else {
                    System.out.printf("%5d", calendar[i][j]);
                }
            }
            System.out.println();
        }
    }
}
