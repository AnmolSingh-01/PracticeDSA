package com.company;

import java.util.Scanner;

public class TaylorSeries {

    public static void main(String[] args) {
        int i ;
        float fact = 1 ;
        float sum = 0;
        System.out.println("Enter the value of x : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter the no of terms : ");
        int n = sc.nextInt();

        for(i = 1; i <n ; i++){
            fact = fact * i;
            sum = (float) (sum + Math.pow(x,i)/fact);
        }
        sum = sum + 1;
        System.out.println(sum);
    }
}
