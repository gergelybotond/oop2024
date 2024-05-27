package oop.labor02;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public MyDate(int year, int month, int day){
        if(DateUtil.isValidDate(year, month, day)){
            this.year = year;
            this.month = month;
            this.day = day;
        }
        else{
            System.out.println("invalid date");
        }
    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public String toString(){
        return "year " + year + " month " + month + " day " + day;
    }
}
