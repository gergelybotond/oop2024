package oop.labor04.lab4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //readFilePrintItsLineNumbered("lab4_1_input.txt");
        ArrayList<Person> people = readFromCSVFile("lab4_1_input.csv");
//        System.out.println(people);
        for(Person person: people){
            System.out.println(person);
        }
    }

    public static void readFilePrintItsLineNumbered(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            int counter = 0;
            while (scanner.hasNextLine()) {
                counter++;
                String line = scanner.nextLine();
                System.out.println(counter + ". " + line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Person> readFromCSVFile(String fileName) {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.isEmpty()){
                    continue;
                }
                String[] items = line.split(",");
                String firstName = items[0].trim();
                String lastName = items[1].trim();
                int birthYear = Integer.parseInt(items[2].trim());
                persons.add(new Person(firstName, lastName, birthYear));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return persons;
    }
}
