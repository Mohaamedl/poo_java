package G4;

public class Imovel {

    protected static int idi =1000;
    protected int id;
    protected int nQuartos;
    protected String  localidade;
    protected double preco;
    protected boolean disp;
    protected String datai=null;
    protected String dataf=null;

    // inicialização
    public Imovel(String localidade,int nQuartos, double preco){
        this.localidade = localidade;
        this.nQuartos = nQuartos;
        this.preco = preco;
        this.disp = true;
        this.id = Imovel.idi;
        Imovel.idi++;
    }
    
   public boolean getDisp() {
       return disp;
   }
    public int getId() {
        return id;
    }
    public int getnQuartos() {
        return nQuartos;
    }
    public void setDisp(boolean disp) {
        this.disp = disp;
    }
    // metodos
    public void leiluar(String d1,int dias){
        this.datai = d1;
        this.dataf =  "por " + dias + " dias";
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }
        if (!(obj instanceof Imovel)) return false;
        
        final Imovel other = (Imovel) obj;
        if(other.id != this.id || !other.localidade.equals(this.localidade) || this.nQuartos != other.nQuartos || this.preco!=other.preco){
            return false;
        }
        return true;
    }


    @Override
    public int hashCode() {
        
        final int prime = 31;
        int hash = super.hashCode()*prime + 7;
        hash = prime * hash + (int) ((int) preco ^ ((int) preco >>>32)) ;
        hash = prime * hash +  id;
        hash = prime * hash +  nQuartos;
        hash = prime * hash + (localidade==null? 0 : localidade.hashCode());
        hash = prime * hash + (disp? 0 : localidade.hashCode());

        return hash;
    }
    








    // rescrita de metodos
    @Override
    public String toString() {
        return String.format("Imovel %d ; quartos: %d ; localidade:%s  ; preço: %.2f ; disponivel: "
        ,this.id,this.nQuartos
        ,this.localidade,this.preco) 
        + (this.disp? "sim ":"não ")
        +((this.datai==null || this.dataf==null) ? "":"Leilão" +this.datai+" : " +this.dataf )
        ;
    }









    public static void main(String[] args) {
        Imovel t1 = new Imovel("ddedd",3,23452);
        Imovel t2 = new Imovel("dded6d",3,23452);
        Imovel t3 = new Imovel("ddedd",3,23452);
        Imovel t4 = new Imovel("dded6d",3,23452);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);

    }
}
