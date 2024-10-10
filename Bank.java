package bank;

import java.util.HashMap;
import java.util.Scanner;

public class Bank {
    private HashMap<String, Account> accounts = new HashMap<>();

    public void createAccount(String accountHolder, double initialDeposit){
        if(!accounts.containsKey(accountHolder)){
            Account account = new Account(accountHolder, initialDeposit);
            accounts.put(accountHolder, account);
            System.out.println("Account created successfully for " + accountHolder);
        }else{
            System.out.println("An account with this holder alredy exists.");
        }
    }

    public void deposit(String accountHolder, double amount){
        Account account = accounts.get(accountHolder);
        if (account != null){
            account.deposit(amount);
        }else{
            System.out.println("Account not found.");
        }
    }

    public void withdraw(String accountHolder, double amount){
        Account account = accounts.get(accountHolder);
        if(account != null){
            account.withdraw(amount);
        }else{
            System.out.println("Account not found.");
        }
    }

    public void showBalance(String accountHolder){
        Account account = accounts.get(accountHolder);
        if(account != null){
            System.out.println("Account: " + accountHolder +  ", Balance: $" + account.getBalance());
        }else{
            System.out.println("Account not found.");
        }
    }

}
