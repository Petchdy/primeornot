package com.company;

import sun.swing.StringUIClientPropertyKey;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = 0;
        while (true) {
            int x = scan.nextInt();
            if (x <= 0) {
                break;
            }
            else {
                for (int i = 1; i <= x; i++) {
                    if (x % i == 0) {
                        t++;
                    }
                }
                if (t == 2) {
                    System.out.printf("It’s a prime number\n");
                    t = 0;
                }
                else {
                    System.out.printf("It’s not prime number\n");
                    t = 0;
                }
            }
        }
    }
}
