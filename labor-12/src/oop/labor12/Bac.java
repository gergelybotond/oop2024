package oop.labor12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bac {
    private Map<Integer, Student> students = new HashMap<>();
    public Bac(String fileName){
        try(Scanner scanner = new Scanner(new File(fileName))) {
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] elements = line.split(" ");
                int id = Integer.parseInt(elements[0]);
                Student student = new Student(id, elements[1].trim(), elements[2].trim());
                students.put(id, student);
            }
            System.out.println(students);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void readSubject(String subject){
        try(Scanner scanner = new Scanner(new File(subject + ".txt"))){
           while(scanner.hasNextLine()) {
               String line = scanner.nextLine();
               String[] elements = line.split(" ");
               int id = Integer.parseInt(elements[0].trim());
               double grade = Double.parseDouble(elements[1].trim());
               Student student = students.get(id);
               if (student == null) {
                   System.out.println("ID DOES NOT EXIST: " + id);
                   continue;
               }
               student.addMarks(subject, grade);
           }
            System.out.println(students);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public double calculateAverage(){
        double sum = 0;
        int count = 0;
        for (Student student : students.values()){
            double studentAverage = student.calculateAverage();
            if(studentAverage > 0){
                sum += studentAverage;
                count ++;
            }
        }
        if(count > 0){
            return sum / count;
        }
        else{
            return 0;
        }
    }
    public int countPassedStudents(){
        int counter = 0;
        for (Student student : students.values()){
            if(student.calculateAverage() >= 6){
                counter++;
            }
        }
        return counter;
    }
}
