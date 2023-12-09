package aula7;

public class Quarto extends Alojamento {
    protected String tipo;
    public Quarto(String codigoAloj,String nomeAloj, String local,double precoNoite, double avaliacao, boolean disponibilidade,String tipo){
        super(codigoAloj, nomeAloj, local, precoNoite, avaliacao, disponibilidade);
        try{
            if(tipo.equalsIgnoreCase("sigle")||tipo.equalsIgnoreCase("double")||tipo.equalsIgnoreCase("twin")||tipo.equalsIgnoreCase("triple")){
                this.tipo=tipo;
            }
        }
        catch(Exception e){System.out.println("Informação invalida.");}
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    



    
}
