package lab10_3;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Company {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void printAll(PrintStream string) {
        for (Employee employee : employees) {
            string.println(employee);
        }
    }

    public void printManagers(PrintStream string) {
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                string.println(employee);
            }

        }
    }

    public int countTypes() {
        List<Class> classes = new ArrayList<>();
        for (Employee employee : employees) {
            if (!classes.contains(employee.getClass())) {
                classes.add(employee.getClass());
            }
        }
        return classes.size();
    }

    public void sortByComparator(Comparator<Employee> comparator){
        Collections.sort(employees, comparator);
    }
}
