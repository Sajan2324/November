package com.sajan.scaler.nov.DAY2;
import java.util.Scanner;

public class BruteforcePrimeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        //for loop to iterate through all numbers from 2 to n
        if(n<=1){
            System.out.println("Not a prime number");
            sc.close();
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count==2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }

    }
}
