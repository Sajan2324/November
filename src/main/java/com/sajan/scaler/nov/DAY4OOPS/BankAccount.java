package com.sajan.scaler.nov.DAY4OOPS;

import java.util.Scanner;

class BankAccount {
    private String holderName;
    private String accountNumber;
    private double balance;

    public BankAccount(String holderName, String accountNumber, double balance) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining Balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        BankAccount acc = new BankAccount(name, accNo, bal);

        int choice;
        do {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount: ");
                double amt = sc.nextDouble();
                acc.deposit(amt);
            } else if (choice == 2) {
                System.out.print("Enter amount: ");
                double amt = sc.nextDouble();
                acc.withdraw(amt);
            } else if (choice == 3) {
                System.out.println("Current Balance: " + acc.getBalance());
            }

        } while (choice != 4);

        System.out.println("Thank you for banking with us!");
        sc.close();
    }

}

