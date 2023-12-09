package aula5;

public class Date {
    int day,month,year;
    
    public  Date(int day,int month,int year){
        
        try{
        if(validDate(day,month,year)){
            this.day=day;
            this.month=month;
            this.year=year;
        }
        }
        catch(Exception e){}
        
    }
    public Date(){
        
    }

    void set(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    int getDay(){
        return day;
    }
    int getMonth(){
        return month;
    }
    int getYear(){
        return year;
    }
    void increment(Date date,int d,int m,int y){
        if(validDate(day+d,month+m,year+y)) date.set(day+d,month+m,year+y);
    }
    void decrement(Date date,int d,int m,int y){
        if(validDate(day-d,month-m,year-y)) date.set(day-d,month-m,year-y);
    }
    public String toString(){
        return String.format("%4d-%02d-%2d",year,month,day);
    }
    public static boolean validMonth(int month){
        boolean b = false;
        if (month>=1 && month<=12) b = true;
        return b;
    }
    public static int monthDays(int month,int year){
        int[] monthDayss = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (leapYear(year) && month==2) return 29;
        else return monthDayss[month];
    }
    public static Boolean leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 4 == 0 && year % 400 == 0 && year % 100 == 0) return true;
        else return false;
    }
    public static boolean validDate(int day,int month,int year){
        if(day>0 && day<=monthDays(month,year)) return true;
        else return false;
    }
    
}
