package oop.labor05.model;

public class Student {
    private String ID;
    private String firstname;
    private String lastName;
    public Student(String ID, String firstName, String lastName){
        this.ID = ID;
        this.lastName = lastName;
        this.firstname = firstName;
    }
    public String getFirstName(){
        return firstname;
    }
    public String getID(){
        return ID;
    }
    public String getLastName(){
        return lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
