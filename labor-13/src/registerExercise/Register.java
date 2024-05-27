package registerExercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Register {
    private Map<String, Data> people = new TreeMap<>();

    public Register(String filename) {
        processData(filename);
    }

        private void processData (String filename){
            try (Scanner scanner = new Scanner(new File(filename))) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.isEmpty()) {
                        break;
                    }
                    String[] items = line.split(" ");
                    String name = items[0];
                    int deathYear = Integer.parseInt(items[1]);
                    Data d = this.people.get(name);
                    if (d != null) {
                        d.setdYear(deathYear);
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    public void printData(){
        for (Map.Entry<String, Data> entry : this.people.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
