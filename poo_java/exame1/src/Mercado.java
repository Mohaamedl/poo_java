import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
            s = s +"\t"+ tenda.toString()+"\n";
        }


        return s;

    }
    
    public void add(Tenda tenda) {
        tendas.add(tenda);
    }
    public int totalItems() {
        int sum = 0;
        for(Tenda tenda : tendas){
            if (tenda.getClass().getName()=="Bar") {
                sum = sum + ((Bar) tenda).totalProdutos();

            }
            else sum = sum + ((Tasquinha) tenda).totalProdutos();
        }
        return sum;
    }
   
    public String[] getAllItems() {
        List<String> sum =new ArrayList<>();
        for(Tenda tenda : tendas){
            if (tenda.getClass().getName()=="Bar") {
                ((Bar) tenda).getLista().stream().map(s->s.getNome()).collect(Collectors.toList()).forEach(s->sum.add(s));

            }
            else  ((Tasquinha) tenda).getPratos().stream().collect(Collectors.toList()).forEach(s->sum.add(s));
        }
        return sum.toArray(new String[sum.size()]);
        
    }
    public Tenda[] tendas() {
        return this.tendas.toArray(new Tenda[this.tendas.size()]);
    }

}
