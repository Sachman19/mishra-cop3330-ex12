/*
 *  UCF COP3330 Summer 2021 Assignment 12 Solution
 *  Copyright 2021 Sachin Mishra
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal. ");
        int principal = input.nextInt();

        System.out.print("What is the rate of interest? (Please enter a percentage). ");
        double interest = input.nextDouble()  / 100.0;

        System.out.print("Enter the number of years. ");
        int years = input.nextInt();

        // A = P(1 + rt)
        double total = Math.round(100 * principal * (1 + interest * years)) / 100.0;

        System.out.println();
        System.out.printf("After %d years at %.1f percent interest, the investment will be worth %.2f", years, interest * 100, total);

    }
}