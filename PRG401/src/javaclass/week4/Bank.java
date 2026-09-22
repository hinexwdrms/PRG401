package javaclass.week4;

class BankAccount {

    private double balance = 0;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Bank {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(1000);
        account.withdraw(300);

        System.out.println("Balance: " + account.getBalance());
    }
}