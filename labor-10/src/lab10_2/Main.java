package lab10_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MyDate> dates = new ArrayList<>();
        dates.add(new MyDate(1994, 8, 16));
        dates.add(new MyDate(2024, 5, 1));
        dates.add(new MyDate(2000, 9, 2));
        dates.add(new MyDate(2010, 8, 11));
        dates.add(new MyDate(2012, 9, 6));
        Collections.sort(dates);
        for (MyDate date : dates){
            System.out.println(date);
        }
    }
}
