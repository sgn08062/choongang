package day05;

public class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount){
        this.balance += amount;
    }

    void withdraw(double amount){
        this.balance -= amount;
    }

    double getBalance(){
        return balance;
    }
}
