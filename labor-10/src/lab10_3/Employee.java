package lab10_3;

import lab10_2.MyDate;

public class Employee {
    private int ID;
    private String lastName;
    private String firstName;
    private double salary;
    private MyDate birthDate;
    private int counter;

    public Employee(String lastName, String firstName, double salary, MyDate birthDate) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public int getID() {
        return ID;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", salary=" + salary +
                ", birthDate=" + birthDate +
                ", counter=" + counter +
                '}';
    }
}
