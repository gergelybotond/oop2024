package oop.labor02;

public class BankAccount {
    private String accountnumber;

    private double balance;

    public BankAccount(String accountnumber){
        this.accountnumber = accountnumber;
        this.balance = 0;
    }
    public double getBalance(){
        return balance;
    }
    public String getAccountnumber(){
        return accountnumber;
    }
    public void deposit(double deposit){
        if(deposit < 0){
            System.out.println("NO MONEY");
        }
        else {
            balance += deposit;
        }
    }
    public boolean withdraw(double withdraw){
        if(withdraw < 0 || withdraw > balance){
            System.out.println("NO MONEY");
            return false;
        }
        else{
            balance = balance - withdraw;
            return true;
        }
    }
}

