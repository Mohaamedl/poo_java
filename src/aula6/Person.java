package aula6;

public class Person {
    protected String name;
    protected int cc;
    protected Date birthday;
    public Person(String name, int cc, Date birthday){
        try{
            this.name=name;
            this.cc=cc;
            this.birthday=birthday;
        }
        catch(Exception e){}


    
    }
    public Date getBirthday() {
        return birthday;
    }
    public int getCc() {
        return cc;
    }
    public String getName() {
        return name;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public void setCc(int cc) {
        this.cc = cc;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return String.format("%s:;%d:;%s:",name,cc,birthday);
    }
    
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null) return false;
        if(getClass()!=obj.getClass()) return false;
        Person outro = (Person) obj;
        if(!outro.name.equals(this.name) || outro.cc!=this.cc||!outro.birthday.equals(this.birthday)){
            return false;
        } 
        return true;
        
    }
    public int hashCode(){
        int hash = 3;
        hash = hash*53+ (name!=null? this.name.hashCode():0);
        hash = hash*53 + (birthday!=null ?this.birthday.hashCode() : 0);
        hash = hash*53 + cc/2;
        return hash;
    }



















}
