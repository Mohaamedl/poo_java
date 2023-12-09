package aula7;

public class Apartamento extends Alojamento {
    protected int tipologia;
    public Apartamento(String codigoAloj,String nomeAloj, String local,double precoNoite, double avaliacao, boolean disponibilidade, int tipologia){
        super(codigoAloj, nomeAloj, local, precoNoite, avaliacao, disponibilidade);
        try{
            if(tipologia>0 && tipologia <=200){
                this.tipologia=tipologia;
            }
        }
        catch(Exception e) {System.out.println("Informação invalida.");}
    }
    
    public String toString() {
        
        return super.toString()+ String.format("Tipologia: %s",tipologia);
    }
    public void setTipologia(int tipologia) {
        this.tipologia = tipologia;
    }

}
