package com.sajan.scaler.nov.DAY4OOPS;

public class Person {
    private String name;
    private int age;
    private String address;
    private String phoneNumber;
    //getters and setters
   /* public String getName() {
        return name;
    }*/
    public void setName(String name) {
        this.name = name;
    }
    /*public int getAge() {
        return age;
    }*/
    public void setAge(int age) {
        this.age = age;
    }
   /* public String getAddress() {
        return address;
    }*/
    public void setAddress(String address) {
        this.address = address;
    }
   /* public String getPhoneNumber() {
        return phoneNumber;
    }*/
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    // method to display person details
    //main method
    public void displayDetails() {
        System.out.println("Person Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
    }
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(30);
        person.setAddress("123 Main St, Anytown, USA");
        person.setPhoneNumber("555-1234");
        person.displayDetails();

}}
