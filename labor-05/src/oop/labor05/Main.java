package oop.labor05;
import oop.labor02.MyDate;
import oop.labor05.model.Course;
import oop.labor05.model.Student;
import oop.labor05.model.Training;

import java.io.FileNotFoundException;
import java.io.File;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Course> courses = readCourses("courses.csv");
        for(Course person : courses){
            System.out.println(person);
        }
        System.out.println("\n");
        ArrayList<Student> students = readStudents("students.csv");
        for(Student person : students){
            System.out.println(person);
        }
        ArrayList<Training> trainings = new ArrayList<>();
        for (Training person : trainings){

        }

    }

    public static ArrayList<Course> readCourses(String filename){
        ArrayList<Course> courses = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File(filename))){
            String line = scanner.nextLine();
            while(scanner.hasNextLine()){
                line = scanner.nextLine();
                String[] tokens = line.split(", ");
                String name = tokens[0].trim();
                String description = tokens[1].trim();
                int numHours = Integer.parseInt(tokens[2].trim());
                Course course = new Course(name, description, numHours);
                courses.add(course);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return courses;
    }

    public static ArrayList<Student> readStudents(String filename){
        ArrayList<Student> students = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))){
            String line = scanner.nextLine();
            while(scanner.hasNextLine()){
                line = scanner.nextLine();
                String[] tokens = line.split(",");
                String ID = tokens[0].trim();
                String firstName = tokens[1].trim();
                String lastName = tokens[2].trim();
                Student student = new Student(ID, firstName, lastName);
                students.add(student);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return students;
    }

    private static Training createTraining(Course course, ArrayList<Student> students, int price){
        MyDate startDate = new MyDate(2023,03,21);
        MyDate endDate = new MyDate(2023,03,25);
        Training training = new Training(course, startDate, endDate, price);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(students.size());
            Student student = students.get(index);
            training.enroll(student);
        }
        return training;
    }
}
