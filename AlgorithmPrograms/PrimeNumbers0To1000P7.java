package com.bridgelabz.AlgorithmPrograms;

public class PrimeNumbers0To1000P7 {
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
                    System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("The Prime Numbers between the range 0-1000:");

        primeNumbers(0,1000);
    }
}
