package aula6;

public class Scholarship_Holder extends Student {

    private int monthlyAmount;

    public Scholarship_Holder(String name, int cc, Date birthday,int monthlyAmount) {
        super(name, cc, birthday);
        this.monthlyAmount=monthlyAmount;
    }
    
    public int getMonthlyAmount() {
        return monthlyAmount;
    }
    public void setMonthlyAmount(int monthlyAmount) {
        this.monthlyAmount = monthlyAmount;
    }
    public String toString(){
        return super.toString()+";  valor da bolsa: "+monthlyAmount;
        //String.format("%s;CC: %d;Data nascimento:%s;Nºmec: %d;Data inscrição: %s;Valor da bolsa: %d",
        //name,cc,birthday,nMec,joinDate,monthlyAmount);
    }






}
