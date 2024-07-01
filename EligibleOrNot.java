package com.condition.java;

import java.util.Scanner;

public class EligibleOrNot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a person age:");
        int age = scanner.nextInt();

        // condition statements are used for checking whether the person eligible or not for the vote

        if (age < 18)
            System.out.println("the person not eligible for vote");
        else
            System.out.println("the person eligible for vote ");

    }
}


