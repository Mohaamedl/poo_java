import java.util.LinkedList;
import java.util.List;

public class Bar extends Tenda{
    public List<Bebida> bebidas = new LinkedList<Bebida>();
    public Bar(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public Bar(int id, String nome, List<Bebida> bebidas) {
        this.nome =  nome;
        this.id =id;
        this.bebidas = bebidas;
    }


    @Override
    public String toString() {
        return "bar";
    }
    public void add(Bebida bebida) {
        bebidas.add(bebida);
    }
    
    public List<Bebida> getLista() {
        return this.bebidas;
    }
    public String items() {
        String s = "";
        for (Bebida bebida : this.bebidas){
            s = s+"," +bebida.toString();
        }
        s =s.replaceFirst(",","[")+"]";
        return s;
    }
    public int totalProdutos() {
        return this.bebidas.size();
    }
    public String getNome() {
        return nome;
    }



    

}
