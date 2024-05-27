package lab10_2;

import java.util.Collections;

public class MyDate implements Comparable<MyDate>{
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

    @Override
    public int compareTo(MyDate o) {
        if(this.year != o.year){
            return this.year - o.year;
        }
        if(this.month != o.month){
            return this.month - o.month;
        }
        if(this.day != o.day){
            return this.day - o.day;
        }
        return 0;
    }
}
