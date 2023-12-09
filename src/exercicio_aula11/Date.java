package exercicio_aula11;

public abstract  class Date {
    
    public Date(){  
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
