package oop.labor02;

import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    /*
    public static void main(String[] args){
        BankAccount account1 = new BankAccount("OTP00001");
        System.out.println(account1.getAccountnumber() + ": " + account1.getBalance());
        account1.deposit(1000);
        System.out.println(account1.getAccountnumber() + ": " + account1.getBalance());
        account1.withdraw(500);
        System.out.println(account1.getAccountnumber() + ": " + account1.getBalance());
        account1.withdraw(1000);
        System.out.println(account1.getAccountnumber() + ": " + account1.getBalance());
        BankAccount account2 = new BankAccount("OTP00002");
        System.out.println(account2.getAccountnumber() + ": " + account2.getBalance());
        account2.deposit(2000);
        System.out.println(account2.getAccountnumber() + ": " + account2.getBalance());
    }
     */

    /*
    public static void main(String[] args){
        Rectangle[] rectangles = new Rectangle[10];
        Random rand = new Random();
        for (int i = 0; i < rectangles.length; i++) {
            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10);
            rectangles[i] = new Rectangle(length, width);
        }
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println(i + "szelessege" + rectangles[i].getWidth());
            System.out.println(i + "hosszusaga" + rectangles[i].getLength());
            System.out.println(i + "terulete" + rectangles[i].area());
            System.out.println(i + "kerulete" + rectangles[i].perimeter());
        }
        int totalA = 0;
        for (int i = 0; i < rectangles.length; i++) {
            totalA += rectangles[i].area();
        }
        System.out.println("TOTAL: " + totalA);
    }
     */

    public static void main(String[] args){
        /*
        System.out.println(DateUtil.isValidDate(2000,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2000,2, 30) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 29) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 28) == true);
        System.out.println(DateUtil.isValidDate(-1900,2, 28) == false);
        System.out.println(DateUtil.isValidDate(0,2, 28) == false);
        System.out.println(DateUtil.isValidDate(2021,2, 29) == false);
        System.out.println(DateUtil.isValidDate(2020,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2020,1, 32) == false);
        System.out.println(DateUtil.isValidDate(2020,1, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,0, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,4, 31) == false);
        System.out.println(DateUtil.isValidDate(2020,1, 31) == true);
        */
        MyDate[] datum = new MyDate[1000];
        Random random = new Random();
        for (int i = 0; i < datum.length; i++) {
            int year = 1 + random.nextInt(9999);
            int month = 1 + random.nextInt(1000);
            int day = 1 + random.nextInt(100);
            datum[i] = new MyDate(year, month, day);
        }
        int count = 0;
        for (int i = 0; i < datum.length; i++) {
            if(DateUtil.isValidDate(datum[i].getYear(), datum[i].getMonth(), datum[i].getDay()) == true){
                System.out.println(datum[i]);
            }
            else{
                count++;
            }

        }
        System.out.println(count);
    }
}
