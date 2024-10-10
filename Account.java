package bank;

public class Account {

    private String accountHolder;
    private double balance;

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0 ) {
            balance += amount;
            System.out.println("Deposit: $" + amount + " to " + accountHolder);
        }else{
            System.out.println("Deposit failed. It should be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount < balance){
            balance -= amount;
            System.out.println("Withdraw: $" + amount + " to " + accountHolder);
        }else{
            System.out.println("Withdraw failed. It should be less or equal to your balance.");
        }
    }



}
