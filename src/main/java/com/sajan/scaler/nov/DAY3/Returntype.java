package com.sajan.scaler.nov.DAY3;

public class Returntype {
    //return type of method is int
    //explain me what is return type
    //return type is the type of value that a method will return to the caller
    //for example if a method is defined to return an int value then it will return an integer value to the caller
    //if a method is defined to return a String value then it will return a String value to the caller
    //if a method is defined to return void then it will not return any value to the caller
    //here is an example of a method with return type int
    //this method takes two integers as input and returns their sum
    //
    public static int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println("The sum of 5 and 10 is: " + result);
    }
    //In this example the method sum has a return type of int
    //it takes two integers as input and returns their sum as an integer value
    //in the main method we call the sum method and store the returned value in the variable result
    //then we print the result to the console
    //this is how return type works in Java
    //rules for return type:
    //1. the return type must match the type of value that the method returns
    //2. if the method has a return type other than void then it must have a return statement that returns a value of that type
    //3. if the method has a return type of void then it cannot have a return statement that returns a value
    //4. a method can have multiple return statements but only one of them will be executed when the method is called
    //5. the return type can be a primitive type or a reference type
    //6. the return type can also be an array or a collection type
    //7. the return type can also be a user-defined type such as a class or an interface
    //
}
