package com.yasinderu;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int courseCost = 600;
    private static int id = 1000;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name : ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name : ");
        this.lastName = in.nextLine();
        System.out.println();

        System.out.print("Enter student class level : \n1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\n");
        this.gradeYear = in.nextInt();
        System.out.println();

        setStudentId();
    }

    private void setStudentId() {
        id++;
        this.studentId = gradeYear + "" + id;
    }

    public void enroll() {
        Scanner in = new Scanner(System.in);
        String course = "";
        while(!course.equals("Q")) {
            System.out.print("Enter course to enroll (type Q to exit) : ");
            course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance += courseCost;
            }
        }

        payTuition();
    }

    private void viewBalance() {
        System.out.println("Your tuition balance : $" + tuitionBalance);
    }

    private void payTuition() {
        viewBalance();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your payment amount : $");
        int payAmount = in.nextInt();
        tuitionBalance -= payAmount;
        viewBalance();
        System.out.println();
        System.out.println("Thank you for your payment, have a nice day :)");
    }
    public void showInfo() {
        System.out.println("Student Name : " + firstName + " " + lastName +
                "\nStudent ID : " + studentId + "\nEnrolled in : " + "\n" + courses + "\nBalance : " + tuitionBalance + "\n");
    }
}
