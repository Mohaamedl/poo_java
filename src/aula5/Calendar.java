package aula5;

public class Calendar {
    int firstWeekdayOfYear,year;

    public Calendar(int year,int firstWeekdayOfYear){
        this.firstWeekdayOfYear=firstWeekdayOfYear;
        this.year= year;
    }
    int getyear() { return year;}
    int getfirstWeekdayOfYear() { return firstWeekdayOfYear;}
    int firstWeekdayOfMonth(int month){
        int day=0;
        if (month==1) {
            day=firstWeekdayOfYear; 
        }
        else {
        for (int i = 1;i<month;i++){
            day+= Date.monthDays(i, year);
        }
        day =(day+firstWeekdayOfYear)%7;
        }
        if(day==0) day=7;
       
        return day;
    }
    String printMonth(int month){
        int day =firstWeekdayOfMonth(month);
        int[] days = { 1, 2, 3, 4, 5, 6, 7};
        String s = "";
        String[] months = { "", "January", "February", "March", "April",
        "May", "June", "July", "August", "September", "October", "November", "December" };
        System.out.println("---------CALENDAR---------");
        System.out.printf("      %s %d", months[month], year);
        System.out.println("\nSu  Mo  Tu  We  Th  Fr  Sa");
        for (int i = 0; i < 6; i++) { // first spaces
            if (day != days[i])
                s += "    ";
            else
                break;
        }
        System.out.print(s);
        for (int i = 1; i <= Date.monthDays(month, year); i++) {
            System.out.printf("%2d  ", i);
            if (day == 7) {
                System.out.println();
                day = 0;
            }
            day++;
        }
        return "finished";
    }
    public String toString(){
        for(int month=1;month<13;month++){
            printMonth(month);
            System.out.println();
            if(month==12) break;

        }
        return "f";
    }

        
    
}
