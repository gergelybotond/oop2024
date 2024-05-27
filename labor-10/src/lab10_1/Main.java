package lab10_1;

public class Main {
    public static void main(String[] args) {
        SortingDemo p1 = new SortingDemo("fruits.txt");
        System.out.println("Eredeti");
        p1.printFruits();
        System.out.println("Novekvo");
        p1.sortAlphabetically();
        p1.printFruits();
        System.out.println("Csokkeno");
        p1.sortReverseAlphabetically();
        p1.printFruits();
    }
}
