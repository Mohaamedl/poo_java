import java.util.ArrayList;
import java.util.List;

public class Mercado {
    public String nome;
    public String local;
    public List<Tenda> tendas = new ArrayList<>();
    public Mercado(String nome,String local){
        this.nome =  nome;
        this.local = local;
    }
    @Override
    public String toString() {
        String s = "Mercado \n";
        for(Tenda tenda : this.tendas){
            s = s + tenda.toString()+"\n";
        }


        return s;

    }
    
    public void add(Tenda tenda) {
        tendas.add(tenda);
    }
    public int totalItems() {
        return this.tendas.size();
    }
   
    public String[] getAllItems() {
        return new String[]{"fef","feef"};
    }
    public Tenda[] tendas() {
        return this.tendas.toArray(new Tenda[this.tendas.size()]);
    }

}
