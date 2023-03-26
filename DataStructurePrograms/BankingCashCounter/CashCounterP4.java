package com.bridgelabz.DataStructurePrograms.BankingCashCounter;

import com.bridgelabz.DataStructurePrograms.Queue;

import java.util.Scanner;

public class CashCounterP4 {
    public static void main(String[] args) {
        Queue<Integer> cashCounterQueue= new Queue<>();

        boolean status= true;
        while (status){
            Scanner in = new Scanner(System.in);
            System.out.println("**********BANKING CASH COUNTER**********");
            System.out.println("WELCOME");
            System.out.println("Please Enter the Total Balance in your Account:");
            Integer totalBalance= Integer.valueOf(in.next());
            cashCounterQueue.enqueue(totalBalance);

            System.out.println("------------MENU:------------");
            System.out.println("To Deposit: PRESS 1");
            System.out.println("To Withdraw: PRESS 2");
            System.out.println("To Display Balance: PRESS 3");
            System.out.println("To EXIT: PRESS 4");
            int choice= in.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter the Amount you want to Deposit:");
                    Integer depositAmount= Integer.valueOf(in.next());
                    totalBalance= totalBalance + depositAmount;
                    cashCounterQueue.dequeue();
                    cashCounterQueue.enqueue(totalBalance);
                    System.out.println("Current Balance:");
                    cashCounterQueue.peek();
                    cashCounterQueue.dequeue();
                    break;
                case 2:
                    System.out.println("Enter the Amount you want to Withdraw:");
                    Integer withdrawAmount= Integer.valueOf(in.next());
                    if(withdrawAmount > totalBalance){
                        System.out.println("Insufficient Balance!!!");
                    } else {
                        totalBalance = totalBalance - withdrawAmount;
                        cashCounterQueue.dequeue();
                        cashCounterQueue.enqueue(totalBalance);
                    }
                    System.out.println("Current Balance:");
                    cashCounterQueue.peek();
                    cashCounterQueue.dequeue();
                    break;
                case 3:
                    System.out.println("Current Balance is:");
                    cashCounterQueue.peek();
                    break;
                default:
                    status= false;
                    break;
            }
            System.out.println("Thank you for visiting us!");
            System.out.println("Please press *");
            String enter= in.next();
            System.out.println(enter);
        }
    }
}
