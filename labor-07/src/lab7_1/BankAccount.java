package lab7_1;

public class BankAccount {
    protected String accountNumber = null;
    private static int numAccounts = 0;
    public static final int ACCOUNT_NUMBER_LENGTH = 10;
    protected double balance;
    public static final String PREFIX = "OTP";

    protected BankAccount() {
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
