package com.bridgelabz.DataStructurePrograms.PrimeNumberPrograms;

public class PrimeNumbersInRange0To1000ExtendedP9 {

    public static int[][] anagramPrimeNumbers= new int[10][25];
    public static int i0,i1,i2,i3,i4,i5,i6,i7,i8,i9=0;
    public static void primeNumbers(int startRange, int endRange){

        for (int i=startRange ; i<=endRange ; i++){
            if(isPrime(i)){
                isAnagram(i);
            }
        }
    }

    public static boolean isPrime(int data){
        if(!(data==0 || data==1)) {
            boolean flag = false;
            for (int j = 2; j <= data / 2; j++) {
                if (data % j == 0) {
                    flag = true;
                    break;
                }
            }
            return !flag;
        }
        return false;
    }

    public static void isAnagram(int data){
        int a = data;
        int rev = 0;
        while (a != 0) {
            int last = a % 10;
            rev = rev * 10 + last;
            a = a / 10;
        }
        if (rev == data) {
            insert(data);
        } else if(isPrime(rev))
            insert(data);
    }

    public static void insert(int data){
        if(data>=0 && data<=100){
            anagramPrimeNumbers[0][i0]= data;
            i0++;
        }else if(data>100 && data<=200){
            anagramPrimeNumbers[1][i1]= data;
            i1++;
        }else if(data>200 && data<=300){
            anagramPrimeNumbers[2][i2]= data;
            i2++;
        }else if(data>300 && data<=400){
            anagramPrimeNumbers[3][i3]= data;
            i3++;
        }else if(data>400 && data<=500){
            anagramPrimeNumbers[4][i4]= data;
            i4++;
        }else if(data>500 && data<=600){
            anagramPrimeNumbers[5][i5]= data;
            i5++;
        }else if(data>600 && data<=700){
            anagramPrimeNumbers[6][i6]= data;
            i6++;
        }else if(data>700 && data<=800){
            anagramPrimeNumbers[7][i7]= data;
            i7++;
        }else if(data>800 && data<=900){
            anagramPrimeNumbers[8][i8]= data;
            i8++;
        }else if(data>900 && data<=1000){
            anagramPrimeNumbers[9][i9]= data;
            i9++;
        }
    }

    public static void display(){
        for (int i=0 ; i<10 ; i++){
            for (int j=0 ; j<25 ; j++){
                if(anagramPrimeNumbers[i][j] != 0)
                    System.out.print(anagramPrimeNumbers[i][j]+" ");
            }
            if(anagramPrimeNumbers[i][0]!=0)
                System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("The Prime Numbers between the range 0-1000:");
        primeNumbers(0,1000);
        display();

    }
}
