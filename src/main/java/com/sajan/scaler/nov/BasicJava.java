package com.sajan.scaler.nov;
//📘 Java Basics – Structure Learn:
// • Hello World Program • main() method •
// Compilation steps • Comments,
// Naming conventions explain this in short way//

public class BasicJava {
    int age = 24;
    double salary = 55000.5;
    char grade = 'A';
    boolean isJavaFun = true;
    String name = "Sajan";
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        BasicJava obj = new BasicJava();
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
        System.out.println("Salary: " + obj.salary);
        System.out.println("Grade: " + obj.grade);
        System.out.println("Is Java Fun? " + obj.isJavaFun);
    }


}
