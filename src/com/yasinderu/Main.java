package com.yasinderu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students to enroll : ");
        int numOfStudent = in.nextInt();
        Student[] students = new Student[numOfStudent];

        for (int i=0; i<numOfStudent; i++) {
            students[i] = new Student();
            students[i].enroll();
        }

        for (int j=0; j<numOfStudent; j++) {
            students[j].showInfo();
        }
    }
}
