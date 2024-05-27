package oop.labor04.lab4_3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class MyArray {
    private int length;
    private double[] elements;

    public MyArray(int length) {
        this.length = length;
        this.elements = new double[length];
        Arrays.fill(elements, 0 );
    }

    public MyArray(double[] elements) {
        this.elements = elements;
    }

    public MyArray(MyArray array){
        this.length = array.length;
        this.elements = new double[length];
        System.arraycopy(array.elements, 0, this.elements, 0, array.length);
    }
    public MyArray(String fileName) {
        try {
            Scanner scanner = new Scanner(new File(fileName));
            length = scanner.nextInt();
            elements = new double[length];
            for (int i = 0; i < length; i++) {
                elements[i] = scanner.nextDouble();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    public void fillRandom(double start, double end){
        Random random = new Random();
        for (int i = 0; i < elements.length; i++) {
            elements[i] = random.nextDouble() * (end - start) + start;
        }
    }
    public double mean(){
        double sum = 0;
        for(double element : this.elements){
            sum += element;
        }
        return sum / this.elements.length;
    }
    public double stddev() {
        double mean = mean();

        double variance = Arrays.stream(elements)
                .map(x -> Math.pow(x - mean, 2))
                .sum() / length;

        return Math.sqrt(variance);
    }
    public void sort(){
        Arrays.sort(this.elements);
    }
    public void print(String label){
        StringBuilder sB = new StringBuilder();
        for (double element : this.elements){
            sB.append(String.format("%.2f", element)).append(", ");
        }
        String string = sB.substring(0, sB.length() - 2);
        System.out.println(label + ": " + string);
    }
}
