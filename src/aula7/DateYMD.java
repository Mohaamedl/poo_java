package aula7;

public class DateYMD extends Date implements Comparable<DateYMD>{
    int day, month ,year;
    public DateYMD(){
        super();
    }
    public DateYMD(int day,int month,int year){
        
        try{
        if(validDate(day,month,year)){
            this.day=day;
            this.month=month;
            this.year=year;
        }
        }
        catch(Exception e){}
        
    }
    public void set(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void increment(DateYMD date,int d,int m,int y){
        if(validDate(day+d,month+m,year+y)) date.set(day+d,month+m,year+y);
    }
    public void decrement(DateYMD date,int d,int m,int y){
        if(validDate(day-d,month-m,year-y)) date.set(day-d,month-m,year-y);
    }
    public String toString(){
        return String.format("%4d-%02d-%2d",year,month,day);
    }
    
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null) return false;
        if(getClass()!=obj.getClass()) return false;
        DateYMD outro = (DateYMD) obj;
        if(this.day!=outro.day||this.month!=outro.month||this.year!=outro.year) return false;
        return true;
    }
    public int hashCode() {
        int hash=3;
        hash=53*hash+ day;
        hash=53*hash+month;
        hash=53*hash+year;
        return hash;
        
        
    }
    public int compareTo(DateYMD o){
        if(year!=o.year) return year-o.year;
        else if (month!=o.month) return month-o.month;
        else if (day!=o.day) return day-o.day;
        return 0;
    }

    
}
