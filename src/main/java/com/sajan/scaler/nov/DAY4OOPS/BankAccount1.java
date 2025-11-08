package com.sajan.scaler.nov.DAY4OOPS;

import java.util.Scanner;

class BankAccount1 {
    private String holderName;
    private String accountNumber;
    private double balance;

    public BankAccount1(String holderName, String accountNumber, double balance){
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("\n✅ Successfully Deposited: " + amount);
        System.out.println("💰 Updated Balance: " + balance);
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("\n⚠️  Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("\n✅ Withdrawal Successful: " + amount);
            System.out.println("💰 Remaining Balance: " + balance);
        }
    }

    public double getBalance(){
        return balance;
    }
}

class Main {
    public static void printMenu(){
        System.out.println("\n-----------------------------------");
        System.out.println("         🏦 BANKING MENU");
        System.out.println("-----------------------------------");
        System.out.println("1️⃣  Deposit Amount");
        System.out.println("2️⃣  Withdraw Amount");
        System.out.println("3️⃣  Check Balance");
        System.out.println("4️⃣  Exit");
        System.out.println("-----------------------------------");
        System.out.print("👉 Enter your choice: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("       🏦 Welcome To Your Bank 🏦");
        System.out.println("===================================");

        System.out.print("👤 Enter Name: ");
        String name = sc.nextLine();
        System.out.print("🔢 Enter Account Number: ");
        String accNo = sc.nextLine();
        System.out.print("💰 Enter Initial Balance: ");
        double bal = sc.nextDouble();

        // ✅ Correct object creation
        BankAccount1 acc = new BankAccount1(name, accNo, bal);

        int choice;
        do {
            printMenu();
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("💵 Enter Deposit Amount: ");
                    double depAmt = sc.nextDouble();
                    acc.deposit(depAmt);
                    break;
                case 2:
                    System.out.print("💸 Enter Withdraw Amount: ");
                    double wAmt = sc.nextDouble();
                    acc.withdraw(wAmt);
                    break;
                case 3:
                    System.out.println("\n💰 Current Balance: " + acc.getBalance());
                    break;
                case 4:
                    System.out.println("\n🙏 Thank you for banking with us!");
                    break;
                default:
                    System.out.println("\n⚠️ Invalid choice! Please try again.");
            }

        } while(choice != 4);

        sc.close();
    }
}
