package lab7_1;

public class CheckingAccount extends BankAccount{
    private double overdraftLimit;
    public CheckingAccount(double overdraftLimit){
        super();
        this.overdraftLimit = overdraftLimit;
    }
    public double getOverdraftLimit(){
        return this.overdraftLimit;
    }
    public void setOverdraftLimit(double amount){
        this.overdraftLimit = amount;
    }
    public boolean withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "overdraftLimit=" + overdraftLimit +
                '}';
    }
}
