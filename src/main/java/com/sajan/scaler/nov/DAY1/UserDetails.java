package com.sajan.scaler.nov.DAY1;

import java.util.Scanner;

public class UserDetails {
    public static void main(String[] args) {
        System.out.println("User Details Class");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Hello " + name + ", you are " + age + " years old.");
        sc.close();
    }
}
