package oop.labor11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Storage {
    private List<Product> products;
    public Storage(String fileName){
        products = new ArrayList<>();
        readProductsFromFile(fileName);
    }

    private void readProductsFromFile(String fileName){
        try(Scanner scanner = new Scanner(new File(fileName))){
            while(scanner.hasNextLine()){
                String[] data = scanner.nextLine().split("\\s+");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int amount = Integer.parseInt((data[2]));
                int price = Integer.parseInt(data[3]);
                Product product = new Product(id, name, amount, price);
                products.add(product);
            }
        }
        catch(FileNotFoundException e){
            System.err.println("File not found: " + e.getMessage());
        }
    }

    public int update(String fileName){
        int updateCounter = 0;
        try(Scanner scanner = new Scanner(new File(fileName))){
            while(scanner.hasNextLine()){
                String []data = scanner.nextLine().split("\\s+");
                int id = Integer.parseInt(data[0]);
                int newAmount = Integer.parseInt(data[1]);
                for (Product product : products){
                    if(product.getIdentifier() == id){
                        product.increaseAmount(newAmount);
                        updateCounter++;
                        break;
                    }
                }
            }
        }
        catch (FileNotFoundException e){
            System.err.println("File not found: " + e.getMessage());
        }
        return updateCounter;
    }

    public Product getProductById(int id){
        for (Product product : products){
            if(product.getIdentifier() == id){
                return product;
            }
        }
        return null;
    }
}
