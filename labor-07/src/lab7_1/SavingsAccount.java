package lab7_1;

public class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(double interestRate){
        super();
        this.interestRate = interestRate;
    }
    public double getInterestRate(){
        return this.interestRate;
    }
    public void setInterestRate(double amount){
        this.interestRate = amount;
    }
    public void addInterest(){
        interestRate = interestRate * balance;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                '}';
    }
}
