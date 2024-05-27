package lab3_2;

import lab3_1.BankAccount;

public class Customer {

    private String firstName;

    private String lastName;

    public static final int MAX_ACCOUNTS = 10;

    private int numAccounts;
    private BankAccount[] accounts = new BankAccount[MAX_ACCOUNTS];

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getNumAccounts(){
        return numAccounts;
    }
    public void addAccount(BankAccount newAccount){
        accounts[numAccounts] = newAccount;
        numAccounts++;

    }
    public BankAccount getAccount(String accountNumber){
        for (int i = 0; i < numAccounts; i++) {
            if(this.accounts[i].getAccountNumber().equals(accountNumber)){
                return this.accounts[i];
            }
        }
        return null;
    }
    public String getFirstName(){
        return firstName;
    }

    public String getLastname(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void closeAccount(String accountNumber){
        int indexToRemove = -1;
        for (int i = 0; i < numAccounts; i++) {
            if(this.accounts[i].getAccountNumber().equals(accountNumber)){
                indexToRemove = i;
                break;
            }
        }
        if(indexToRemove != -1){
            for (int i = indexToRemove; i < accounts.length - 1; i++) {
                accounts[i] = accounts[i + 1];
            }
            accounts[accounts.length - 1] = null;
            numAccounts--;
        }
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for (int i = 0; i < numAccounts; ++i) {
            result.append("\t" + accounts[i] + "\n");
        }
        return result.toString();
    }

}
