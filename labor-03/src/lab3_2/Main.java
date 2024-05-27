package lab3_2;

import lab3_1.BankAccount;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Silly", "Booth");
        Customer customer2 = new Customer("Temperance", "Brennan");
        for (int i = 1; i < 6; i++) {
            customer1.addAccount(new BankAccount("OTP0000" + i));
        }
        for (int i = 1; i < 10; i++) {
            customer2.addAccount(new BankAccount("OTP0000" + i));
        }
        System.out.println(customer1);
        System.out.println(customer2);
        Random random = new Random();
        for (int i = 1; i < 6; i++) {
            customer1.getAccount("OTP0000" + i).deposit(random.nextInt(1000));
        }
        System.out.println(customer1);
        for (int i = 1; i < 10; i++) {
            customer2.getAccount("OTP0000" + i).deposit(random.nextInt(1000));
        }
        System.out.println(customer2);
        customer1.closeAccount("OTP00001");
        customer2.closeAccount("OTP00009");
        System.out.println(customer1);
        System.out.println(customer2);



    }

}
