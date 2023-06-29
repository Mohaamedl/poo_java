package G4;
import java.util.ArrayList;
import java.util.List;
public class RealState {
    List<Imovel> listaimoveis;
    public RealState(){
        this.listaimoveis = new ArrayList<Imovel>();

    }
    @Override
    public String toString() {
        String s="Propriedades: \n";
        for (Imovel imovel : this.listaimoveis){
            s = s+imovel.toString()+"\n";
        }
        return s;
    }




    public void setAuction(int i, String data, int dias) {
        ArrayList<Integer> ids = new ArrayList<>();
        for (Imovel imovel : this.listaimoveis){
            ids.add(imovel.getId());
            if (i==imovel.getId() && imovel.getDisp() ==true){
                imovel.leiluar(data,dias);
            }
            else if(i==imovel.getId()){
                System.out.println("imovel " + i + " nao disponivel");
            }

            
            

        }
        if (!ids.contains(i)){
            System.out.println("Imovel "+i+" nao existe!");
        }
    }
    public void newProperty(String localidade, int nQuartos, double preco) {
        listaimoveis.add(new Imovel(localidade,nQuartos,preco));
    }
    public void sell(int id) {
        for (Imovel imovel : listaimoveis){
            if (id==imovel.getId()){
                imovel.setDisp(false);
            }

        }
    }
   
}
