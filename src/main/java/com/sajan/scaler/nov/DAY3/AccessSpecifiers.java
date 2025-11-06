package com.sajan.scaler.nov.DAY3;

public class AccessSpecifiers {
    // public access specifier
    // accessible from any other class
    // within the same package or different package
    // example: java.lang.String class
    // public String name;
    public String name;
    // private access specifier
    // accessible only within the same class
    // example: java.lang.String class
    private int age;
    // protected access specifier
    // accessible within the same package and subclasses in different packages
    protected String address;
    // default access specifier (no modifier)
    // accessible only within the same package
    String phoneNumber;
    // constructor
    public AccessSpecifiers(String name, int age, String address, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    // method to display user details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
    }
    // main method
    public static void main(String[] args) {
        AccessSpecifiers user = new AccessSpecifiers("Sajan", 24, "123 Main St", "555-1234");
        user.displayDetails();
    }
    // getters and setters for private variable age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // end of class
    //
}
