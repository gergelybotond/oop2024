package oop.labor06.lab6_1;

import java.sql.Array;
import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private final int id;
    private int counter = 0;
    private static int numCustomers = 0;
    private ArrayList<BankAccount> accounts = new ArrayList<>();
    public BankAccount getAccount(String accountNumber){
        for (BankAccount account : accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }
    public Customer(String firstName, String lastName) {
        this.id = counter++;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void addAccount(BankAccount account){
        accounts.add(account);
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", accounts=" + accounts +
                '}';
    }
    public void closeAccount(String accountNumber){
        for (BankAccount account : accounts){
            if(account.getAccountNumber().equals(accountNumber)) {
                accounts.remove(account);
                System.out.println(accountNumber + "closed");
                return;
            }
        }
        System.out.println(accountNumber + "not exist");
    }
    public int getId(){
        return id;
    }
    public ArrayList<String> getNumAccounts(){
        ArrayList<String> accountNumbers = new ArrayList<>();
        for (BankAccount account : accounts){
            accountNumbers.add(account.getAccountNumber());
        }
        return accountNumbers;
    }
}
