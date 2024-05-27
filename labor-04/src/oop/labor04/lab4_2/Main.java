package oop.labor04.lab4_2;

import oop.labor04.lab4_1.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }


    public static ArrayList<Person> readFromCSVFile(String fileName) {
        ArrayList<Customer> customers = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("lab4_2_input.csv"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (!line.isEmpty()) {
                    String[] parts = line.split(", ");
                    if (parts[0].equals("Customer")) {
                        String firstName = parts[1];
                        String lastName = parts[2];
                        Customer customer = new Customer(firstName, lastName);
                        customers.add(customer);
                    } else if (parts[0].equals("Account")) {
                        String accountNumber = parts[1];
                        double balance = Double.parseDouble(parts[2]);
                        if (!customers.isEmpty()) {
                            customers.get(customers.size() - 1).addAccount(new BankAccount(accountNumber, balance));
                        }
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }

        // Print details of each customer
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        return null;
    }
}
