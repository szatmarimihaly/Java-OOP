package bank;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){

    Bank bank = new Bank();
    Scanner sc = new Scanner(System.in);
    boolean running = true;

    System.out.println("--------------------------");
    System.out.println("Welcome to our Bank System");
    System.out.println("--------------------------\n");


    while (running){
        System.out.println("Options:");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Show Balance");
        System.out.println("5. EXIT");

        System.out.print("Option: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice){

            case 1: // create Account
                System.out.println("Enter the account holder name:");
                String accountHolder = sc.nextLine();
                System.out.println("Enter the account holder name:");
                double initialDeposit = sc.nextDouble();
                bank.createAccount(accountHolder, initialDeposit);
                break;

            case 2: // Deposit
                System.out.print("Enter account holder name: ");
                accountHolder = sc.nextLine();
                System.out.print("Enter deposit amount: ");
                double depositAmount = sc.nextDouble();
                bank.deposit(accountHolder, depositAmount);
                break;

            case 3: // Withdraw
                System.out.print("Enter account holder name: ");
                accountHolder = sc.nextLine();
                System.out.print("Enter withdrawal amount: ");
                double withdrawalAmount = sc.nextDouble();
                bank.withdraw(accountHolder, withdrawalAmount);
                break;

            case 4: // Show Balance
                System.out.print("Enter account holder name: ");
                accountHolder = sc.nextLine();
                bank.showBalance(accountHolder);
                break;

            case 5: // EXIT
                System.out.println("Thanks for choosing us!");
                System.out.println("System is turning off...");
                break;
        }



    }

    }

}
