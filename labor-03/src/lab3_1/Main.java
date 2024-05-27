package lab3_1;


public class Main {
    public static void main(String []args){
        Customer customer1 = new Customer("Charlie", "Harper");
        System.out.println(customer1);
        customer1.setAccount(new BankAccount("OTP00001"));
        System.out.println(customer1);
        customer1.getAccount().deposit(1000);
        System.out.println(customer1);
        customer1.getAccount().withdraw(269);
        System.out.println(customer1);
        Customer customer2 = new Customer("Mary", "Smith");
        customer2.setAccount(new BankAccount("OTP00002"));
        System.out.println(customer2);
        customer2.getAccount().deposit(555);
        System.out.println(customer2);
        customer2.getAccount().withdraw(600);
        System.out.println(customer2);
        customer2.closeAccount();
        System.out.println(customer2);
        customer2.setLastName("Harper");
        customer2.setAccount(new BankAccount("OTP00001"));
        System.out.println(customer1);
        System.out.println(customer2);


    }
}
