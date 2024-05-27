package oop.labor12;

public class Main {
    public static void main(String[] args) {
        Bac bac = new Bac("nevek1.txt");
        bac.readSubject("magyar");
        bac.readSubject("matek");
        bac.readSubject("roman");
        System.out.println("Average of all students: " + bac.calculateAverage());
        Student student1 = new Student(15987, "Jim", "Harper");
        student1.addMarks("magyar", 5);
        student1.addMarks("matek", 6);
        student1.addMarks("roman", 5);
        System.out.println(student1.getFirstName() + " " + student1.getLastName() + " " + "diak atlaga: " + student1.calculateAverage() );
        System.out.println("Number of students who passed: " + bac.countPassedStudents());
    }
}
