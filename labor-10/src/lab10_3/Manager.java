package lab10_3;

import lab10_2.MyDate;

public class Manager extends Employee {
    private String department;

    public Manager(String lastName, String firstName, double salary, MyDate birthDate, String department) {
        super(lastName, firstName, salary, birthDate);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                super.toString() +
                " department='" + department + '\'' +
                '}';
    }
}
