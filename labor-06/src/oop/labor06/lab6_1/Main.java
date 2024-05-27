package oop.labor06.lab6_1;

public class Main {
    public static void main(String[] args) {
        Bank OTP = new Bank("OTP");
        Customer customer1 = new Customer("John", "Smith");
        Customer customer2 = new Customer("Adrian", "Smith");
        OTP.addCustomer(customer1);
        OTP.addCustomer(customer2);
        customer1.addAccount(new BankAccount("0005"));
        customer2.addAccount(new BankAccount("0006"));
        if(customer1.getId() == 1){
            System.out.println(customer1);
        }
        if(customer2.getId() == 1){
            System.out.println(customer2);
        }
        OTP.getCustomer(0).getAccount("0005").deposit(1000);
        OTP.getCustomer(1).getAccount("0006").deposit(1000);
        if(customer1.getId() == 2){
            System.out.println(customer1);
        }
        if(customer2.getId() == 2){
            System.out.println(customer2);
        }
        
    }
}
