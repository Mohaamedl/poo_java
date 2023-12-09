package aula7;

public class Alojamento {
    protected String codigoAloj;
    public String nomeAloj, local;
    protected double precoNoite ,avalicao;
    public boolean disponibilidade;

    public Alojamento(String codigoAloj,String nomeAloj, String local,double precoNoite, double avaliacao, boolean disponibilidade){
        try {
            if (precoNoite>0 && avaliacao>=1 && avaliacao<=5){
                this.codigoAloj=codigoAloj;
                this.nomeAloj=nomeAloj;
                this.local=local;
                this.precoNoite=precoNoite;
                this.avalicao=avaliacao;
                this.disponibilidade=disponibilidade;

            }
        
        
        } 
        catch(Exception e) {
            System.out.println("Parametros invalidos.\nTente novamente");
        }

        
    }
    
    public double getAvalicao() {
        return avalicao;
    }
    public String getCodigoAloj() {
        return codigoAloj;
    }
    public String getLocal() {
        return local;
    }
    public String getNomeAloj() {
        return nomeAloj;
    }
    public double getPrecoNoite() {
        return precoNoite;
    }
    public void setAvalicao(double avalicao) {
        this.avalicao = avalicao;
    }
    public void setCodigoAloj(String codigoAloj) {
        this.codigoAloj = codigoAloj;
    }
    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public void setNomeAloj(String nomeAloj) {
        this.nomeAloj = nomeAloj;
    }

    public void setPrecoNoite(double precoNoite) {
        this.precoNoite = precoNoite;
    }
    @Override
    public String toString() {
        String d = disponibilidade ? "disponivel" : "indisponivel";
        return String.format("Alojamento: %s \ncodigo: %s\nLocal: %s\nPreço: %.2f $\nDisponibilidade: %s\nAvaliaçao: %.1f EStrelas\n",nomeAloj,codigoAloj,local,precoNoite,d,avalicao);
    }
    public void check_in(){
        this.disponibilidade=false;
    }
    public void check_out(){
        this.disponibilidade=true;
    }



}

