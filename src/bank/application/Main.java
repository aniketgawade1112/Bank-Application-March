package bank.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SBI.rateOfInterest = 7;
        HdfcBank.rateOfInterest = 6;

        SBI account1 = new SBI(100000, "123", "Aniket");

        SBI account2 = new SBI(150000,"456", "Sachin");

        HdfcBank account3 = new HdfcBank(150000,"789", "Shubham");



        // Wrong password
        int balance = account1.checkBalance("124");
        System.out.println("The balance for account1 is " + balance);

        // Right password check balance
        int balanceCheck = account1.checkBalance("123");
        System.out.println("The balance for account1 is " + balanceCheck);

        // Add money
        String bankMessage = account2.addMoney(50000);
        System.out.println(bankMessage);

        // Wrong password
        String message = account3.withdrawMoney(50000, "123");
        System.out.println(message);

        // right password
        String message1 = account3.withdrawMoney(50000, "789");
        System.out.println(message1);

        // SBI Account
        double interest = account1.calculateTotalInterest(20);
        System.out.println("The total interest you will get " +  interest);

        // HDFC Account
        double interest1 = account3.calculateTotalInterest(20);
        System.out.println("The total interest you will get " +  interest1);

        System.out.println("Make it dynamic");

        System.out.println("Welcome to SBI, please enter the details to create an account");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name : ");
        String name = sc.next();

        System.out.println("Enter Balance : ");
        int initialBalance = sc.nextInt();

        System.out.println("Enter Password : ");
        String password = sc.next();

        SBI sbiAccount = new SBI(initialBalance, password, name);

    }
}