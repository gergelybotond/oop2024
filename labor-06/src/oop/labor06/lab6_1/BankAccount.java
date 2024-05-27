package oop.labor06.lab6_1;

public class BankAccount {
    private final String accountNumber;
    private static int numAccounts = 0;
    public static final int ACCOUNT_NUMBER_LENGTH = 10;
    private double balance;
    public static final String PREFIX = "OTP";

    public BankAccount(String accountNumber) {
        ++numAccounts;
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    private static String createAccountNumber(){
        return PREFIX + String.format("%07d", numAccounts);
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
    public boolean withdraw(double amount){
        if(amount <= balance){
            balance = balance - amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
