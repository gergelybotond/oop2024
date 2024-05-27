package exercise2;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.DateTimeParseException;

public class StudentDataProcessor {

    public static void processStudentData(String inputFilePath, String outputFilePath, String warningFilePath) {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(inputFilePath));
             BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFilePath));
             BufferedWriter warningWriter = Files.newBufferedWriter(Paths.get(warningFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");

                if (tokens.length < 7) {
                    System.err.println("INCOMPLETE LINE: " + line);
                    continue;
                }

                String neptunId = tokens[0].trim();
                String firstName = tokens[1].trim();
                String lastName = tokens[2].trim();
                String creditsStr = tokens[3].trim();
                String birthYearStr = tokens[4].trim();
                String birthMonthStr = tokens[5].trim();
                String birthDayStr = tokens[6].trim();

                int credits;
                int birthYear;
                int birthMonth;
                int birthDay;

                try {
                    credits = Integer.parseInt(creditsStr);
                } catch (NumberFormatException e) {
                    System.err.println("NUMBER FORMAT EXCEPTION: " + line);
                    continue;
                }

                try {
                    birthYear = Integer.parseInt(birthYearStr);
                    birthMonth = Integer.parseInt(birthMonthStr);
                    birthDay = Integer.parseInt(birthDayStr);
                } catch (NumberFormatException e) {
                    System.err.println("NUMBER FORMAT EXCEPTION: " + line);
                    continue;
                }

                try {
                    LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
                } catch (DateTimeException e) {
                    System.err.println("INVALID DATE: " + line);
                    continue;
                }

                writer.write(line);
                writer.newLine();

                if (credits < 30) {
                    warningWriter.write(line);
                    warningWriter.newLine();
                }
            }
        } catch (NoSuchFileException e) {
            System.err.println("FILE NOT FOUND: " + inputFilePath);
        } catch (IOException e) {
            System.err.println("ERROR READING OR WRITING FILE: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String inputFilePath = "students.csv";
        String outputFilePath = "output.csv";
        String warningFilePath = "warning.csv";

        processStudentData(inputFilePath, outputFilePath, warningFilePath);
    }
}


