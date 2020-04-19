package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int t = 0;
        for (int i=1;i<=x;i++){
            if (x%i==0){
                t++;
            }
        }
        if(t==2){
            System.out.printf("Yes");
        }
        else {
            System.out.printf("No");
        }
    }
}
