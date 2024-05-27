package oop.labor12;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private Map<String, Double> marks = new HashMap<>();
    private double average;

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAverage() {
        return average;
    }
    public void addMarks(String subject, double grade){
        marks.put(subject, grade);
    }

    public double calculateAverage(){
        double sum = 0;
        for (Double grade : marks.values()){
            sum += grade;
        }
        if(marks.size() > 0){
            return sum / marks.size();
        }
        else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", marks=" + marks +
                ", average=" + average +
                '}';
    }
}
