package com.bridgelabz.AlgorithmPrograms;

public class PrimeNumbersExtendedP8 {

    public static void primeNumbers(int startRange, int endRange){

        for (int i=startRange ; i<=endRange ; i++){
            if(!(i==0 || i==1)) {
                boolean flag= false;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0){
                        flag=true;
                        break;
                    }
                }
                if(!flag)
                    System.out.print(isPalindrome(i)?i+" ":"");
            }
        }
    }

    public static boolean isPalindrome(int number){
        int remainder, sum=0;
        int temp =number;
        while(number>0){
            remainder= number%10;
            sum= (sum*10)+remainder;
            number= number/10;
        }
        return (temp==sum);
    }
    public static void main(String[] args) {
        System.out.println("The Prime Numbers between the range 0-1000 that are Anagram and Palindrome:");

        primeNumbers(0,1000);
    }
}
