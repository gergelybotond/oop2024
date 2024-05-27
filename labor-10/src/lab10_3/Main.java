package lab10_3;

import lab10_2.MyDate;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("SapientiaAlp");
        company.hire(new Manager("Gergely", "Botond", 3500, new MyDate(2003, 12, 23), "HR"));
        company.hire(new Manager("Hadnagy", "Attila", 2000, new MyDate(2006, 8, 21), "Mobile"));
        company.hire(new Employee("Hadnagy", "Lorant", 2500, new MyDate(2005, 1, 3)));
        company.hire(new Employee("Csizmadia", "Laszlo", 1200, new MyDate(2006, 2, 5)));
        System.out.println("Eredeti sorrend: ");
        company.printAll(System.out);
        System.out.println("ABC sorrrend: ");
        company.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getLastName().equals(o2.getLastName())) {
                    return o1.getFirstName().compareTo(o2.getFirstName());
                }
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        company.printAll(System.out);
        System.out.println("Fizetes szerinti csokkeno sorrend: ");
        company.sortByComparator((Employee o1, Employee o2) -> {
            return Double.compare(o1.getSalary(), o2.getSalary());
        });
        company.printAll(System.out);
    }
}
