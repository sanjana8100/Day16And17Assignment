package com.bridgelabz.DataStructurePrograms.PrimeNumberPrograms;

public class PrimeNumbersInRange0To1000P8 {

    public static int[][] array= new int[10][25];
    public static int i,i1,i2,i3,i4,i5,i6,i7,i8,i9=0;
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
                    insert(i);
            }
        }
    }

    public static void insert(int data){
        if(data>=0 && data<=100){
            array[0][i]= data;
            i++;
        }else if(data>100 && data<=200){
            array[1][i1]= data;
            i1++;
        }else if(data>200 && data<=300){
            array[2][i2]= data;
            i2++;
        }else if(data>300 && data<=400){
            array[3][i3]= data;
            i3++;
        }else if(data>400 && data<=500){
            array[4][i4]= data;
            i4++;
        }else if(data>500 && data<=600){
            array[5][i5]= data;
            i5++;
        }else if(data>600 && data<=700){
            array[6][i6]= data;
            i6++;
        }else if(data>700 && data<=800){
            array[7][i7]= data;
            i7++;
        }else if(data>800 && data<=900){
            array[8][i8]= data;
            i8++;
        }else if(data>900 && data<=1000){
            array[9][i9]= data;
            i9++;
        }
    }

    public static void display(){
        for (int i=0 ; i<10 ; i++){
            for (int j=0 ; j<25 ; j++){
                if(array[i][j] != 0)
                    System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("The Prime Numbers between the range 0-1000:");
        primeNumbers(0,1000);
        display();
    }
}
