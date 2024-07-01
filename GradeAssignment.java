package com.condition.java;

import java.util.Scanner;

public class GradeAssignment {
    public static void main(String[] args) {

//        byte score;
//        score = 90;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter tour score:");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score < 90 && score >= 80) {
            System.out.println("Grade B");

        } else if (score < 80 && score >= 70) {
            System.out.println("Grade C");

        } else if (score < 70 && score >= 60) {
            System.out.println("Grade D");

        } else if (score < 60 && score >= 50) {
            System.out.println("Grade E");

        }else
            System.out.println("Grade F");
    }
}