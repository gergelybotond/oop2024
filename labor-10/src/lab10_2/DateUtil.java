package lab10_2;

public class DateUtil {
    public static boolean leapYear(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isValidDate(int year, int month, int day){
        int array[] = {31, leapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(year <= 0){
            return false;
        }
        if(month < 1 || month > 12){
            return false;
        }
        if(day < 1 || day > array[month - 1]){
            return false;
        }
        return true;
    }




}
