package oop.labor05.model;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import oop.labor02.MyDate;

public class Training {
    private Course course;
    private MyDate startDate;
    private MyDate endDate;
    private double pricePerStudent;
    private ArrayList<Student> enrolledStudents;
    public Training(Course course, MyDate startDate, MyDate endDate, double pricePerStudent){
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
    }
    public boolean enroll(Student student){
        enrolledStudents.add(student);
        return true;
    }
    public Student findStudentById(String ID){
        for(Student student : enrolledStudents){
            if(student.getID().equals(ID)){
                return student;
            }
        }
        return null;
    }
    public Course getCourse(){
        return course;
    }
    public int numEnrolled(){
        return enrolledStudents.size();
    }
    public void printToFile(){
        try(PrintStream ps = new PrintStream("enrolledStudents.csv")){
            System.out.println(enrolledStudents);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public void unEnroll(String ID){
        for (Student student : enrolledStudents){
            if(student.getID().equals(ID)){
                enrolledStudents.remove(student);
            }
        }
        System.out.println("Not found");
    }

    @Override
    public String toString() {
        return "Training{" +
                "course=" + course +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", pricePerStudent=" + pricePerStudent +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }
}
