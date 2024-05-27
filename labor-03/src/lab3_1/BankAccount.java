package lab3_1;

public class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    public double getBalance(){
        return balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void deposit(double deposit){
        if(deposit > 0){
            balance += deposit;
        }
        else{
            System.out.println("ERROR");
        }
    }
    public boolean withdraw(double withdraw){
        if(withdraw > 0 && withdraw <= balance){
            balance = balance - withdraw;
            return true;
        }
        else{
            return false;
        }
    }
    public String toString(){
        return accountNumber + " egyenlege " + balance;
    }








}
