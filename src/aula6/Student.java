package aula6;

public class Student extends Person{
    protected int nMec;
    private static int nMecn=100;
    protected  Date joinDate;
    protected Date dateNow= new Date();
    public Student(String name,int cc, Date birthday,Date joinDate){
            this(name,cc,birthday);
            this.joinDate=joinDate;
    }
    public Student(String name, int cc, Date birthday){
        super(name,cc,birthday);
        this.nMec=nMecn++;
        this.joinDate=dateNow;
    }
    public static void setnMecn(int nMecn) {
        Student.nMecn = nMecn;
    }
    public void setBirthday(Date birthday) {
        super.setBirthday(birthday);
    }
    public void setCc(int cc) { 
        super.setCc(cc);
    }
    
    public void setName(String name) {
        super.setName(name);
    }
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
    //public void setNMec(int nMec) {
    //    this.nMec = nMec;
    //}
    public Date getBirthday() {
        return super.getBirthday();
    }
    public int getCc() { 
        return super.getCc();
    }
    public String getName() {
        return super.getName();
    }
    public Date getJoinDate() {
        return joinDate;
    }
    public int getNMec() {
        return nMec;
    }
    public static int getnMecn() {
        return nMecn;
    }
    public String toString(){
        return String.format("%s;CC:%d;Data nascimento:%s;Nºmec:%d;Data inscricao:%s",name,cc,birthday,nMec,joinDate);
    }
    












}