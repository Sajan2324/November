package com.sajan.scaler.nov;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        System.out.println("Hello Sajan from Scanner class");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");
        double salary = scanner.nextDouble();
        System.out.println("Your salary is " + salary);
        String gender = scanner.next();
        System.out.println("Your gender is " + gender);
        scanner.close();

//scanner class is used to take input from user
        //nextLine() method is used to take string input
        //nextInt() method is used to take integer input
        //nextDouble() method is used to take double input
        //next() method is used to take single word string input
        //close() method is used to close the scanner
        //Scanner class is present in java.util package
        //Scanner class is not a part of java.lang package
        //Scanner class is not a part of java.io package
        //Scanner class is not a part of java.net package
        //Scanner class is not a part of java.sql package
        //Scanner class is not a part of java.awt package
        //Scanner class is not a part of java.swing package
        //Scanner class is not a part of java.applet package
        //Scanner class is not a part of java.beans package
        //Scanner class is not a part of java.rmi package
        //Scanner class is not a part of java.xml package
        //Scanner class is not a part of java.nio package
        //Scanner class is not a part of java.time package
        //Scanner class is not a part of java.util.concurrent package
        //Scanner class is not a part of java.util.regex package
        //Scanner class is not a part of java.util.zip package
        //Scanner class is not a part of java.util.jar package
        //
    }
}
