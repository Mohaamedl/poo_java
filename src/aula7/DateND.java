package aula7;
public class DateND extends Date implements Comparable<DateND>{
    protected  int disDate; //distancia em dias de 01-01-2000
    
    public int day,month,year;

    public DateND(int day, int month, int year){
        
        try{
            if(validDate(day,month,year)){
                this.day=day;
                this.month=month;
                this.year=year;
                this.disDate=daysCalc();
            }
        }
            catch(Exception e){}
    }
    public int getDisDate() {
        return disDate;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    
    
    public int daysCalc(){
        int d2 = 0;
        if (day!=0 && month!=0) {
            for (int i=1 ;i<month;i++){
                d2+=monthDays(i,this.year);
            }
        }
        int d3 = (year-2000)*365;

        return (day-1)+d2+d3;
    }
    public String toString(){
        return String.format("%4d-%02d-%2d, diferença:%d",year,month,day,disDate);
    }
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null) return false;
        if(getClass()!=obj.getClass()) return false;
        DateND outro = (DateND) obj;
        if(this.day!=outro.day||this.month!=outro.month||this.year!=outro.year ||this.disDate!=outro.disDate) return false;
        return true;
    }
    public int hashCode() {
        int hash=13;
        hash=53*hash+ day;
        hash=53*hash+month;
        hash=53*hash+year;
        hash=53*hash+disDate;
        return hash;
        
        
    }
    public int compareTo(DateND o){
        if(year!=o.year) return year-o.year;
        else if (month!=o.month) return month-o.month;
        else if (day!=o.day) return day-o.day;
        else if (disDate!=o.disDate) return disDate-o.disDate;
        return 0;
    }
  


    
    
}
