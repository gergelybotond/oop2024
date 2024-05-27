package lab10_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortingDemo {
    private List<String> fruits = new ArrayList<>();
    public SortingDemo(String fileName){
        try(Scanner scanner = new Scanner(new File(fileName))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
                fruits.add(line);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public void printFruits(){
        System.out.println(fruits);
    }
    public void sortAlphabetically(){
        Collections.sort(fruits);
    }
    public void sortReverseAlphabetically(){
        Collections.sort(fruits, Collections.reverseOrder());
    }
}

