package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;
        int[][] student = new int[n][5];
        for (int i=0;i<n;i++){
            for (int j=0;j<5;j++){
                student[i][j] = scan.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            int sum = 0;
            for (int j=0;j<5;j++){
                sum += student[i][j];
            }
            System.out.printf("%d ",sum);
            a += sum;
        }
        System.out.printf("\n%.2f",(float)a/n);
    }
}
